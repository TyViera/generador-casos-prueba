package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoTarjetaDescuento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<TipoTarjetaDescuentoServicio> descuentos;

    public TipoTarjetaDescuento() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<TipoTarjetaDescuentoServicio> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<TipoTarjetaDescuentoServicio> descuentos) {
        this.descuentos = descuentos;
    }

}
