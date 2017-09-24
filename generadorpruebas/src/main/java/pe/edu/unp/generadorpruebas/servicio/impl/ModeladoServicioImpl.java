package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.Clase;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.ModeladoServicio;
import pe.edu.unp.generadorpruebas.util.ClassPathHacker;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.exception.ModeladoException;
import pe.edu.unp.generadorpruebas.modelo.ParametroMetodo;
import pe.edu.unp.generadorpruebas.util.GeneradorUtil;

@Service
public class ModeladoServicioImpl implements ModeladoServicio {

    @Override
    public RecursoJava obtenerProyecto(String ruta) {
        File archivo = new File(ruta);
        String nombreArchivo = archivo.getName();
        if (archivo.isFile()) {
            String carpeta = archivo.getParent();
            return new Clase(carpeta, GeneradorUtil.quitarExtension(nombreArchivo), nombreArchivo);
        } else {
            return new Proyecto(ruta, nombreArchivo);
        }
    }

    @Override
    public Metodo obtenerMetodoEjecucion(Clase clase, String nombreMetodo) throws ModeladoException {
        try {
            Method[] metodos;
            Metodo metodo;
            Class miClase;

            metodo = null;
            ClassPathHacker.addFile(clase.getRutaBase());

            miClase = Class.forName(clase.getNombre());
            metodos = miClase.getMethods();
            for (Method method : metodos) {
                if (method.getName().equals(nombreMetodo)) {
                    metodo = new Metodo(clase, nombreMetodo, method);
                    break;
                }
            }
            if (metodo == null) {
                throw new ModeladoException("Método no encontrado.");
            }
            System.out.println(metodo.getMetodoEjecutable().getModifiers());
            System.out.println(Modifier.isPublic(metodo.getMetodoEjecutable().getModifiers()));
            System.out.println(Modifier.PRIVATE);
            System.out.println(Modifier.PUBLIC);
            System.out.println(Modifier.PROTECTED);
            System.out.println(Modifier.STATIC);
            System.out.println(metodo.getMetodoEjecutable().toGenericString());
//            Class<?> returnType = metodo.getMetodoEjecutable().getReturnType();
//            Void a;
//            System.out.println(returnType.getName());
            
            Parameter[] parameters = metodo.getMetodoEjecutable().getParameters();
            for (Parameter parameter : parameters) {
                ParametroMetodo parametroMetodo;
                parametroMetodo = new ParametroMetodo(parameter);
                metodo.agregarParametro(parametroMetodo);
            }
            return metodo;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new ModeladoException("Ocurrió un error al agregar la clase especificada al classpath.");

        }
    }

}
