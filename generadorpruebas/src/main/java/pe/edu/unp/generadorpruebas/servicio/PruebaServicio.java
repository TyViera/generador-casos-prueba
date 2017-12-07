package pe.edu.unp.generadorpruebas.servicio;

import java.util.List;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

public interface PruebaServicio {

    public ResultadoComando ejecutarPrueba(RecursoJava proyecto, Prueba prueba) throws EjecucionPruebaException;

    public Prueba crearPrueba(CasoDePrueba casoDePrueba);

    public Prueba crearPruebas(Metodo metodo);

    public Prueba crearPruebas(Metodo metodo, List<CasoDePrueba> solucionesOptimas);

    public List<Prueba> crearPruebas(List<CasoDePrueba> solucionesOptimas);

}
