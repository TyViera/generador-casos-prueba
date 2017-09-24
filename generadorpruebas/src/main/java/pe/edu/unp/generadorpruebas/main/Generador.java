/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.main;

import pe.edu.unp.generadorpruebas.util.StreamGobbler;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;

/**
 *
 * @author nazaret
 */
public class Generador {

    public static void main(String[] args) {
//        String rutaArchivo = "/home/nazaret/pruebas_generador/Programa.java";
//        String rutaArchivo = "/home/nazaret/pruebas_generador/nomiproject";//<-exit value = 1
        String rutaArchivo = "/home/nazaret/pruebas_generador/miproject";//<-exit value = 0
//        System.out.println("1");
//        SpringRunner.main(args);
//        System.out.println("2");
        
//        try {
//            validarProgramaSeleccionado(rutaArchivo);
//            compilarPrograma(rutaArchivo);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("");
        proyecto.setRutaBase(rutaArchivo);
        
        

    }

    private static int ejecutarComando(String comando, String rutaBase) throws IOException, InterruptedException {
        return ejecutarComando(comando, rutaBase, null);
    }

    private static int ejecutarComando(String comando, String rutaBase, OutputStream flujoSalida) throws IOException, InterruptedException {
        Process exec = Runtime.getRuntime().exec(comando, null, new File(rutaBase));
        StreamGobbler outputGobbler = new StreamGobbler(flujoSalida, exec.getInputStream(), comando);
        outputGobbler.start();
        return exec.waitFor();
    }

    private static void compilarPrograma(String rutaPrograma) throws IOException, InterruptedException {
        File archivo = new File(rutaPrograma);
        if (archivo.isFile()) {
            String carpeta = archivo.getParent();
            String nombreArchivo = archivo.getName();
            ejecutarComando("javac " + nombreArchivo, carpeta);
        } else if (archivo.isDirectory()) {
            ejecutarComando("mvn compile -Dmaven.test.skip=true", rutaPrograma);
        }
    }

    private static void validarProgramaSeleccionado(String rutaPrograma) throws GeneradorException {
        if (rutaPrograma == null || rutaPrograma.isEmpty()) {
            //
            throw new GeneradorException("Archivo no válido.");
        }
        File archivo = new File(rutaPrograma);
        if (!archivo.exists()) {
            throw new GeneradorException("Archivo no existe.");
        }
        if (archivo.isFile() && !rutaPrograma.endsWith(".java")) {
            throw new GeneradorException("Debe seleccionar un archivo java valido.");
        }
        if (archivo.isDirectory()) {
            //debe tener un archivo pom y una carpeta src
            Boolean pom, src;
            pom = src = Boolean.FALSE;
            for (File file : archivo.listFiles()) {
                if (file.isFile() && file.getName().equals("pom.xml")) {
                    pom = Boolean.TRUE;
                }
                if (file.isDirectory() && file.getName().equals("src")) {
                    src = Boolean.TRUE;
                }
            }
            if (!pom || !src) {
                throw new GeneradorException("Debe seleccionar un proyecto maven correcto.");
            }
        }
    }

}
