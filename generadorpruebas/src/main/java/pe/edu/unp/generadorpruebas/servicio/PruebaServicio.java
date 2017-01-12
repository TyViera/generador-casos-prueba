package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.util.EjecucionPruebaException;

public interface PruebaServicio {

    public void ejecutarPrueba(Prueba prueba) throws EjecucionPruebaException;
    
    public Prueba crearPrueba(CasoDePrueba casoDePrueba);
    
}
