package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import util.AuditoriaBean;

public class LiquidacionAseguradoraCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaCobro;

    private Timestamp fechaDeposito;

    private Date fechaPago;

    private BigDecimal importeDeposito;

    private Aseguradora aseguradora;

    private List<LiquidacionAseguradoraDet> liquidacionAseguradoraDetalle;

    public LiquidacionAseguradoraCab() {
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

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getImporteDeposito() {
        return importeDeposito;
    }

    public void setImporteDeposito(BigDecimal importeDeposito) {
        this.importeDeposito = importeDeposito;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public List<LiquidacionAseguradoraDet> getLiquidacionAseguradoraDetalle() {
        return liquidacionAseguradoraDetalle;
    }

    public void setLiquidacionAseguradoraDetalle(List<LiquidacionAseguradoraDet> liquidacionAseguradoraDetalle) {
        this.liquidacionAseguradoraDetalle = liquidacionAseguradoraDetalle;
    }

}
