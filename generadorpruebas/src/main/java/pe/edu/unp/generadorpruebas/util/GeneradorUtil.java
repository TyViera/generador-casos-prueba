package pe.edu.unp.generadorpruebas.util;

public class GeneradorUtil {

    public static String quitarExtension(String nombreArchivo) {
        int lastIndexOf = nombreArchivo.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            return nombreArchivo.substring(0, nombreArchivo.lastIndexOf("."));
        } else {
            return nombreArchivo;
        }
    }

}
