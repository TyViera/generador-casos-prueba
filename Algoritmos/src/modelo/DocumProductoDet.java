package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "documproductodet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumProductoDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    @Column(name = "cantidad", precision = 9, scale = 2)
    private BigDecimal cantidad;

    @Column(name = "costounitario", precision = 9, scale = 2)
    private BigDecimal costoUnitario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idoperacion")
    private Operacion operacion;

    @Column(name = "valorventa", precision = 9, scale = 2)
    private BigDecimal valorVenta;

    @Column(name = "valorexonerado", precision = 9, scale = 2)
    private BigDecimal valorExonerado;

    @Column(name = "valordscto", precision = 9, scale = 2)
    private BigDecimal valorDscto;

    @Column(name = "valorigv", precision = 9, scale = 2)
    private BigDecimal valorIgv;

    @Column(name = "valortotal", precision = 9, scale = 2)
    private BigDecimal valortotal;

    @Column(name = "valorinafecto", precision = 9, scale = 2)
    private BigDecimal valorInfecto;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecvencim")
    private Date fechaVencimiento;

    @Column(name = "costopromedio", precision = 9, scale = 2)
    private BigDecimal costoPromedio;

    @Column(name = "idinformedicotratamiento")
    private Long idInformedicoTratamiento;

    @Transient
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

}
