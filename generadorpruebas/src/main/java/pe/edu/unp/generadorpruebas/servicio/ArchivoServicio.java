package pe.edu.unp.generadorpruebas.servicio;

import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;

public interface ArchivoServicio {

    public Proyecto cargarProyecto(String rutaOrigen, String rutaDestino);

    public Clase cargarArchivo(String rutaOrigen, String rutaDestino);

}
