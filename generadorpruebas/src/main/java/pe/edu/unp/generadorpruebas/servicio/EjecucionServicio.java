package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.Metodo;

public interface EjecucionServicio {

    public Integer leerComplejidadCiclomatica(Metodo metodo);
    
    public Integer obtenerNumeroDeCaminos(Integer complejidad);
    
}
