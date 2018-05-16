package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class LiquidacionAseguradoraDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;
    
    private String serie;

    private Long numero;

    private BigDecimal importe;

    private BigDecimal importeNeto;

    private BigDecimal descuento;

    private LiquidacionAseguradoraCab liquidacionAseguradoraCab;

    private Paciente paciente;

    private Servicio servicio;

    private Medico medico;

    public LiquidacionAseguradoraDet() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(BigDecimal importeNeto) {
        this.importeNeto = importeNeto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public LiquidacionAseguradoraCab getLiquidacionAseguradoraCab() {
        return liquidacionAseguradoraCab;
    }

    public void setLiquidacionAseguradoraCab(LiquidacionAseguradoraCab liquidacionAseguradoraCab) {
        this.liquidacionAseguradoraCab = liquidacionAseguradoraCab;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
