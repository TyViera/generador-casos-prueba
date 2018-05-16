package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoTarjetaCredito extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<PagoTarjeta> pagosTarjeta;

    public TipoTarjetaCredito() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PagoTarjeta> getPagosTarjeta() {
        return pagosTarjeta;
    }

    public void setPagosTarjeta(List<PagoTarjeta> pagosTarjeta) {
        this.pagosTarjeta = pagosTarjeta;
    }

}
