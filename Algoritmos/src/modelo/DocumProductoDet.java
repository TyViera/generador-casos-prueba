package modelo;

import java.math.BigDecimal;
import java.util.Date;
import util.AuditoriaBean;

public class DocumProductoDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoCabecera documentoCabecera;

    private Producto producto;

    private BigDecimal cantidad;

    private BigDecimal costoUnitario;

    private Operacion operacion;

    private BigDecimal valorVenta;

    private BigDecimal valorExonerado;

    private BigDecimal valorDscto;

    private BigDecimal valorIgv;

    private BigDecimal valortotal;

    private BigDecimal valorInfecto;

    private Date fechaVencimiento;

    private BigDecimal costoPromedio;

    private Long idInformedicoTratamiento;

    private BigDecimal cantDevuelta;

    public DocumProductoDet() {
    }

    public DocumentoCabecera getDocumentoCabecera() {
        return documentoCabecera;
    }

    public void setDocumentoCabecera(DocumentoCabecera documentoCabecera) {
        this.documentoCabecera = documentoCabecera;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public BigDecimal getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(BigDecimal valorVenta) {
        this.valorVenta = valorVenta;
    }

    public BigDecimal getValorExonerado() {
        return valorExonerado;
    }

    public void setValorExonerado(BigDecimal valorExonerado) {
        this.valorExonerado = valorExonerado;
    }

    public BigDecimal getValorDscto() {
        return valorDscto;
    }

    public void setValorDscto(BigDecimal valorDscto) {
        this.valorDscto = valorDscto;
    }

    public BigDecimal getValorIgv() {
        return valorIgv;
    }

    public void setValorIgv(BigDecimal valorIgv) {
        this.valorIgv = valorIgv;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigDecimal getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(BigDecimal costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public BigDecimal getCantDevuelta() {
        return cantDevuelta;
    }

    public void setCantDevuelta(BigDecimal cantDevuelta) {
        this.cantDevuelta = cantDevuelta;
    }

    public BigDecimal getValorInfecto() {
        return valorInfecto;
    }

    public void setValorInfecto(BigDecimal valorInfecto) {
        this.valorInfecto = valorInfecto;
    }

    public Long getIdInformedicoTratamiento() {
        return idInformedicoTratamiento;
    }

    public void setIdInformedicoTratamiento(Long idInformedicoTratamiento) {
        this.idInformedicoTratamiento = idInformedicoTratamiento;
    }

    @Override
    public String toString() {
        return "DocumProductoDet{" + "documentoCabecera=" + documentoCabecera + ", producto=" + producto + ", cantidad=" + cantidad + ", costoUnitario=" + costoUnitario + ", operacion=" + operacion + ", valorVenta=" + valorVenta + ", valorExonerado=" + valorExonerado + ", valorDscto=" + valorDscto + ", valorIgv=" + valorIgv + ", valortotal=" + valortotal + ", valorInfecto=" + valorInfecto + ", fechaVencimiento=" + fechaVencimiento + ", costoPromedio=" + costoPromedio + ", idInformedicoTratamiento=" + idInformedicoTratamiento + ", cantDevuelta=" + cantDevuelta + '}';
    }

}
