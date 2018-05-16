package modelo;

import java.util.Date;
import java.util.List;
import util.AuditoriaBean;

public class LoteCabecera extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Date fechaInicial;

    private Date fechaFin;

    private Boolean facturado;

    private Integer numeroTrama;

    private String estadoTrama;

    private List<LoteDetalle> loteDetalles;

    private List<LoteFactura> loteFacturas;

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getFacturado() {
        return facturado;
    }

    public void setFacturado(Boolean facturado) {
        this.facturado = facturado;
    }

    public List<LoteDetalle> getLoteDetalles() {
        return loteDetalles;
    }

    public void setLoteDetalles(List<LoteDetalle> loteDetalles) {
        this.loteDetalles = loteDetalles;
    }

    public Integer getNumeroTrama() {
        return numeroTrama;
    }

    public void setNumeroTrama(Integer numeroTrama) {
        this.numeroTrama = numeroTrama;
    }

    public String getEstadoTrama() {
        return estadoTrama;
    }

    public void setEstadoTrama(String estadoTrama) {
        this.estadoTrama = estadoTrama;
    }

    public List<LoteFactura> getLoteFacturas() {
        return loteFacturas;
    }

    public void setLoteFacturas(List<LoteFactura> loteFacturas) {
        this.loteFacturas = loteFacturas;
    }

}
