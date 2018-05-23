
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoServicio {

    public String getMimeType(String ruta) throws IOException {
        File file = new File(ruta);
        if (file.exists()) {
            InputStream is = new BufferedInputStream(new FileInputStream(file));
            return URLConnection.guessContentTypeFromStream(is);
        }
        return null;
    }

    private byte[] leerArchivo(String ruta) throws IOException {
        File file = new File(ruta);
        if (file.exists()) {
            return Files.readAllBytes(Paths.get(ruta));
        }
        return null;
    }
}
