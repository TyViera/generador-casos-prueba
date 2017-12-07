package pe.edu.unp.generadorpruebas.servicio;

import java.util.List;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Metodo;

public interface BusquedaSolucionesServicio {

    public List<CasoDePrueba> buscarSolucionesOptimas(Metodo metodo);

}
