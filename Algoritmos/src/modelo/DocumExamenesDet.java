package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class DocumExamenesDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Tarifario examenSeguro;

    private TarifaParticular examenParticular;

    private BigDecimal valorTotal;

    private BigDecimal valorDescuento;

    private BigDecimal valorIGV;

    private BigDecimal valorVenta;

    private BigDecimal precioUnitario;

    private BigDecimal valorTotalOperacion;

    private BigDecimal valorDescuentoOperacion;

    private BigDecimal valorIGVOperacion;

    private BigDecimal valorVentaOperacion;

    private BigDecimal precioUnitarioOperacion;

    private BigDecimal cantidad;

    private Integer piezasTratadas;

    private Boolean aFacturar;

    public DocumExamenesDet() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Tarifario getExamenSeguro() {
        return examenSeguro;
    }

    public void setExamenSeguro(Tarifario examenSeguro) {
        this.examenSeguro = examenSeguro;
    }

    public TarifaParticular getExamenParticular() {
        return examenParticular;
    }

    public void setExamenParticular(TarifaParticular examenParticular) {
        this.examenParticular = examenParticular;
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

    public BigDecimal getValorIGV() {
        return valorIGV;
    }

    public void setValorIGV(BigDecimal valorIGV) {
        this.valorIGV = valorIGV;
    }

    public BigDecimal getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(BigDecimal valorVenta) {
        this.valorVenta = valorVenta;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getaFacturar() {
        return aFacturar;
    }

    public void setaFacturar(Boolean aFacturar) {
        this.aFacturar = aFacturar;
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

    public BigDecimal getValorIGVOperacion() {
        return valorIGVOperacion;
    }

    public void setValorIGVOperacion(BigDecimal valorIGVOperacion) {
        this.valorIGVOperacion = valorIGVOperacion;
    }

    public BigDecimal getValorVentaOperacion() {
        return valorVentaOperacion;
    }

    public void setValorVentaOperacion(BigDecimal valorVentaOperacion) {
        this.valorVentaOperacion = valorVentaOperacion;
    }

    public BigDecimal getPrecioUnitarioOperacion() {
        return precioUnitarioOperacion;
    }

    public void setPrecioUnitarioOperacion(BigDecimal precioUnitarioOperacion) {
        this.precioUnitarioOperacion = precioUnitarioOperacion;
    }

    public Integer getPiezasTratadas() {
        return piezasTratadas;
    }

    public void setPiezasTratadas(Integer piezasTratadas) {
        this.piezasTratadas = piezasTratadas;
    }

}
