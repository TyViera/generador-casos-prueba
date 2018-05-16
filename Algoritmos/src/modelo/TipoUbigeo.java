package modelo;

import util.AuditoriaBean;

public class TipoUbigeo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    public TipoUbigeo() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
