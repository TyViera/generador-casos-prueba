package modelo;

import util.AuditoriaBean;

public class Parametro extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String descripcion;

    private String valor;

    public Parametro() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
