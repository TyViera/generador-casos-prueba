package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class TarjetaDescuento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaEmision;

    private Timestamp fechaCaduca;

    private Timestamp fechaEntrega;

    private Long numeroTarjeta;

    private Boolean esEntregada;

    private Persona persona;

    private TipoTarjetaDescuento tipoTarjetaDescuento;

    public Timestamp getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Timestamp getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Timestamp fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Boolean getEsEntregada() {
        return esEntregada;
    }

    public void setEsEntregada(Boolean esEntregada) {
        this.esEntregada = esEntregada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public TipoTarjetaDescuento getTipoTarjetaDescuento() {
        return tipoTarjetaDescuento;
    }

    public void setTipoTarjetaDescuento(TipoTarjetaDescuento tipoTarjetaDescuento) {
        this.tipoTarjetaDescuento = tipoTarjetaDescuento;
    }

}
