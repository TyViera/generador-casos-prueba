package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class TarifaFijaSegus extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal monto;

    private Tarifario tarifario;

    private Aseguradora aseguradora;

    public TarifaFijaSegus() {
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

}
