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

    private PrintStream out;
    private InputStream is;
    private String type;
    private StringBuffer resultadoComando;

    public StreamGobbler(InputStream is, String type) {
        this.resultadoComando = new StringBuffer();
        this.out = null;
        this.is = is;
        this.type = type;
    }

    public StreamGobbler(OutputStream out, InputStream is, String type) {
        this(is, type);
        if (out != null) {
            this.out = new PrintStream(out);
        }
    }

    public StringBuffer getResultadoComando() {
        return resultadoComando;
    }

    @Override
    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                if (out != null) {
                    out.println(line);
                }
                resultadoComando.append(line);
            }
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
}
