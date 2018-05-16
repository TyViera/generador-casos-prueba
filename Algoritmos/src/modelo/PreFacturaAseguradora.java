package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PreFacturaAseguradora extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Servicio servicio;

    private Admision admision;

    private AdmisionMedico admisionMedico;

    private Persona persona;

    private Medico medico;

    private Aseguradora aseguradora;

    private BigDecimal bruto;

    private BigDecimal descuento;

    private BigDecimal coaseguro;

    private BigDecimal deducible;

    private BigDecimal neto;

    public PreFacturaAseguradora() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
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

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public AdmisionMedico getAdmisionMedico() {
        return admisionMedico;
    }

    public void setAdmisionMedico(AdmisionMedico admisionMedico) {
        this.admisionMedico = admisionMedico;
    }

}
