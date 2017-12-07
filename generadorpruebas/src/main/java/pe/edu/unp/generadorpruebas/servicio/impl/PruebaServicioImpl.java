package pe.edu.unp.generadorpruebas.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.exception.EjecucionPruebaException;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.modelo.CasoDePrueba;
import pe.edu.unp.generadorpruebas.modelo.Metodo;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.modelo.PruebaMetodo;
import pe.edu.unp.generadorpruebas.modelo.RecursoJava;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoMavenServicio;
import pe.edu.unp.generadorpruebas.servicio.PruebaServicio;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Service
public class PruebaServicioImpl implements PruebaServicio {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private EjecutorComandoMavenServicio ejecutorComandoMavenServicio;

    @Override
    public ResultadoComando ejecutarPrueba(RecursoJava proyecto, Prueba prueba) throws EjecucionPruebaException {
        ResultadoComando resultadoComando;
        Proyecto proyectoMaven;
        try {
            //1,. ubicar ruta de creacion de archivo(s)
            proyectoMaven = (Proyecto) proyecto;
            //2.- para la prueba, crear el archivo java segun el modelo JUNITTestTemplate.template
            //3.- agregar al classpath
            //4.- ejecutar el comando de maven que ejecuta la prueba
            resultadoComando = ejecutorComandoMavenServicio.test(proyectoMaven, prueba);
            //5.- obtener y devolver resultados
            return resultadoComando;
        } catch (GeneradorException ex) {
            logger.error(ex, ex);
            throw new EjecucionPruebaException("Ocurrió un error al ejecutar la prueba");
        }
    }

    @Override
    public Prueba crearPrueba(CasoDePrueba casoDePrueba) {
        Prueba prueba;
        prueba = new Prueba(casoDePrueba.getId());
        prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo) {
        Prueba prueba;
        prueba = new Prueba(metodo.getClase().getNombre());
        metodo.getCasosPrueba().forEach((casoDePrueba) -> {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        });
        return prueba;
    }

    @Override
    public Prueba crearPruebas(Metodo metodo, List<CasoDePrueba> solucionesOptimas) {
        Prueba prueba;
        prueba = new Prueba(metodo.getClase().getNombre());
        solucionesOptimas.forEach((casoDePrueba) -> {
            prueba.addTestCode(crearPruebaMetodo(casoDePrueba));
        });
        return prueba;
    }

    @Override
    public List<Prueba> crearPruebas(List<CasoDePrueba> solucionesOptimas) {
        List<Prueba> listaPruebas;
        listaPruebas = new ArrayList<>();
        solucionesOptimas.forEach((casoDePrueba) -> {
            listaPruebas.add(crearPrueba(casoDePrueba));
        });
        return listaPruebas;
    }

    private PruebaMetodo crearPruebaMetodo(CasoDePrueba casoDePrueba) {
        PruebaMetodo pruebaMetodo;
        pruebaMetodo = new PruebaMetodo();
        return pruebaMetodo;
    }

}
