/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.exception;

/**
 *
 * @author nazaret
 */
public class GeneradorException extends Exception {

    public GeneradorException(String message) {
        super(message);
    }

    public GeneradorException(Throwable cause) {
        super(cause);
    }
}
