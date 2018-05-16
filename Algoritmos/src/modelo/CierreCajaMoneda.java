package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class CierreCajaMoneda extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Usuario usuario;

    private CierreCaja cierreCaja;

    private Moneda moneda;

    private BigDecimal cantidad;

    public CierreCajaMoneda() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CierreCaja getCierreCaja() {
        return cierreCaja;
    }

    public void setCierreCaja(CierreCaja cierreCaja) {
        this.cierreCaja = cierreCaja;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

}
