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

    public static boolean esCadenaValida(String cadena) {
        return cadena != null && !cadena.isEmpty();
    }

    public static boolean sistemaOperativoEsLinux() {
        String soName = System.getProperty("os.name");
        return soName.equalsIgnoreCase("linux");
    }

    public static boolean sistemaOperativoEsWindows() {
        String soName = System.getProperty("os.name");
        return soName.equalsIgnoreCase("windows");
    }

}
