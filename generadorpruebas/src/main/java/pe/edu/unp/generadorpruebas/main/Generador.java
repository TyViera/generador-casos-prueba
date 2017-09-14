/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.main;

import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author nazaret
 */
public class Generador {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\nazaret\\Programa.java";
    }
    
    private void ejecutarComando(String comando){
        Process proc;
        proc = new Process() {

            @Override
            public OutputStream getOutputStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getInputStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getErrorStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int waitFor() throws InterruptedException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int exitValue() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void destroy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
    }
}
