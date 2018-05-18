package util;

import enums.DiaEnum;
import enums.MotivoEnum;
import enums.TipoDocumentoMovEnum;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import modelo.Parametro;
import modelo.TipoDocumentoMov;

/**
 *
 * @author nazav
 */
public class SistemaClinicoUtil {

    private static final int REACHABLE_TIMEOUT = 5000;
    private static final Character GUION_BAJO = '_';
    private static final String EXTENCION_TXT = ".txt";
    public static final Character ESPACIO = ' ';
    public static final Character COMA = ',';
    public static final Character PUNTO = '.';

    private static final String[] NUMEROS_ORDINALES = {"Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto",
        "Septimo"};

    public static String obtenerNombreNodo() {
        return System.getProperty("jboss.node.name").trim();
    }

    public static Timestamp obtenerFechaHoraActual() {
        java.util.Date date = new java.util.Date();
        Timestamp timeStampTransaction = new Timestamp(date.getTime());
        return timeStampTransaction;
    }

    public static Timestamp obtenerFechaActual() {
        Calendar date = new GregorianCalendar();
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        return new Timestamp(date.getTime().getTime());
    }

    public static Timestamp agregarDias(Timestamp date, int days) {
        Timestamp temporalDate = date;
        Calendar cal = Calendar.getInstance();
        cal.setTime(temporalDate);
        // if the days are negative then it can substract the number of days.
        cal.add(Calendar.DAY_OF_WEEK, days);
        Timestamp finalDate = new Timestamp(cal.getTime().getTime());
        return finalDate;
    }

