package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
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

@Entity
@Table(name = "documserviciodet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class DocumServicioDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentocab")
    private DocumentoCabecera documentoCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicio")
    private Servicio servicio;

    @Column(name = "valototal", precision = 9, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "valordscto", precision = 9, scale = 2)
    private BigDecimal valorDescuento;

    @Column(name = "valorcoaseguro", precision = 9, scale = 2)
    private BigDecimal valorCoaseguro;

    @Column(name = "valordeducible", precision = 9, scale = 2)
    private BigDecimal valorDeducible;

    @Column(name = "valorneto", precision = 9, scale = 2)
    private BigDecimal valorNeto;

    @Column(name = "valototalop", precision = 9, scale = 2)
    private BigDecimal valorTotalOperacion;

    @Column(name = "valordsctoop", precision = 9, scale = 2)
    private BigDecimal valorDescuentoOperacion;

    @Column(name = "valorcoaseguroop", precision = 9, scale = 2)
    private BigDecimal valorCoaseguroOperacion;

    @Column(name = "valordeducibleop", precision = 9, scale = 2)
    private BigDecimal valorDeducibleOperacion;

    @Column(name = "valornetoop", precision = 9, scale = 2)
    private BigDecimal valorNetoOperacion;

    @Column(name = "afacturar")
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
