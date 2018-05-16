package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class TipoTarjetaDescuentoServicio extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal descuento;

    private TarifaParticular tarifaParticular;

    private TipoTarjetaDescuento tipoTarjetaDescuento;

    public TipoTarjetaDescuentoServicio() {

    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }

    public TipoTarjetaDescuento getTipoTarjetaDescuento() {
        return tipoTarjetaDescuento;
    }

    public void setTipoTarjetaDescuento(TipoTarjetaDescuento tipoTarjetaDescuento) {
        this.tipoTarjetaDescuento = tipoTarjetaDescuento;
    }
}
