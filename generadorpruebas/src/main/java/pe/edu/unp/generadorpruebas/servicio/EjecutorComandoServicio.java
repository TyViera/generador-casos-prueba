package pe.edu.unp.generadorpruebas.servicio;

import java.io.IOException;
import java.io.OutputStream;
import pe.edu.unp.generadorpruebas.util.ResultadoComando;

public interface EjecutorComandoServicio {

    public ResultadoComando ejecutarComando(String comando, String rutaBase) throws IOException, InterruptedException;

    public ResultadoComando ejecutarComando(String comando, String rutaBase, OutputStream flujoSalida) throws IOException, InterruptedException;

}
