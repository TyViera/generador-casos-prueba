package modelo;

import util.AuditoriaBean;

public class Pais extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    public Pais() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
