package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PorcentajeDescuento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String concepto;

    private String tipo;

    private BigDecimal importe;

    private Servicio servicio;

    public PorcentajeDescuento() {
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

}
