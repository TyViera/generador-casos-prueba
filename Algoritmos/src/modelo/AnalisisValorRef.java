package modelo;

import util.AuditoriaBean;

public class AnalisisValorRef extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private Integer orden;

    private AnalisisParametro analisisParametro;

    public AnalisisValorRef() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public AnalisisParametro getAnalisisParametro() {
        return analisisParametro;
    }

    public void setAnalisisParametro(AnalisisParametro analisisParametro) {
        this.analisisParametro = analisisParametro;
    }

}
