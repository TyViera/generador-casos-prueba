package pe.edu.unp.generadorpruebas.servicio.impl;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.springframework.stereotype.Service;
import pe.edu.unp.generadorpruebas.servicio.EjecutorComandoServicio;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;
import pe.edu.unp.generadorpruebas.util.StreamGobbler;

@Service
public class EjecutorComandoServicioImpl implements EjecutorComandoServicio {

    @Override
    public ResultadoComando ejecutarComando(String comando, String rutaBase) throws IOException, InterruptedException {
        return ejecutarComando(comando, rutaBase, null);
    }

    @Override
    public ResultadoComando ejecutarComando(String comando, String rutaBase, OutputStream flujoSalida) throws IOException, InterruptedException {
        return this.ejecutarComando(comando, rutaBase, flujoSalida, flujoSalida);
    }
    
    @Override
    public ResultadoComando ejecutarComando(String comando, String rutaBase, OutputStream flujoSalida, OutputStream flujoSalidaError) throws IOException, InterruptedException {
        Process exec = Runtime.getRuntime().exec(comando, null, new File(rutaBase));
        StreamGobbler outputGobbler = new StreamGobbler(flujoSalida, flujoSalidaError, exec, comando);
        outputGobbler.start();
        Integer exitValue = exec.waitFor();
        return new ResultadoComando(outputGobbler, exitValue);
    }

}
