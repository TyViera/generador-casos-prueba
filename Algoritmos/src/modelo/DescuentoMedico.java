package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class DescuentoMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal tope;

    private Medico medico;

    private PorcentajeDescuento porcentajeDescuento;

    public DescuentoMedico() {
    }

    public BigDecimal getTope() {
        return tope;
    }

    public void setTope(BigDecimal tope) {
        this.tope = tope;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public PorcentajeDescuento getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(PorcentajeDescuento porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
