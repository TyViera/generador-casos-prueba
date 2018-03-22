/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.util;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author nazaret
 */
public class FolderFileFilter extends FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory();
    }

    @Override
    public String getDescription() {
        return "Carpeta de archivos";
    }

}
