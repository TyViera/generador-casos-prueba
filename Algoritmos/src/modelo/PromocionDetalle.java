package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PromocionDetalle extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Promocion promocion;

    private Servicio servicio;

    private BigDecimal porcentaje;

    public PromocionDetalle() {

    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

}
