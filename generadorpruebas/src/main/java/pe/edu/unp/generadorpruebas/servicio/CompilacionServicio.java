package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.util.CompilacionException;

public interface CompilacionServicio {

    public Boolean compilar(Proyecto proyecto)throws CompilacionException;

}
