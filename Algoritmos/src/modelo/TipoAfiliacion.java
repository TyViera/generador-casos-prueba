package modelo;

import util.AuditoriaBean;

public class TipoAfiliacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String codigo;

    private String nombre;

    public TipoAfiliacion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
