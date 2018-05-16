package modelo;

import util.AuditoriaBean;

public class PiezaDental extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String codigoTrama;

    private Integer numeroPieza;

    private String tipoPieza;

    public PiezaDental() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoTrama() {
        return codigoTrama;
    }

    public void setCodigoTrama(String codigoTrama) {
        this.codigoTrama = codigoTrama;
    }

    public Integer getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(Integer numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

}
