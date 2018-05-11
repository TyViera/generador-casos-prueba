package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "liquidaciondiariadet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LiquidacionDiariaDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "importetotal")
    private BigDecimal importeTotal;

    @Column(name = "descuentos")
    private BigDecimal descuentos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idliquidaciondiariacab")
    private LiquidacionDiariaCab liquidacionDiariaCab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idporcentdscto")
    private PorcentajeDescuento porcentajeDescuento;

    @Transient
    private BigDecimal totalDescuentos;

    @Transient
    private BigDecimal totalTope;

    public LiquidacionDiariaDet() {
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(BigDecimal descuentos) {
        this.descuentos = descuentos;
    }

    public LiquidacionDiariaCab getLiquidacionDiariaCab() {
        return liquidacionDiariaCab;
    }

    public void setLiquidacionDiariaCab(LiquidacionDiariaCab liquidacionDiariaCab) {
        this.liquidacionDiariaCab = liquidacionDiariaCab;
    }

    public PorcentajeDescuento getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(PorcentajeDescuento porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(BigDecimal totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public BigDecimal getTotalTope() {
        return totalTope;
    }

    public void setTotalTope(BigDecimal totalTope) {
        this.totalTope = totalTope;
    }

}
