package modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "documexamenesdet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumExamenesDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idsegus")
    private Tarifario examenSeguro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtarifaparticular")
    private TarifaParticular examenParticular;

    @Column(name = "valortotal", precision = 9, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "valodscto", precision = 9, scale = 2)
    private BigDecimal valorDescuento;

    @Column(name = "valorigv", precision = 9, scale = 2)
    private BigDecimal valorIGV;

    @Column(name = "valorventa", precision = 9, scale = 2)
    private BigDecimal valorVenta;

    @Column(name = "preciounitario", precision = 9, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "valortotalop", precision = 9, scale = 2)
    private BigDecimal valorTotalOperacion;

    @Column(name = "valodsctoop", precision = 9, scale = 2)
    private BigDecimal valorDescuentoOperacion;

    @Column(name = "valorigvop", precision = 9, scale = 2)
    private BigDecimal valorIGVOperacion;

    @Column(name = "valorventaop", precision = 9, scale = 2)
    private BigDecimal valorVentaOperacion;

    @Column(name = "preciounitarioop", precision = 9, scale = 2)
    private BigDecimal precioUnitarioOperacion;

    @Column(name = "cantidad", precision = 9, scale = 2)
    private BigDecimal cantidad;

    @Column(name = "piezastratadas")
    private Integer piezasTratadas;

    @Column(name = "afacturar")
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
