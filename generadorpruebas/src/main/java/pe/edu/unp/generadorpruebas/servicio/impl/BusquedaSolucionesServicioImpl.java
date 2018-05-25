package pe.edu.unp.generadorpruebas.servicio.impl;

import java.util.ArrayList;
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
        int maxSize, maxInteraciones, count;
        List<CasoDePrueba> listaCasos;

        listaCasos = new ArrayList<>(metodo.getCasosPrueba());
        maxSize = 256;
        maxInteraciones = 32;
        count = 0;
        while (listaCasos.size() > maxSize && count < maxInteraciones) {
            Double suma, promedio;
            suma = listaCasos
                    .stream()
                    .map(x -> x.getDiversidad())
                    .reduce(Double::sum)
                    .orElse(0.0D);
            promedio = suma / listaCasos.size();
            listaCasos = listaCasos
                    .stream()
                    .filter(x -> x.getDiversidad() >= promedio)
                    .collect(Collectors.toList());
            count++;
        }

        return listaCasos;
//        return metodo.getCasosPrueba();
    }

}
