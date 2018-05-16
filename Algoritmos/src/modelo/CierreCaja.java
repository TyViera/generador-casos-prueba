package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class CierreCaja extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String serie;

    private BigDecimal montoApertura;

    private Timestamp fechaApertura;

    private BigDecimal efectivo;

    private BigDecimal tarjetas;

    private BigDecimal deposito;

    private BigDecimal faltante;

    private BigDecimal sobrante;

    private String tipoImpresora;

    private String impresoraCaja;

    private Timestamp fechaCierre;

    private Boolean cerrado;

    private Usuario usuario;

    private List<CierreCajaMoneda> cierreCajaMonedas;

    public CierreCaja() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public BigDecimal getMontoApertura() {
        return montoApertura;
    }

    public void setMontoApertura(BigDecimal montoApertura) {
        this.montoApertura = montoApertura;
    }

    public Timestamp getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Timestamp fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public BigDecimal getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(BigDecimal efectivo) {
        this.efectivo = efectivo;
    }

    public BigDecimal getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(BigDecimal tarjetas) {
        this.tarjetas = tarjetas;
    }

    public BigDecimal getDeposito() {
        return deposito;
    }

    public void setDeposito(BigDecimal deposito) {
        this.deposito = deposito;
    }

    public BigDecimal getFaltante() {
        return faltante;
    }

    public void setFaltante(BigDecimal faltante) {
        this.faltante = faltante;
    }

    public BigDecimal getSobrante() {
        return sobrante;
    }

    public void setSobrante(BigDecimal sobrante) {
        this.sobrante = sobrante;
    }

    public Timestamp getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Timestamp fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(Boolean cerrado) {
        this.cerrado = cerrado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<CierreCajaMoneda> getCierreCajaMonedas() {
        return cierreCajaMonedas;
    }

    public void setCierreCajaMonedas(List<CierreCajaMoneda> cierreCajaMonedas) {
        this.cierreCajaMonedas = cierreCajaMonedas;
    }

    public String getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(String tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }

    public String getImpresoraCaja() {
        return impresoraCaja;
    }

    public void setImpresoraCaja(String impresoraCaja) {
        this.impresoraCaja = impresoraCaja;
    }

}
