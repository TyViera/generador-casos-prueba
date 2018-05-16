package modelo;

import java.math.BigDecimal;
import java.util.Date;
import util.AuditoriaBean;

public class TipoCambio extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String moneda;

    private BigDecimal importe;

    private Date fechaCambio;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }
}
