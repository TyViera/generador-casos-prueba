package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

public interface EjecutorComandoMavenServicio {

    public ResultadoComando clean(Proyecto proyecto) throws GeneradorException;

    public ResultadoComando install(Proyecto proyecto) throws GeneradorException;

    public ResultadoComando test(Proyecto proyecto, Prueba prueba) throws GeneradorException;

    public ResultadoComando build(Proyecto proyecto) throws GeneradorException;

    public ResultadoComando compile(Proyecto proyecto) throws GeneradorException;

}
