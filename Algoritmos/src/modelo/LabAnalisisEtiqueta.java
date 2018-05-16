package modelo;

import util.AuditoriaBean;

public class LabAnalisisEtiqueta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String etiqueta;
    private String descripcion;

    public LabAnalisisEtiqueta() {
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
