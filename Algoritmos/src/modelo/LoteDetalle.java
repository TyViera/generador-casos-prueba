package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import util.AuditoriaBean;

public class LoteDetalle extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaAdm;

    private BigDecimal bruto;

    private BigDecimal descuento;

    private BigDecimal coaseguro;

    private BigDecimal deducible;

    private BigDecimal neto;

    private LoteCabecera loteCabecera;

    private Admision admision;

    private Persona persona;

    private Persona titular;

    private Aseguradora aseguradora;

    public Timestamp getFechaAdm() {
        return fechaAdm;
    }

    public void setFechaAdm(Timestamp fechaAdm) {
        this.fechaAdm = fechaAdm;
    }

    public BigDecimal getBruto() {
        return bruto;
    }

    public void setBruto(BigDecimal bruto) {
        this.bruto = bruto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getCoaseguro() {
        return coaseguro;
    }

    public void setCoaseguro(BigDecimal coaseguro) {
        this.coaseguro = coaseguro;
    }

    public BigDecimal getDeducible() {
        return deducible;
    }

    public void setDeducible(BigDecimal deducible) {
        this.deducible = deducible;
    }

    public BigDecimal getNeto() {
        return neto;
    }

    public void setNeto(BigDecimal neto) {
        this.neto = neto;
    }

    public LoteCabecera getLoteCabecera() {
        return loteCabecera;
    }

    public void setLoteCabecera(LoteCabecera loteCabecera) {
        this.loteCabecera = loteCabecera;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
}
