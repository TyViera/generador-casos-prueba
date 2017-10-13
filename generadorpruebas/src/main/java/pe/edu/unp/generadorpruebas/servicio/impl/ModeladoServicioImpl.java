package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.ModeladoServicio;
import pe.edu.unp.generadorpruebas.util.ClassPathHacker;
import pe.edu.unp.generadorpruebas.exception.ModeladoException;
import pe.edu.unp.generadorpruebas.modelo.ParametroMetodo;
import pe.edu.unp.generadorpruebas.util.Constantes;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;

@Service
public class ModeladoServicioImpl implements ModeladoServicio {

    @Override
    public RecursoJava obtenerProyecto(String ruta) {
        File archivo = new File(ruta);
        String nombreArchivo = archivo.getName();
        if (archivo.isFile()) {
            String carpeta = archivo.getParent();
            return new Clase(carpeta, GeneradorUtil.quitarExtension(nombreArchivo), nombreArchivo);
        } else {
            return new Proyecto(ruta, nombreArchivo);
        }
    }

    @Override
    public Metodo obtenerMetodoEjecucion(Clase clase, String nombreMetodo) throws ModeladoException {
        try {
            Method[] metodos;
            Metodo metodo;
            Class miClase;

            metodo = null;
            ClassPathHacker.addFile(clase.getRutaBase());

            miClase = Class.forName(clase.getNombre());
            metodos = miClase.getMethods();
            for (Method method : metodos) {
                if (method.getName().equals(nombreMetodo)) {
                    metodo = new Metodo(clase, nombreMetodo, method);
                    break;
                }
            }
            if (metodo == null) {
                throw new ModeladoException("Método no encontrado.");
            }
            metodo.setCodigoJava(obtenerCodigoFuenteDeMetodo(metodo));
            obtenerComplejidadCiclomatica(metodo);

            Parameter[] parameters = metodo.getMetodoEjecutable().getParameters();
            for (Parameter parameter : parameters) {
                ParametroMetodo parametroMetodo;
                parametroMetodo = new ParametroMetodo(parameter);
                metodo.agregarParametro(parametroMetodo);
            }

            //codigo fuente
            return metodo;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new ModeladoException("Ocurrió un error al agregar la clase especificada al classpath.");

        }
    }

