package pe.edu.unp.generadorpruebas.util;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.PruebaMetodo;

public class GeneradorUtil {

    public static String quitarExtension(String nombreArchivo) {
        int lastIndexOf = nombreArchivo.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            return nombreArchivo.substring(0, nombreArchivo.lastIndexOf("."));
        } else {
            return nombreArchivo;
        }
    }

    public static boolean esCadenaValida(String cadena) {
        return cadena != null && !cadena.isEmpty();
    }

    public static boolean sistemaOperativoEsLinux() {
        String soName = System.getProperty("os.name");
        return soName.equalsIgnoreCase("linux");
    }

    public static boolean sistemaOperativoEsWindows() {
        String soName = System.getProperty("os.name");
        return soName.toLowerCase().startsWith("windows");
    }

    public static String obtenerEstadoPrueba(String nombre, Result result, Prueba prueba) {
        if (result.getFailureCount() <= 0) {
            return "Exito";
        }
        Failure failure = obtenerFailure(nombre, result, prueba);
        if (failure != null) {
            return "Error";
        }
        return "Exito";
    }

    public static Failure obtenerFailure(String nombre, Result result, Prueba prueba) {
        for (Failure failure : result.getFailures()) {//test_6(GeneradorTestSegundaPrueba)
            String cabecera = nombre + "(" + prueba.getTestClassName() + ")";
            if (failure.getTestHeader().equals(cabecera)) {
                return failure;
            }
        }
        return null;
    }

    public static String obtenerMensajesPrueba(String nombre, Result result, Prueba prueba) {
        if (result.getFailureCount() <= 0) {
            return "";
        }
        Failure failure = GeneradorUtil.obtenerFailure(nombre, result, prueba);
        if (failure != null) {
            return failure.getMessage();
        }
        return "";
    }
}
