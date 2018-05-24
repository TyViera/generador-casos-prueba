package pe.edu.unp.generadorpruebas.servicio.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.servicio.BusquedaSolucionesServicio;

@Service
public class BusquedaSolucionesServicioImpl implements BusquedaSolucionesServicio {

    @Override
    public List<CasoDePrueba> buscarSolucionesOptimas(Metodo metodo) {
        //al final
        Double suma, promedio;
        suma = metodo.getCasosPrueba()
                .stream()
                .map(x -> x.getDiversidad())
                .reduce(Double::sum)
                .orElse(0.0D);
        promedio = suma / metodo.getCasosPrueba().size();
        return metodo.getCasosPrueba()
                .stream()
                .filter(x -> x.getDiversidad() > promedio)
                .collect(Collectors.toList());
//        return metodo.getCasosPrueba();
    }

}
