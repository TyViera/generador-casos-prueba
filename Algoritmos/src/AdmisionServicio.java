
import enums.TipoPersonaVentaEnum;
import enums.TipoSeguroEnum;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Admision;
import util.Constantes;
import util.SistemaClinicoUtil;
import static util.SistemaClinicoUtil.obtenerBigDecimal;

public class AdmisionServicio {

    public List<Map<String, Object>> obtenerHonorarioParaNuevaAdmision(Long personaId, Long medicoId, Timestamp hora, Long polizaId, Long admisionId) {
        BigDecimal porcHonorarioTipoAdmision, porcIncr, auxPrecio, montoParticular, precioBaseParticular;
        List<Map<String, Object>> listaResultado;
        Map<String, Object> resultado;
        Boolean estaEnIncremento;
        final Boolean esAdmisionAsegurado;

        // INICIALIZACIONES
        listaResultado = new ArrayList<>();
        montoParticular = BigDecimal.ZERO;
        precioBaseParticular = BigDecimal.ZERO;
        porcHonorarioTipoAdmision = Constantes.CIEN;
        porcIncr = BigDecimal.ZERO;
        if (SistemaClinicoUtil.numeroEsValidoParaBusquedas(admisionId)) {
            esAdmisionAsegurado = obtenerTipoDeAdmision(admisionId).equals(TipoSeguroEnum.ASEGURADO.getValue());
        } else {
            esAdmisionAsegurado = Boolean.FALSE;
        }

        if (!esAdmisionAsegurado) {
            // DESCUENTOS E INCREMENTOS
            estaEnIncremento = admisionEstaEnHorarioIncremento(hora);
            if (estaEnIncremento) {
                porcIncr = obtenerBigDecimal(1.00);
            }

//            porcHonorarioTipoAdmision = tipoAdmisionEntidad.getPorcentajeHonorario();
//            if (porcHonorarioTipoAdmision == null) {
//                porcHonorarioTipoAdmision = Constantes.CIEN;
//            }
            Admision admision = new Admision();
//            admision.setTipoAdmision(tipoAdmisionEntidad);
            if (!esAdmisionDeCortesia(admision)) {
                //SI NO ES CORTESIA, CONSULTE HONORARIOS MEDICOS
                precioBaseParticular = obtenerHonorarioMaximoDeMedico(medicoId);
            } else {
                //SI ES CORTESIA, CONSULTE TARIFA CORTESIA
                precioBaseParticular = obtenerBigDecimal(10.00);
            }

            if (precioBaseParticular == null
                    || (precioBaseParticular.compareTo(BigDecimal.ZERO) <= 0)) {
                precioBaseParticular = obtenerBigDecimal(100.00);
            }
            if (precioBaseParticular != null) {
                auxPrecio = precioBaseParticular.multiply(porcHonorarioTipoAdmision.divide(Constantes.CIEN));
                auxPrecio = auxPrecio.multiply(BigDecimal.ONE.add(porcIncr));
                auxPrecio = SistemaClinicoUtil.redondearBigDecimal(auxPrecio, Constantes.NUMERO_DECIMALES_MONEDA);
                montoParticular = auxPrecio.add(BigDecimal.ZERO);// copia
            }
        }
        // ASEGURADO
        if (esAsegurado(personaId)) {
            auxPrecio = obtenerBigDecimal(50.00D);
            resultado = new HashMap<>();
            resultado.put("precio", auxPrecio);
            resultado.put("nombre", TipoSeguroEnum.ASEGURADO.getValue());
            listaResultado.add(resultado);
        }

        if (!esAdmisionAsegurado) {
            // TARIFA SOCIAL
            if (tieneTarifaSocial(personaId, medicoId)) {
                resultado = new HashMap<>();
                auxPrecio = obtenerBigDecimal(20.00);
                auxPrecio = auxPrecio.multiply(BigDecimal.ONE.add(porcIncr));
                auxPrecio = SistemaClinicoUtil.redondearBigDecimal(auxPrecio, Constantes.NUMERO_DECIMALES_MONEDA);
                resultado.put("precio", auxPrecio);
                resultado.put("nombre", TipoSeguroEnum.TARIFA_SOCIAL.getValue());
                listaResultado.add(resultado);
            }

            // TARJETA DE DESCUENTO
            if (tieneTarjetaDescuento(personaId)) {
                if (precioBaseParticular != null) {
                    BigDecimal descuento = obtenerBigDecimal(30.00D);
                    descuento = descuento.divide(Constantes.CIEN);
                    descuento = BigDecimal.ONE.subtract(descuento);

                    resultado = new HashMap<>();
                    auxPrecio = precioBaseParticular.multiply(descuento);
                    auxPrecio = auxPrecio.multiply(BigDecimal.ONE.add(porcIncr));
                    auxPrecio = SistemaClinicoUtil.redondearBigDecimal(auxPrecio, Constantes.NUMERO_DECIMALES_MONEDA);
                    resultado.put("precio", auxPrecio);
                    resultado.put("nombre", TipoSeguroEnum.TARJETA_DCTO.getValue());
                    listaResultado.add(resultado);
                }
            }

            int index = -1;
            if (!SistemaClinicoUtil.compararBigDecimal(porcHonorarioTipoAdmision, Constantes.CIEN)) {
                index = 0;
            }
            // ASEGURADO
            resultado = new HashMap<>();
            resultado.put("precio", montoParticular);
            resultado.put("nombre", TipoSeguroEnum.PARTICULAR.getValue());
            if (index >= 0) {
                listaResultado.add(index, resultado);
            } else {
                listaResultado.add(resultado);
            }
        }
        return listaResultado;
    }

    public Boolean esAdmisionGratuita(BigDecimal deducible, String tipoPersona) {
        Boolean esASegurado, gratuita;
        try {
            esASegurado = tipoPersona.equals(TipoPersonaVentaEnum.ASEGURADO.getValue());
            gratuita = esASegurado && (SistemaClinicoUtil.compararBigDecimal(deducible, BigDecimal.ZERO));
        } catch (Exception ex) {
            gratuita = Boolean.FALSE;
        }
        return gratuita;
    }

    public String obtenerTipoDeAdmision(Long admisionId) {
        double val = Math.random();
        double inc = 0.25;
        double max = 0;
        max = max + inc;
        if (val < max) {
            return TipoSeguroEnum.ASEGURADO.getValue();
        }
        max = max + inc;
        if (val < max) {
            return TipoSeguroEnum.PARTICULAR.getValue();
        }
        max = max + inc;
        if (val < max) {
            return TipoSeguroEnum.TARIFA_SOCIAL.getValue();
        }
        return TipoSeguroEnum.TARJETA_DCTO.getValue();
    }

    public Boolean admisionEstaEnHorarioIncremento(Timestamp hora) {
        return (Math.random() < 0.5);
    }

    public BigDecimal obtenerHonorarioMaximoDeMedico(Long medicoId) {
        return obtenerBigDecimal(100.00);
    }

    public Boolean esAsegurado(Long personaId) {
        return (Math.random() < 0.5);
    }

    public Boolean tieneTarifaSocial(Long personaId, Long medicoId) {
        return (Math.random() < 0.5);
    }

    public Boolean tieneTarjetaDescuento(Long personaId) {
        return (Math.random() < 0.5);
    }

    private Boolean esAdmisionDeCortesia(Admision admision) {
        return (Math.random() < 0.5);
    }

}
