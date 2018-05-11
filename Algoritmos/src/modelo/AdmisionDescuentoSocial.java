package modelo;

import util.AuditoriaBean;

/**
 * The persistent class for the admision database table.
 *
 */
public class AdmisionDescuentoSocial extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Admision admision;

    private TarjetaDescuento tarjetaDescuento;

    private TarifaSocial tarifaSocial;

    public AdmisionDescuentoSocial() {
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public TarjetaDescuento getTarjetaDescuento() {
        return tarjetaDescuento;
    }

    public void setTarjetaDescuento(TarjetaDescuento tarjetaDescuento) {
        this.tarjetaDescuento = tarjetaDescuento;
    }

    public TarifaSocial getTarifaSocial() {
        return tarifaSocial;
    }

    public void setTarifaSocial(TarifaSocial tarifaSocial) {
        this.tarifaSocial = tarifaSocial;
    }

}
