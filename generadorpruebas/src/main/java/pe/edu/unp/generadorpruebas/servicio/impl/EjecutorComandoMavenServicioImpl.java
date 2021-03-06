/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.modelo.Proyecto;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoMavenServicio;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoServicio;
import pe.edu.unp.generadorpruebas.exception.GeneradorException;
import pe.edu.unp.generadorpruebas.modelo.Prueba;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

@Service
public class EjecutorComandoMavenServicioImpl implements EjecutorComandoMavenServicio {

    @Autowired
    private EjecutorComandoServicio ejecutorComandoServicio;

    @Override
    public ResultadoComando clean(Proyecto proyecto) throws GeneradorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultadoComando install(Proyecto proyecto) throws GeneradorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultadoComando test(Proyecto proyecto, Prueba prueba) throws GeneradorException {
        try {
            String comando, ubicacionProyecto;
            comando = "mvn -Dtest=";
            comando = comando + prueba.getPackageName() + "." + prueba.getTestClassName();
            comando = comando + " surefire:test";
            ubicacionProyecto = proyecto.getRutaBase();
            return ejecutorComandoServicio.ejecutarComando(comando, ubicacionProyecto);
        } catch (IOException | InterruptedException ex) {
            throw new GeneradorException(ex);
        }
    }

    @Override
    public ResultadoComando build(Proyecto proyecto) throws GeneradorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ResultadoComando compile(Proyecto proyecto) throws GeneradorException {
        try {
            return ejecutorComandoServicio.ejecutarComando("mvn compile -Dmaven.test.skip=true", proyecto.getRutaBase());
        } catch (IOException | InterruptedException ex) {
            throw new GeneradorException(ex);
        }
    }

}
