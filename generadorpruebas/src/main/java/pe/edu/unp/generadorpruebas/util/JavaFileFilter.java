package pe.edu.unp.generadorpruebas.util;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class JavaFileFilter extends FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory() || pathname.getName().endsWith(Constantes.EXTENSION_JAVA);
    }

    @Override
    public String getDescription() {
        return "Java source code file";
    }

}
