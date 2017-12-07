package pe.edu.unp.generadorpruebas.servicio.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.servicio.BusquedaSolucionesServicio;

@Service
public class BusquedaSolucionesServicioImpl implements BusquedaSolucionesServicio {

    @Override
    public List<CasoDePrueba> buscarSolucionesOptimas(Metodo metodo) {
        //al final
        return metodo.getCasosPrueba();
    }

}
