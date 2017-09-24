package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.exception.CompilacionException;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;

public interface CompilacionServicio {

    public void validarProgramaSeleccionado(String rutaPrograma) throws GeneradorException;

    public Boolean compilar(RecursoJava proyecto) throws CompilacionException;

}
