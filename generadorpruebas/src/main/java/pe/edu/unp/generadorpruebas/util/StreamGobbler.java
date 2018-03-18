/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.util;

/**
 *
 * @author nazaret
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StreamGobbler extends Thread {

    private final Logger logger = Logger.getLogger(getClass().getName());

    private PrintStream outError;
    private PrintStream out;
    private InputStream is;
    private InputStream isError;
    private String type;
    private StringBuffer resultadoComando;
    private StringBuffer resultadoErrorComando;

    public StreamGobbler(InputStream is, String type) {
        this.resultadoComando = new StringBuffer();
        this.resultadoErrorComando = new StringBuffer();
        this.out = null;
        this.outError = null;
        this.is = is;
        this.type = type;
    }

    public StreamGobbler(InputStream is, InputStream isError, String type) {
        this(is, type);
        this.isError = isError;
    }

    public StreamGobbler(OutputStream out, InputStream is, String type) {
        this(is, type);
        if (out != null) {
            this.out = new PrintStream(out);
        }
    }

    public StreamGobbler(OutputStream out, OutputStream outError, InputStream is, String type) {
        this(out, is, type);
        if (outError != null) {
            this.outError = new PrintStream(out);
        }
    }

    public StreamGobbler(OutputStream out, OutputStream outError, Process exec, String type) {
        this(exec.getInputStream(), exec.getErrorStream(), type);
        if (out != null) {
            this.out = new PrintStream(out);
        }
        if (outError != null) {
            this.outError = new PrintStream(out);
        }
    }

    public StringBuffer getResultadoComando() {
        return resultadoComando;
    }

    public StringBuffer getResultadoErrorComando() {
        return resultadoErrorComando;
    }

    @Override
    public void run() {
        try {
            obtenerResultado(is, out, resultadoComando);
            obtenerResultado(isError, outError, resultadoErrorComando);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    private void obtenerResultado(InputStream inputStream, PrintStream printStream, StringBuffer stringBuffer) throws IOException {
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            if (printStream != null) {
                printStream.println(line);
            }
            stringBuffer.append(line).append("\n");
        }
    }

}
