package pe.edu.unp.generadorpruebas.servicio;

import java.lang.reflect.Method;
import java.util.List;
import pe.edu.unp.generadorpruebas.exception.ModeladoException;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;

public interface ModeladoServicio {

    public RecursoJava obtenerProyecto(String ruta);

    public Metodo obtenerMetodoEjecucion(Clase clase, String nombreMetodo) throws ModeladoException;
    
    public List<Method> obtenerMetodosDeClase(String rutaClase, String nombreClase) throws ModeladoException;
    
    public List<Method> obtenerMetodosDeClaseEjecucion(String rutaClase, String nombreClase) throws ModeladoException;

}
