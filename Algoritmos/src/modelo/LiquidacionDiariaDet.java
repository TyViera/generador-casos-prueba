package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class LiquidacionDiariaDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal importeTotal;

    private BigDecimal descuentos;

    private LiquidacionDiariaCab liquidacionDiariaCab;

    private PorcentajeDescuento porcentajeDescuento;

    private BigDecimal totalDescuentos;

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
