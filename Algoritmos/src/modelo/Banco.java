package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Banco extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private List<PagoTarjeta> pagosTarjeta;

    public Banco() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
