/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unp.generadorpruebas.util;

import java.io.Serializable;
import org.junit.runner.Result;
import pe.edu.unp.generadorpruebas.modelo.Prueba;

/**
 *
 * @author nazav
 */
public class PruebaView implements Serializable {

    private String archivo;
    private String metodo;
    private Result result;
    private Prueba prueba;

    public PruebaView() {
    }

    public PruebaView(String archivo, String metodo, Result result, Prueba prueba) {
        this.archivo = archivo;
        this.metodo = metodo;
        this.result = result;
        this.prueba = prueba;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "PruebaView{" + "archivo=" + archivo + ", metodo=" + metodo + ", result=" + result + ", prueba=" + prueba + '}';
    }

}
