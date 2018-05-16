package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class DocumServicioDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Servicio servicio;

    private BigDecimal valorTotal;

    private BigDecimal valorDescuento;

    private BigDecimal valorCoaseguro;

    private BigDecimal valorDeducible;

    private BigDecimal valorNeto;

    private BigDecimal valorTotalOperacion;

    private BigDecimal valorDescuentoOperacion;

    private BigDecimal valorCoaseguroOperacion;

    private BigDecimal valorDeducibleOperacion;

    private BigDecimal valorNetoOperacion;

    private Boolean aFacturar;

    public DocumServicioDet() {
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

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(BigDecimal valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public BigDecimal getValorCoaseguro() {
        return valorCoaseguro;
    }

    public void setValorCoaseguro(BigDecimal valorCoaseguro) {
        this.valorCoaseguro = valorCoaseguro;
    }

    public BigDecimal getValorDeducible() {
        return valorDeducible;
    }

    public void setValorDeducible(BigDecimal valorDeducible) {
        this.valorDeducible = valorDeducible;
    }

    public BigDecimal getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(BigDecimal valorNeto) {
        this.valorNeto = valorNeto;
    }

    public BigDecimal getValorTotalOperacion() {
        return valorTotalOperacion;
    }

    public void setValorTotalOperacion(BigDecimal valorTotalOperacion) {
        this.valorTotalOperacion = valorTotalOperacion;
    }

    public BigDecimal getValorDescuentoOperacion() {
        return valorDescuentoOperacion;
    }

    public void setValorDescuentoOperacion(BigDecimal valorDescuentoOperacion) {
        this.valorDescuentoOperacion = valorDescuentoOperacion;
    }

    public BigDecimal getValorCoaseguroOperacion() {
        return valorCoaseguroOperacion;
    }

    public void setValorCoaseguroOperacion(BigDecimal valorCoaseguroOperacion) {
        this.valorCoaseguroOperacion = valorCoaseguroOperacion;
    }

    public BigDecimal getValorDeducibleOperacion() {
        return valorDeducibleOperacion;
    }

    public void setValorDeducibleOperacion(BigDecimal valorDeducibleOperacion) {
        this.valorDeducibleOperacion = valorDeducibleOperacion;
    }

    public BigDecimal getValorNetoOperacion() {
        return valorNetoOperacion;
    }

    public void setValorNetoOperacion(BigDecimal valorNetoOperacion) {
        this.valorNetoOperacion = valorNetoOperacion;
    }

    public Boolean getaFacturar() {
        return aFacturar;
    }

    public void setaFacturar(Boolean aFacturar) {
        this.aFacturar = aFacturar;
    }

}
