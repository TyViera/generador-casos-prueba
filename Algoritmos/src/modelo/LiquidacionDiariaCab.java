package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class LiquidacionDiariaCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaLiquidacion;

    private BigDecimal totalDescuento;

    private Medico medico;

    private List<LiquidacionDiariaDet> liquidacionDiariaDets;

    public LiquidacionDiariaCab() {
    }

    public Timestamp getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Timestamp fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<LiquidacionDiariaDet> getLiquidacionDiariaDets() {
        return liquidacionDiariaDets;
    }

    public void setLiquidacionDiariaDets(List<LiquidacionDiariaDet> liquidacionDiariaDets) {
        this.liquidacionDiariaDets = liquidacionDiariaDets;
    }

}
