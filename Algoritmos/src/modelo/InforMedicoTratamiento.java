package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import util.AuditoriaBean;

public class InforMedicoTratamiento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedico informedico;

    private Producto producto;

    private String indicacion;

    private BigDecimal cantidad;

    private Boolean atendido;

    private Timestamp fechaReceta;

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public Boolean getAtendido() {
        return atendido;
    }

    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Timestamp getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Timestamp fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

}