    private String obtenerCodigoFuenteDeMetodo(Metodo metodo) {
        String rutaClase, linea, cabecera;
        BufferedReader br;
        Boolean encontro;
        int numeroLlaves, numerocomillas;
        String codigo;
        Object[] obtenerLineaMetodo;
        boolean cabMetodo;

        codigo = "";

        try {
            cabecera = obtenerCabeceraDeMetodoComoExpresionRegular(metodo);
            System.out.println(cabecera);
            rutaClase = metodo.getClase().getRutaBase() + File.separator + metodo.getClase().getNombre() + Constantes.EXTENSION_JAVA;
            encontro = Boolean.FALSE;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(rutaClase)));
            linea = null;
            while (!encontro && (linea = br.readLine()) != null) {
                if (linea.matches(cabecera)) {
                    encontro = Boolean.TRUE;
                }
            }
            if (encontro) {
                //quitar comentarios
                numeroLlaves = 0;
                numerocomillas = 0;

                cabMetodo = true;
                obtenerLineaMetodo = obtenerLineaMetodo(linea, numeroLlaves, numerocomillas, cabMetodo);
                codigo += (String) obtenerLineaMetodo[0];
                numeroLlaves = (int) obtenerLineaMetodo[1];
                numerocomillas = (int) obtenerLineaMetodo[2];
                cabMetodo = (boolean) obtenerLineaMetodo[3];
                while (numeroLlaves != 0 && (linea = br.readLine()) != null) {
                    obtenerLineaMetodo = obtenerLineaMetodo(linea, numeroLlaves, numerocomillas, cabMetodo);
                    codigo += (String) obtenerLineaMetodo[0];
                    numeroLlaves = (int) obtenerLineaMetodo[1];
                    numerocomillas = (int) obtenerLineaMetodo[2];
                    cabMetodo = (boolean) obtenerLineaMetodo[3];
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return codigo;
    }

    private Object[] obtenerLineaMetodo(String linea, int numeroLlaves, int numeroComillas, boolean cabMetodo) {
        char llaveApertura = '{';
        char llaveCierre = '}';
        String codigoRestanteSinComentarios, codigo;
        if (linea.contains("//")) {
            codigoRestanteSinComentarios = linea.substring(0, linea.indexOf("//"));
        } else {
            codigoRestanteSinComentarios = linea;
        }
        codigo = "";
        for (char c : codigoRestanteSinComentarios.toCharArray()) {
            codigo = codigo + c;
            if (c == '"') {
                numeroComillas = (numeroComillas + 1) % 2;
            }
            if (numeroComillas != 1) {
                //buscar que las llaves no esten en comillas
                if (c == llaveApertura) {
                    cabMetodo = false;
                    numeroLlaves++;
                } else if (c == llaveCierre) {
                    cabMetodo = false;
                    numeroLlaves--;
                }

                if (!cabMetodo && numeroLlaves == 0) {
                    break;
                }
            }
        }
        return new Object[]{codigo + "\n", numeroLlaves, numeroComillas, cabMetodo};
    }

//    private String obtenerCabeceraDeMetodo(Metodo metodo, Boolean enExpresionRegular) {
    private String obtenerCabeceraDeMetodoComoExpresionRegular(Metodo metodo) {
        Method method;
        String cabecera;
        cabecera = Constantes.PATTERN_ESPACIO;
        method = metodo.getMetodoEjecutable();
        if (Modifier.isPublic(method.getModifiers())) {
            cabecera += "public";
        } else if (Modifier.isPrivate(method.getModifiers())) {
            cabecera += "private";
        } else if (Modifier.isProtected(method.getModifiers())) {
            cabecera += "protected";
        }
//        if (enExpresionRegular) {
        cabecera = cabecera + Constantes.PATTERN_ESPACIO;
//        }
        if (Modifier.isStatic(method.getModifiers())) {
            cabecera += "static" + Constantes.PATTERN_ESPACIO;
        }
        cabecera += method.getReturnType().getName() + Constantes.PATTERN_ESPACIO;
        cabecera += method.getName() + Constantes.PATTERN_ESPACIO;
        cabecera += "\\(";
//        Paranamer info = new CachingParanamer(new AnnotationParanamer(new BytecodeReadingParanamer()));

//        String[] parameterNames = info.lookupParameterNames(method);
//        for (String parameterName : parameterNames) {
//            System.out.println(parameterName);
//        }
        for (Parameter parameter : method.getParameters()) {
            cabecera += Constantes.PATTERN_ESPACIO + parameter.getType().getSimpleName() + Constantes.PATTERN_ESPACIO + parameter.getName() + Constantes.PATTERN_ESPACIO + "\\,";
        }
        if (method.getParameters().length > 0) {
            cabecera = cabecera.substring(0, cabecera.length() - 2);
        }
        cabecera = cabecera + Constantes.PATTERN_ESPACIO;
        cabecera += "\\)" + Constantes.PATTERN_ESPACIO;

        if (method.getGenericExceptionTypes().length > 0) {
            cabecera += "throws";
        }
        for (Class<?> exceptionType : method.getExceptionTypes()) {
            cabecera += Constantes.PATTERN_ESPACIO + exceptionType.getSimpleName() + Constantes.PATTERN_ESPACIO + "\\,";
        }
        if (method.getExceptionTypes().length > 0) {
            cabecera = cabecera.substring(0, cabecera.length() - 2);
        }
        cabecera += ".*";
        return cabecera;
    }

    private String obtenerCabeceraDeMetodo(Metodo metodo) {
        Method method;
        String cabecera;
        cabecera = "";
        method = metodo.getMetodoEjecutable();
        if (Modifier.isPublic(method.getModifiers())) {
            cabecera += "public ";
        } else if (Modifier.isPrivate(method.getModifiers())) {
            cabecera += "private ";
        } else if (Modifier.isProtected(method.getModifiers())) {
            cabecera += "protected ";
        }
        if (Modifier.isStatic(method.getModifiers())) {
            cabecera += "static ";
        }
        cabecera += method.getReturnType().getName() + " " + method.getName() + "(";

        for (Parameter parameter : method.getParameters()) {
            cabecera += parameter.getType().getName() + " " + parameter.getName() + ", ";
        }
        if (method.getParameters().length > 0) {
            cabecera = cabecera.substring(0, cabecera.length() - 2);
        }
        cabecera += ") ";

        if (method.getGenericExceptionTypes().length > 0) {
            cabecera += "throws ";
        }
        for (Class<?> exceptionType : method.getExceptionTypes()) {
            cabecera += exceptionType.getSimpleName() + ", ";
        }
        if (method.getExceptionTypes().length > 0) {
            cabecera = cabecera.substring(0, cabecera.length() - 2);
        }
        return cabecera;
    }

    private boolean buscarPalabra(String palabra) {
        List<String> palabrasReservadas;
        palabrasReservadas = new ArrayList<String>() {
            {
                add("if");
                add("for");
                add("while");
                add("case");
                add("catch");
                add("throw");
                add("&&");
                add("||");
                add("?");
            }
        };
        if (palabrasReservadas.contains(palabra)) {
            return true;
        }
        return palabrasReservadas.stream().anyMatch((palabraReservada) -> (palabra.contains(palabraReservada)));
    }

    private int calcularComplejidadCiclomaticaLinea(String linea, boolean esUltimaLinea) {
        int complejidad;
        String palabras[];
        complejidad = 0;

        palabras = linea.trim().split(" ");
        for (String palabra : palabras) {
            palabra = palabra.trim();
            if ((!esUltimaLinea && palabra.equals("return")) || (buscarPalabra(palabra))) {
                complejidad++;
            }
        }
        return complejidad;
    }

    private void obtenerComplejidadCiclomatica(Metodo metodo) {
        String[] lineasMetodo;
        int complejidad;

        complejidad = 1;
        lineasMetodo = metodo.getCodigoJava().split("\n");
        for (int i = 0; i < lineasMetodo.length; i++) {
            String linea = lineasMetodo[i];
            complejidad += calcularComplejidadCiclomaticaLinea(linea, i == (lineasMetodo.length - 1));
        }
        System.out.println("Complejidad cliclomatica: " + complejidad);
    }

}
