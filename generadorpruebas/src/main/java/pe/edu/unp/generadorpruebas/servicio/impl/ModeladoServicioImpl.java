package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
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
            System.out.println(metodo.getMetodoEjecutable().toGenericString());
            System.out.println(metodo.getMetodoEjecutable().toString());
            System.out.println(obtenerCodigoFuenteDeMetodo(metodo));
//            System.out.println(metodo.getMetodoEjecutable().getModifiers());
//            System.out.println(Modifier.isPublic(metodo.getMetodoEjecutable().getModifiers()));
//            System.out.println(Modifier.PRIVATE);
//            System.out.println(Modifier.PUBLIC);
//            System.out.println(Modifier.PROTECTED);
//            System.out.println(Modifier.STATIC);
//            System.out.println(metodo.getMetodoEjecutable().toGenericString());
//            Class<?> returnType = metodo.getMetodoEjecutable().getReturnType();
//            Void a;
//            System.out.println(returnType.getName());

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

        try {
            System.out.println(obtenerCabeceraDeMetodo(metodo));
            cabecera = obtenerCabeceraDeMetodoComoExpresionRegular(metodo);
            System.out.println("cabecera " + cabecera);
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
                System.out.println(linea);
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

//    private String obtenerCabeceraDeMetodo(Metodo metodo, Boolean enExpresionRegular) {
    private String obtenerCabeceraDeMetodoComoExpresionRegular(Metodo metodo) {
        Method method;
        String cabecera;
        cabecera = "";
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
            cabecera += Constantes.PATTERN_ESPACIO + parameter.getType().getName() + Constantes.PATTERN_ESPACIO + parameter.getName() + Constantes.PATTERN_ESPACIO + "\\,";
        }
        if (method.getParameters().length > 0) {
            cabecera = Constantes.PATTERN_ESPACIO + cabecera.substring(0, cabecera.length() - 2);
        }
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

    private int calcularComplejidadCiclomaticaLinea(String linea) {
        return 0;
    }

}
