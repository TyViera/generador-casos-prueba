package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class Moneda extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal valor;

    public Moneda() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
