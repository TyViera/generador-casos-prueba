package pe.edu.unp.generadorpruebas.util;

import java.util.Objects;

public class ResultadoComando {

    private StreamGobbler gobbler;
    private Integer exitValue;

    public ResultadoComando() {
        this.gobbler = null;
        this.exitValue = 1;
    }

    public ResultadoComando(StreamGobbler gobbler) {
        this();
        this.gobbler = gobbler;
    }

    public ResultadoComando(StreamGobbler gobbler, Integer exitValue) {
        this.gobbler = gobbler;
        this.exitValue = exitValue;
    }

    public StreamGobbler getGobbler() {
        return gobbler;
    }

    public Integer getExitValue() {
        return exitValue;
    }

    public Boolean esResultadoExito() {
        return Objects.equals(exitValue, Constantes.RESULTADO_COMANDO_CORRECTO);
    }

}
