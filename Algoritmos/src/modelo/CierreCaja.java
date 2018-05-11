package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

@Entity
@Table(name = "cierrecaja")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class CierreCaja extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "serie", nullable = false)
    private String serie;

    @Column(name = "montoapertura", nullable = false)
    private BigDecimal montoApertura;

    @Column(name = "fechaapertura")
    private Timestamp fechaApertura;

    @Column(name = "efectivo", nullable = false)
    private BigDecimal efectivo;

    @Column(name = "tarjetas", nullable = false)
    private BigDecimal tarjetas;

    @Column(name = "deposito", nullable = false)
    private BigDecimal deposito;

    @Column(name = "faltante", nullable = false)
    private BigDecimal faltante;

    @Column(name = "sobrante", nullable = false)
    private BigDecimal sobrante;

    @Column(name = "tipoimpresora", nullable = false)
    private String tipoImpresora;

    @Column(name = "impresoracaja", nullable = false)
    private String impresoraCaja;

    @Column(name = "fechacierre")
    private Timestamp fechaCierre;

    @Column(name = "cerrado", nullable = false)
    private Boolean cerrado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @Detalle
    @JsonIgnoreProperties("cierreCaja")
    @OneToMany(mappedBy = "cierreCaja", fetch = FetchType.LAZY)
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
