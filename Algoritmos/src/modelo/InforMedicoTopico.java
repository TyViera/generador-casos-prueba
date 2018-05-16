package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import util.AuditoriaBean;

public class InforMedicoTopico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedico informedico;

    private Boolean atendido;

    private String indicacion;

    private Timestamp fechaReceta;

    private BigDecimal cantidad;

    private Tarifario tarifa;

    private TarifaParticular tarifaParticular;

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public Tarifario getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifario tarifa) {
        this.tarifa = tarifa;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }

    public Timestamp getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Timestamp fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

}
