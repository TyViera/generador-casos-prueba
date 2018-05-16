package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PolizaCobertura extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal copagoFijo;

    private BigDecimal copagoVariable;

    private BigDecimal copagoDental;

    private Cobertura cobertura;

    private Poliza poliza;

    public PolizaCobertura() {
    }

    public BigDecimal getCopagoFijo() {
        return this.copagoFijo;
    }

    public void setCopagoFijo(BigDecimal copagoFijo) {
        this.copagoFijo = copagoFijo;
    }

    public BigDecimal getCopagoVariable() {
        return this.copagoVariable;
    }

    public void setCopagoVariable(BigDecimal copagoVariable) {
        this.copagoVariable = copagoVariable;
    }

    public BigDecimal getCopagoDental() {
        return copagoDental;
    }

    public void setCopagoDental(BigDecimal copagoDental) {
        this.copagoDental = copagoDental;
    }

    public Cobertura getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Poliza getPoliza() {
        return this.poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

}