    public static Date agregarDias(Date date, int days) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(date.getTime()));

        cal.add(Calendar.DAY_OF_WEEK, days);
        Timestamp finalDate = new Timestamp(cal.getTime().getTime());
        return new Date(finalDate.getTime());
    }

    public static String cadenasSeparadasPorComas(String[] cadenas) {
        StringBuilder result = new StringBuilder();
        String glue = ",";
        for (String cadena : cadenas) {
            result.append(glue).append(cadena);
        }
        if (result.length() > 0) {
            result.delete(0, glue.length());
        }
        return result.toString();
    }

    public static String cadenasSeparadasPorComas(List<String> cadenas) {
        StringBuilder result = new StringBuilder();
        String glue = ",";
        for (String cadena : cadenas) {
            result.append(glue).append(cadena);
        }
        if (result.length() > 0) {
            result.delete(0, glue.length());
        }
        return result.toString();
    }

    public static String completarNumeroConCeros(Integer len, Integer value) {
        return String.format("%0" + len + "d", value);
    }

    public static String completarNumeroConCeros(Integer len, Long value) {
        return String.format("%0" + len + "d", value);
    }

    public static String completarCadenaConEspacios(Integer len, String value) {
        return String.format("%1$" + len + "s", value);
    }

    public static String completarCadenaConEspaciosDere(Integer len, String value) {
        return String.format("%1$-" + len + "s", value);
    }

    public static String getDiasTranscurridos(Date desde, Date hasta) {
        return ((hasta.getTime()) - desde.getTime()) / (24 * 60 * 60 * 1000) + "";
    }

    public static Long getDiasTranscurridos(Timestamp desde, Timestamp hasta) {
        Timestamp d1, d2;
        d1 = SistemaClinicoUtil.obtenerInicioDia(desde);
        d2 = SistemaClinicoUtil.obtenerInicioDia(hasta);
        return ((d2.getTime()) - d1.getTime()) / (24 * 60 * 60 * 1000);
    }

    public static String diferenciaFechas(Timestamp desde, Timestamp hasta) {
        String salida;

        // conseguir la representacion de la fecha en milisegundos
        long milis1 = desde.getTime();
        long milis2 = hasta.getTime();

        // calcular la diferencia en milisengundos
        long diff = milis2 - milis1;

        // calcular la diferencia en horas
        long diffHours = diff / (60 * 60 * 1000);

        // calcular la diferencia en dias
        long diffDays = diff / (24 * 60 * 60 * 1000);

        salida = diffDays + " dia(s) y " + (diffHours % 24) + " hora(s)";
        return salida;
    }

    public static String obtenerFormatoFecha(Timestamp Fecha) {
        String fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").format(Fecha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public static String obtenerFechaActualFormato(String formato) {
        return formtDate(obtenerFechaActual(), formato, Boolean.FALSE, null);
    }

    public static String obtenerFormatoHora24(Timestamp Fecha) {
        String fecha = null;
        try {
            fecha = new SimpleDateFormat("HH:mm").format(Fecha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public static Date parsearHora24(String Fecha) {
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("HH:mm").parse(Fecha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public static String obtenerFormatoHoraActual24() {
        Timestamp Fecha = obtenerFechaHoraActual();
        String fecha = null;
        try {
            fecha = new SimpleDateFormat("HH:mm").format(Fecha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fecha;
    }

    public static String encriptarAMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes("UTF-8"));
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32
            // chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (UnsupportedEncodingException e) {
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static Date getFechaMesAtras() {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());

        calendar.add(Calendar.DAY_OF_YEAR, -calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();
    }

    public static boolean isNumber(String cadena) {
        boolean isDecimal = false;
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        int i = 0;
        if (cadena.charAt(0) == '-') {
            if (cadena.length() > 1) {
                i++;
            } else {
                return false;
            }
        }
        for (; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                if (!isDecimal && (cadena.charAt(i) != '.' || cadena.charAt(i) != ',')) {
                    isDecimal = true;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean cadenaEsNumero(String cadena) {
        try {
            Double.valueOf(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isFechaValida(Date fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(formatoFecha.format(fecha));
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static Timestamp convertirStringToDate(String fechaCadena) throws ParseException, IllegalArgumentException {
        Timestamp fecha = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = simpleDateFormat.parse(fechaCadena);
            fecha = new Timestamp(date.getTime());
        } catch (ParseException e) {
            throw e;
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return fecha;
    }

    public static byte[] convertirPdfAByteArray(String rutaArchivo) {

        InputStream inputStream = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {

            inputStream = new FileInputStream(rutaArchivo);

            byte[] buffer = new byte[1024];
            baos = new ByteArrayOutputStream();

            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return baos.toByteArray();
    }

    public static Timestamp obtenerInicioDia(Timestamp fecha) {
        Calendar cal;
        cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.set(Calendar.HOUR_OF_DAY, cal.getActualMinimum(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE, cal.getActualMinimum(Calendar.MINUTE));
        cal.set(Calendar.MILLISECOND, cal.getActualMinimum(Calendar.MILLISECOND));
        cal.set(Calendar.SECOND, cal.getActualMinimum(Calendar.SECOND));
        return new Timestamp(cal.getTimeInMillis());
    }

    public static Timestamp obtenerInicioMes(Timestamp fecha) {
        Calendar cal;
        cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.set(Calendar.HOUR_OF_DAY, cal.getActualMinimum(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE, cal.getActualMinimum(Calendar.MINUTE));
        cal.set(Calendar.MILLISECOND, cal.getActualMinimum(Calendar.MILLISECOND));
        cal.set(Calendar.SECOND, cal.getActualMinimum(Calendar.SECOND));
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return new Timestamp(cal.getTimeInMillis());
    }

    public static String obtenerTipoExpediente(Integer tipo) {
        return tipo == 1 ? "Interno" : "Externo";
    }

    public static Integer obtenerNumeroDeDiaDeSemana(Timestamp fecha) {
        Calendar calendar;

        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fecha.getTime());
        return corregirDiaDeSemana(calendar.get(Calendar.DAY_OF_WEEK));
    }

    public static Integer corregirDiaDeSemana(Integer diaDeSemana) {
        Integer dia;
        dia = 0;
        switch (diaDeSemana) {
            case Calendar.SUNDAY:
                dia = DiaEnum.DOMINGO.getValor();
                break;
            case Calendar.MONDAY:
                dia = DiaEnum.LUNES.getValor();
                break;
            case Calendar.TUESDAY:
                dia = DiaEnum.MARTES.getValor();
                break;
            case Calendar.WEDNESDAY:
                dia = DiaEnum.MIERCOLES.getValor();
                break;
            case Calendar.THURSDAY:
                dia = DiaEnum.JUEVES.getValor();
                break;
            case Calendar.FRIDAY:
                dia = DiaEnum.VIERNES.getValor();
                break;
            case Calendar.SATURDAY:
                dia = DiaEnum.SABADO.getValor();
                break;
        }
        return dia;
    }

    public static Integer obtenerAnioActual() {
        Calendar calendar;
        calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public static Integer obtenerMesActual() {
        Calendar calendar;
        calendar = Calendar.getInstance();
        return (calendar.get(Calendar.MONTH) + 1);
    }

    public static String obtenerExtensionDeNombreDeArchivo(String nombreDeArchivo) {
        String extension;
        int indice;
        indice = nombreDeArchivo.lastIndexOf(".");
        if (indice >= 0 && !nombreDeArchivo.isEmpty()) {
            extension = nombreDeArchivo.substring(indice, nombreDeArchivo.length());
        } else {
            extension = "";
        }
        return extension;
    }

    public static String obtenerNombreDeArchivoSinExtension(String nombreDeArchivo) {
        String nombreArchivo;
        int indicePunto;
        indicePunto = nombreDeArchivo.lastIndexOf(".");
        if (!nombreDeArchivo.isEmpty() && indicePunto >= 0) {
            nombreArchivo = nombreDeArchivo.substring(0, indicePunto);
        } else {
            nombreArchivo = nombreDeArchivo;
        }
        return nombreArchivo;
    }

    public static String truncarCadena(String cadena, Integer maxLength) {
        return cadena.substring(0, Math.min(maxLength, cadena.length()));
    }

    public static String obtenerFechaHoraActualFormato() {
        Timestamp ahora = obtenerFechaHoraActual();
        SimpleDateFormat format;
        format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return format.format(new Date(ahora.getTime()));
    }

    public static String obtenerAnioDeFecha(Timestamp fecha) {
        Calendar c;
        c = Calendar.getInstance();
        c.setTimeInMillis(fecha.getTime());
        return c.get(Calendar.YEAR) + "";

    }

    public static Timestamp convertirStringTimestamp(String fechaHoraCadena) {
        Timestamp fechaHora = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date parsedDate = dateFormat.parse(fechaHoraCadena);
            fechaHora = new java.sql.Timestamp(parsedDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fechaHora;
    }

    public static String obtenerNumeroOrdinal(Integer numero) {
        if (numero < 0 || numero > NUMEROS_ORDINALES.length) {
            return "";
        }
        return NUMEROS_ORDINALES[numero - 1];
    }

    public static Timestamp addTimeToTimestamp(Timestamp timestamp, Time time) {
        Calendar horas, fechas;
        horas = Calendar.getInstance();
        fechas = Calendar.getInstance();

        horas.setTimeInMillis(time.getTime());
        fechas.setTimeInMillis(timestamp.getTime());

        fechas.add(Calendar.HOUR_OF_DAY, horas.get(Calendar.HOUR_OF_DAY));
        fechas.add(Calendar.MINUTE, horas.get(Calendar.MINUTE));
        fechas.add(Calendar.SECOND, horas.get(Calendar.SECOND));
        fechas.add(Calendar.MILLISECOND, horas.get(Calendar.MILLISECOND));

        return new Timestamp(fechas.getTimeInMillis());
    }

    public static Integer obtenerDiaDeFecha(Timestamp fecha) {
        Calendar c;
        c = Calendar.getInstance();
        c.setTimeInMillis(fecha.getTime());
        return c.get(Calendar.DATE);
    }

    public static Integer obtenerMesDeFecha(Timestamp fecha) {
        Calendar c;
        c = Calendar.getInstance();
        c.setTimeInMillis(fecha.getTime());
        return c.get(Calendar.MONTH) + 1;
    }

    public static Integer obtenerAnioIntDeFecha(Timestamp fecha) {
        Calendar c;
        c = Calendar.getInstance();
        c.setTimeInMillis(fecha.getTime());
        return c.get(Calendar.YEAR);
    }

    public static BigDecimal redondearBigDecimal(BigDecimal valor, Integer precision) {
        return valor.setScale(precision, BigDecimal.ROUND_HALF_UP);
    }

    public static Boolean esCadenaValida(String cadena) {
        return (cadena != null && !cadena.isEmpty());
    }

    public static Boolean esNoNulo(Object o) {
        return o != null;
    }

    public static Boolean esNulo(Object o) {
        return o == null;
    }

    public static Boolean esNoNuloYVacio(String cadena) {
        return esNoNulo(cadena) && !cadena.isEmpty();
    }

    public static Boolean esNoNuloYCadenaNoVacia(Object o, String cadena) {
        return esNoNulo(o) && esNoNuloYVacio(cadena);
    }

    public static Boolean sonNoNulos(Object... obs) {
        for (Object o : obs) {
            if (o == null) {
                return false;
            }
        }
        return true;
    }

    public static Boolean haSeleccionadoEntidad(AuditoriaBean entidad) {
        return esNoNulo(entidad) && !entidad.esNuevo() && entidad.getId() > 0;
    }

    public static Boolean listaEstaVacia(List lista) {
        return !esNoNulo(lista) || lista.isEmpty();
    }

    public static Boolean listaEstaVaciaParaActualizarEntidad(List<? extends AuditoriaBean> lista) {
        if (listaEstaVacia(lista)) {
            return Boolean.TRUE;
        }
        int n = 0;
        n = lista.stream()
                .filter((auditoriaBean) -> (esNoNuloYVerdadero(auditoriaBean.getEstado()) || !esNoNuloYVerdadero(auditoriaBean.getEliminar())))
                .map((_item) -> 1).reduce(n, Integer::sum);
        return n == 0;
    }

    public static Boolean numeroEsValidoParaBusquedas(Number numero) {
        return esNoNulo(numero) && numero.doubleValue() > 0;
    }

    public static String rellenarConEspacios(String cadena, Integer longitudMaxima) {

        if (esNoNulo(cadena) && cadena.length() > longitudMaxima) {
            return cadena;
        }

        String out;
        Integer n;

        n = longitudMaxima;
        out = "";
        if (esNoNulo(cadena)) {
            n = longitudMaxima - cadena.length();
        }
        for (int i = 0; i < n; i++) {
            out += " ";
        }
        if (esNoNulo(cadena)) {
            out += cadena;
        }
        return out;
    }

    public static String formatTimestamp(Timestamp date) {

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return df.format(date);
    }

    public static String formtDate(Date date, String format, Boolean retornarCadVaciaSiEsNull, Integer lenCadena) {
        if (retornarCadVaciaSiEsNull && esNulo(date)) {
            return rellenarConEspacios(ESPACIO.toString(), lenCadena);
        }
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }

    public static String formatMoneda(BigDecimal moneda) {
        String respuesta = "";
        if (moneda != null) {
            DecimalFormat twoPlaces = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
            respuesta = twoPlaces.format(moneda);
        }
        return respuesta;
    }

    public static String formatearNumeroComoMoneda(BigDecimal cantidad) {
        return "S/ " + formatearNumeroComoMonedaSinSimbolo(cantidad);
    }

    public static String formatearNumeroComoMonedaSinSimbolo(BigDecimal cantidad) {
        return redondearBigDecimal(cantidad, Constantes.NUMERO_DECIMALES_MONEDA).toPlainString();
    }

    public static Timestamp obtenerFechaDesdeMesAnio(String mes, String anio) {
        Calendar calendar;
        Integer mesInt, anioInt;
        calendar = Calendar.getInstance();
        mesInt = Integer.valueOf(mes) - 1;
        anioInt = Integer.valueOf(anio);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.YEAR, anioInt);
        calendar.set(Calendar.MONTH, mesInt);
        return obtenerInicioDia(new Timestamp(calendar.getTimeInMillis()));
    }

    public static Timestamp obtenerUltimoDiaMes(Timestamp fecha) {
        return agregarDias(obtenerInicioMes(agregarMeses(fecha, 1)), -1);
    }

    public static Timestamp agregarMeses(Timestamp fecha, Integer meses) {
        Calendar calendar;
        calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.MONTH, meses);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static String castString(Object o) {
        String r = null;
        if (SistemaClinicoUtil.sonNoNulos(o)) {
            try {
                r = String.valueOf(o);
            } catch (ClassCastException ex) {
                r = o + "";
            }
        }
        return r;
    }

    public static Long castLong(Object o) {
        Long r = null;
        String s = castString(o);
        if (SistemaClinicoUtil.esNoNulo(s)) {
            try {
                r = Long.valueOf(s);
            } catch (NumberFormatException ex) {
                r = null;
            }
        }
        return r;
    }

    public static Time obtenerHoraParaGuardar(String hora) {
        Time r = null;
        if (esNoNulo(hora)) {
            try {
                r = Time.valueOf(hora + ":00");
            } catch (NumberFormatException ex) {
                r = null;
            }

        }
        return r;
    }

    // ...
    public static String obtenerFiltroComoString(Map<String, Object> buscar, String nombrePropiedad) {
        String f;
        Object objetoObtenido = buscar.get(nombrePropiedad);
        f = null;
        if (SistemaClinicoUtil.sonNoNulos(buscar, objetoObtenido)) {
            try {
                f = String.valueOf(objetoObtenido);
            } catch (ClassCastException ex) {
                f = objetoObtenido + "";
            }
        }
        return f;
    }

    public static Long obtenerFiltroComoLong(Map<String, Object> buscar, String nombrePropiedad) {
        String f;
        Long filtro;
        filtro = null;
        f = obtenerFiltroComoString(buscar, nombrePropiedad);
        if (SistemaClinicoUtil.esNoNulo(f)) {
            try {
                filtro = Long.valueOf(f);
            } catch (NumberFormatException ex) {
                filtro = null;
            }
        }
        return filtro;
    }

    public static Integer obtenerFiltroComoInteger(Map<String, Object> buscar, String nombrePropiedad) {
        String f;
        Integer filtro;
        filtro = null;
        f = obtenerFiltroComoString(buscar, nombrePropiedad);
        if (SistemaClinicoUtil.esNoNulo(f)) {
            try {
                filtro = Integer.valueOf(f);
            } catch (NumberFormatException ex) {
                filtro = null;
            }
        }
        return filtro;
    }

    public static Timestamp obtenerFiltroComoTimestamp(Map<String, Object> buscar, String nombrePropiedad) {
        Timestamp timestamp;
        Long milis;
        timestamp = null;
        try {
            milis = obtenerFiltroComoLong(buscar, nombrePropiedad);
            timestamp = new Timestamp(milis);
        } catch (Exception exception) {
            timestamp = null;
        }
        return timestamp;
    }

    public static Date obtenerFiltroComoDate(Map<String, Object> buscar, String nombrePropiedad) {
        Date date = null;
        String fechaCadena;
        try {
            fechaCadena = obtenerFiltroComoString(buscar, nombrePropiedad);
            date = SistemaClinicoUtil.convertirStringToDate(fechaCadena);
        } catch (Exception exception) {
            date = null;
        }
        return date;
    }

    public static Boolean obtenerFiltroComoBoolean(Map<String, Object> buscar, String nombrePropiedad) {
        String f;
        Boolean filtro;
        filtro = null;
        f = obtenerFiltroComoString(buscar, nombrePropiedad);
        if (SistemaClinicoUtil.esNoNulo(f)) {
            try {
                filtro = Boolean.valueOf(f);
            } catch (NumberFormatException ex) {
                filtro = null;
            }
        }
        return filtro;
    }

    public static BigDecimal obtenerFiltroComoBigDecimal(Map<String, Object> buscar, String nombrePropiedad) {
        String f;
        BigDecimal filtro;
        filtro = null;
        f = obtenerFiltroComoString(buscar, nombrePropiedad);
        if (SistemaClinicoUtil.esNoNulo(f)) {
            try {
                filtro = new BigDecimal(f);
            } catch (NumberFormatException ex) {
                filtro = null;
            }
        }
        return filtro;
    }

    public static Object obtenerFiltroComoObject(Map<String, Object> buscar, String nombrePropiedad) {
        return buscar.get(nombrePropiedad);
    }

    public static String obtenerNombreArchivoTrama(String tipo, Integer numeroLote, String ruc, String codigoIPRESS, String periodo, String codigoIAFAS) {
        StringBuilder nombre = new StringBuilder(tipo);
        nombre.append(GUION_BAJO);
        nombre.append(ruc);
        nombre.append(GUION_BAJO);
        nombre.append(codigoIPRESS);
        nombre.append(GUION_BAJO);
        nombre.append(codigoIAFAS);
        nombre.append(GUION_BAJO);

        nombre.append(completarNumeroConCeros(7, numeroLote));
        nombre.append(GUION_BAJO);

        nombre.append(periodo);
        nombre.append(GUION_BAJO);

        nombre.append(formtDate(new Date(), "yyyyMMdd", Boolean.FALSE, null));
        nombre.append(EXTENCION_TXT);

        return nombre.toString();
    }

    public static String obtenerHoraFormatHHMMSS(Time hora, Boolean retornarCadVaciaSiEsNull, Integer lenCadena) {
        if (esNulo(hora) && retornarCadVaciaSiEsNull) {
            return rellenarConEspacios(ESPACIO.toString(), lenCadena);
        }
        String horaStr = hora.toString();
        return horaStr.replace(":", "");
    }

    public static String obtenerNumeroDocumento(Long numero, String serie, Boolean retornarCadVaciaSiEsNull,
            Integer lenCadena) {
        if (retornarCadVaciaSiEsNull && (esNulo(serie) || esNulo(numero))) {
            return rellenarConEspacios(ESPACIO.toString(), lenCadena);
        }
        return completarCadenaConCeros(4, serie) + completarNumeroConCeros(8, numero.intValue());
    }

    public static String completarCadenaConCeros(Integer length, String cadena) {
        return (cadena.length() < length)
                ? String.format("%0" + String.valueOf(length - cadena.length()) + "d%s", 0, cadena) : cadena;
    }

    public static String formatBigDecimalParaTrama(BigDecimal monto, Boolean retornarCadVaciaSiEsNull,
            Integer lenCadena) {

        if (retornarCadVaciaSiEsNull && esNulo(monto)) {
            return rellenarConEspacios(ESPACIO.toString(), lenCadena);
        }

        monto = esNulo(monto) ? BigDecimal.ZERO : monto;

        monto = monto.setScale(2, BigDecimal.ROUND_HALF_UP);

        DecimalFormat df = new DecimalFormat();

        df.setMaximumFractionDigits(2);

        df.setMinimumFractionDigits(2);

        df.setGroupingUsed(false);

        return completarCadenaConEspacios(lenCadena, df.format(monto).replace(COMA, PUNTO));
    }

    public static String obtenerTipoNotaPorId(Long id) {
        String tipo = "N";
        if (TipoDocumentoMovEnum.NOTA_CREDITO.getId().equals(id)) {
            tipo = TipoDocumentoMovEnum.NOTA_CREDITO.getValue();
        } else if (TipoDocumentoMovEnum.NOTA_DEBITO.getId().equals(id)) {
            tipo = TipoDocumentoMovEnum.NOTA_DEBITO.getValue();
        }
        return tipo;
    }

    public static String obtenerMotivoPorId(Long id) {
        String motivo = ESPACIO.toString();
        if (MotivoEnum.ANULACION.getId().equals(id)) {
            motivo = MotivoEnum.ANULACION.getValue();
        } else if (MotivoEnum.REINGRESO.getId().equals(id)) {
            motivo = MotivoEnum.REINGRESO.getValue();
        }
        return motivo;
    }

    public static String formatDiagnoticosTrama(String diagnistico, Integer numMaxDiagnos) {
        String[] diagnosticoArray = esNulo(diagnistico) ? new String[]{ESPACIO.toString()}
                : diagnistico.split(COMA.toString());
        StringBuilder respuesta = new StringBuilder("");
        for (int i = 0; i < diagnosticoArray.length && i < numMaxDiagnos; i++) {
            respuesta.append(rellenarConEspacios(diagnosticoArray[i], 5));
        }
        return truncarCadena(completarCadenaConEspaciosDere(15, respuesta.toString()), 15);
    }

    public static Boolean esNuloFalso(Boolean obj) {
        return esNulo(obj) || !obj;
    }

    public static Boolean esNoNuloYVerdadero(Boolean obj) {
        return esNoNulo(obj) && obj;
    }

    public static <E extends Number> E buscarNumeroEnLista(List<E> lista, E valor) {
        Optional<E> busqueda = lista.stream().filter(p -> p.doubleValue() == valor.doubleValue()).findFirst();
        return busqueda.isPresent() ? busqueda.get() : null;
    }

    public static <E extends Object> E buscarObjetoEnLista(List<E> lista, E valor) {
        Optional<E> busqueda = lista.stream().filter(p -> p.equals(valor)).findFirst();
        return busqueda.isPresent() ? busqueda.get() : null;
    }

    public static <E extends AuditoriaBean> E buscarEntidadEnLista(List<E> lista, E valor) {
        Optional<E> busqueda = lista.stream()
                .filter(p -> !p.esNuevo() && !valor.esNuevo() && Objects.equals(p.getId(), valor.getId())).findFirst();
        return busqueda.isPresent() ? busqueda.get() : null;
    }

    public static void escribirArchivo(List<String> lista, String rutaArchivo, String nombreArchivo,
            Boolean escribirVacio) throws FileNotFoundException {
        PrintStream stream;
        String ruta;

        if (escribirVacio || !SistemaClinicoUtil.listaEstaVacia(lista)) {
            ruta = rutaArchivo + nombreArchivo;

            stream = new PrintStream(new FileOutputStream(ruta));

            lista.forEach((valor) -> {
                stream.println(valor);
            });

            stream.close();
        }
    }

    public static String convertirIntToString(Integer num) {
        return esNoNulo(num) ? String.valueOf(num) : "";
    }

    /**
     * Obtiene el número de la serie para consultar correlativos
     *
     * @param serieCaja String con la serie de caja abierta o a consultar
     * @return un string de 3 digitos con el numero de la serie <br>
     * Ejemplo:
     * <ul>
     * <li>obtenerNumeroDeSerieDesdeSerieCaja("B001") -> 001</li>
     * <li>obtenerNumeroDeSerieDesdeSerieCaja("F001") -> 001</li>
     * <li>obtenerNumeroDeSerieDesdeSerieCaja("B561") -> 561</li>
     * <li>obtenerNumeroDeSerieDesdeSerieCaja("0012") -> 012</li>
     * </ul>
     * @throws SistemaClinicoException En caso la cadena no sea una serie válida
     */
    public static String obtenerNumeroDeSerieDesdeSerieCaja(String serieCaja) throws SistemaClinicoException {
        String cadena = "";
        char value;
        int n;
        if (!esCadenaValida(serieCaja) || serieCaja.length() != Constantes.NUMERO_ENTEROS_SERIES_DOCUMENTOS) {
            throw new SistemaClinicoException("La serie proporcionada no es correcta.");
        }
        n = serieCaja.length();
        for (int i = 0; i < n; i++) {
            value = serieCaja.charAt(n - (i + 1));
            if ('0' <= value && value <= '9') {
                cadena = value + cadena;
            } else {
                i = n;
            }
        }
        try {
            n = Integer.valueOf(cadena);
        } catch (NumberFormatException ex) {
            throw new SistemaClinicoException("La serie proporcionada no es correcta.");
        }
        return completarNumeroConCeros(3, n);
    }

    public static String armarSerieParaDocumentos(String serieCaja, TipoDocumentoMov tipoDocumento)
            throws SistemaClinicoException {
        if (tipoDocumento == null) {
            throw new SistemaClinicoException("El tipo de documento proporcionado no es correcto.");
        }
        return armarSerieParaDocumentos(serieCaja, tipoDocumento.getAbreviatura());
    }

    public static String armarSerieParaDocumentos(String serieCaja, String abreviatura) throws SistemaClinicoException {
        String abr;
        if (!esCadenaValida(abreviatura)) {
            throw new SistemaClinicoException("La abreviatura proporcionada no es correcta.");
        }
        abr = abreviatura.trim().substring(0, 1);
        return abr + obtenerNumeroDeSerieDesdeSerieCaja(serieCaja);
    }

    public static List<Long> obtenerListaIdsDesdeValorParametro(Parametro parametro) {
        if (parametro != null) {
            return obtenerListaIdsDesdeValorParametro(parametro.getValor());
        }
        return null;
    }

    public static List<Long> obtenerListaIdsDesdeValorParametro(String valorParametro) {
        List<Long> lista;
        lista = new ArrayList<>();
        if (esCadenaValida(valorParametro)) {
            valorParametro = valorParametro.trim();
            String[] split = valorParametro.split(COMA.toString());
            lista.addAll(Arrays.asList(split).stream().map(Long::valueOf).collect(Collectors.toList()));
        }
        return lista;
    }

    public static String obtenerValorParametroComoString(Parametro parametro) {
        if (parametro != null) {
            return obtenerValorParametroComoString(parametro.getValor());
        }
        return null;
    }

    public static String obtenerValorParametroComoString(String valorParametro) {
        String valor;
        valor = null;
        if (esCadenaValida(valorParametro)) {
            valor = valorParametro.trim();
        }
        return valor;
    }

    public static Long obtenerValorParametroComoLong(Parametro parametro) {
        if (parametro != null) {
            return obtenerValorParametroComoLong(parametro.getValor());
        }
        return null;
    }

    public static Long obtenerValorParametroComoLong(String valorParametro) {
        Long valor;
        valor = null;
        if (esCadenaValida(valorParametro)) {
            valorParametro = valorParametro.trim();
            valor = Long.valueOf(valorParametro);
        }
        return valor;
    }

    public static List<Long> obtenerValorParametroComoListaLong(Parametro parametro) {
        List<Long> lista;
        String val, split[];
        lista = new ArrayList<>();
        val = obtenerValorParametroComoString(parametro);
        if (esCadenaValida(val)) {
            split = val.split(",");
            for (String string : split) {
                lista.add(obtenerValorParametroComoLong(string));
            }
        }
        return lista;
    }

    public static Boolean esFechaValidaParaBusquedas(Timestamp fecha) {
        return fecha != null && fecha.getTime() > 0;
    }

    public static Boolean compararBigDecimal(BigDecimal one, BigDecimal two) {
        one = redondearBigDecimal(one, Constantes.NUMERO_DECIMALES_MONEDA);
        two = redondearBigDecimal(two, Constantes.NUMERO_DECIMALES_MONEDA);
        return one.compareTo(two) == 0;
    }

    public static <E extends Object> List<E> eliminarNulosDeLista(List<E> lista) {
        List<E> listaResultado;
        listaResultado = new ArrayList<>();
        if (!SistemaClinicoUtil.listaEstaVacia(lista)) {
            lista.stream().filter((e) -> (e != null)).forEachOrdered((e) -> {
                listaResultado.add(e);
            });
        }
        return listaResultado;
    }

    public static String obtenerTipoDocIndenTramaPorAbrev(String abreviatura) {
        String tipo = "7";
        if ("DNI".equalsIgnoreCase(abreviatura)) {
            tipo = "1";
        }
        return tipo;
    }

    public static void hardSetterAuditData(AuditoriaBean auditoriaEntidad) {
        auditoriaEntidad.setEstado(Boolean.TRUE);
        auditoriaEntidad.setFecha(SistemaClinicoUtil.obtenerFechaHoraActual());
        auditoriaEntidad.setFechaMod(SistemaClinicoUtil.obtenerFechaHoraActual());
        auditoriaEntidad.setIp("127.0.0.1");
        auditoriaEntidad.setIpmod("127.0.0.1");
        auditoriaEntidad.setNick("ADMIN");
        auditoriaEntidad.setNickMod("ADMIN");
        auditoriaEntidad.setPc("127.0.0.1");
        auditoriaEntidad.setPcmod("127.0.0.1");
    }

    public static BigDecimal obtenerBigDecimal(Double max) {
        return new BigDecimal(Math.abs(Math.random()) * max).setScale(2, RoundingMode.HALF_UP);
    }
}
