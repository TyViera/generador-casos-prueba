package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.exception.CompilacionException;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

public interface CompilacionServicio {

    public void validarProgramaSeleccionado(String rutaPrograma) throws GeneradorException;

    public ResultadoComando compilar(RecursoJava proyecto) throws CompilacionException;

}
