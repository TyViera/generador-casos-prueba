package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "facturaspagadascab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class FacturasPagadasCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fechacobro")
    private Timestamp fechaCobro;

    @Column(name = "fechadeposito")
    private Timestamp fechaDeposito;

    @Column(name = "importedeposito")
    private BigDecimal importeDeposito;

    @Column(name = "liquidada")
    private Boolean liquidada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaseguradora")
    private Aseguradora aseguradora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idporcentajedscto")
    private PorcentajeDescuento porcentajeDescuento;

    @JsonIgnoreProperties("facturasPagadasCab")
    @OneToMany(mappedBy = "facturasPagadasCab", fetch = FetchType.LAZY)
    private List<FacturasPagadasDet> facturasPagadasDet;

    public FacturasPagadasCab() {
    }

    public Timestamp getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Timestamp fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Timestamp getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(Timestamp fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public BigDecimal getImporteDeposito() {
        return importeDeposito;
    }

    public void setImporteDeposito(BigDecimal importeDeposito) {
        this.importeDeposito = importeDeposito;
    }

    public Boolean getLiquidada() {
        return liquidada;
    }

    public void setLiquidada(Boolean liquidada) {
        this.liquidada = liquidada;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public PorcentajeDescuento getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(PorcentajeDescuento porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public List<FacturasPagadasDet> getFacturasPagadasDet() {
        return facturasPagadasDet;
    }

    public void setFacturasPagadasDet(List<FacturasPagadasDet> facturasPagadasDet) {
        this.facturasPagadasDet = facturasPagadasDet;
    }

}
