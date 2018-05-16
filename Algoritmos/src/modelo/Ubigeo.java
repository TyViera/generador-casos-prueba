package modelo;

import util.AuditoriaBean;

public class Ubigeo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String codigoUbigeo;

    private TipoUbigeo tipoUbigeo;

    public Ubigeo() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoUbigeo getTipoUbigeo() {
        return this.tipoUbigeo;
    }

    public void setTipoUbigeo(TipoUbigeo tipoUbigeo) {
        this.tipoUbigeo = tipoUbigeo;
    }

    public String getCodigoUbigeo() {
        return codigoUbigeo;
    }

    public void setCodigoUbigeo(String codigoUbigeo) {
        this.codigoUbigeo = codigoUbigeo;
    }
}
