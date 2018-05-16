package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class Familia extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String ctaContable;

    private BigDecimal margen;

    private String nombre;

    public Familia() {
    }

    public String getCtaContable() {
        return this.ctaContable;
    }

    public void setCtaContable(String ctaContable) {
        this.ctaContable = ctaContable;
    }

    public BigDecimal getMargen() {
        return this.margen;
    }

    public void setMargen(BigDecimal margen) {
        this.margen = margen;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
