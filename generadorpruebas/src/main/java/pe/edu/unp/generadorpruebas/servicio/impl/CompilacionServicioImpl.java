package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.CompilacionServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoMavenServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoServicio;
import pe.edu.unp.generadorpruebas.exception.CompilacionException;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Service
public class CompilacionServicioImpl implements CompilacionServicio {

    @Autowired
    private EjecutorComandoServicio ejecutorComandoServicio;

    @Autowired
    private EjecutorComandoMavenServicio ejecutorComandoMavenServicio;

    @Override
    public void validarProgramaSeleccionado(String rutaPrograma) throws GeneradorException {
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

    @Override
    public Boolean compilar(RecursoJava proyecto) throws CompilacionException {
        try {
            ResultadoComando resultado;
            if (proyecto instanceof Clase) {
                Clase clase = (Clase) proyecto;
                resultado = ejecutorComandoServicio.ejecutarComando("javac " + clase.getNombre() + ".java", clase.getRutaBase());
            } else {
                resultado = ejecutorComandoMavenServicio.compile((Proyecto) proyecto);
            }
            return resultado.esResultadoExito();
        } catch (GeneradorException | IOException | InterruptedException ex) {
            throw new CompilacionException(ex);
        }
    }

}
