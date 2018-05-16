package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class FacturasPagadasCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaCobro;

    private Timestamp fechaDeposito;

    private BigDecimal importeDeposito;

    private Boolean liquidada;

    private Aseguradora aseguradora;

    private PorcentajeDescuento porcentajeDescuento;

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
