package modelo;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

@Entity
@Table(name = "lotedet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LoteDetalle  extends AuditoriaBean
{

    private static final long serialVersionUID = 1L;

    @Column(name = "fechaadm")
    private Timestamp fechaAdm;

    @Column(name = "bruto", precision = 9, scale = 2)
    private BigDecimal bruto;

    @Column(name = "descuento", precision = 9, scale = 2)
    private BigDecimal descuento;

    @Column(name = "coaseguro", precision = 9, scale = 2)
    private BigDecimal coaseguro;

    @Column(name = "deducible", precision = 9, scale = 2)
    private BigDecimal deducible;

    @Column(name = "neto", precision = 9, scale = 2)
    private BigDecimal neto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlotecab")
    private LoteCabecera loteCabecera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmision")
    private Admision admision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpaciente")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtitular")
    private Persona titular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idaseguradora")
    private Aseguradora aseguradora;


    public Timestamp getFechaAdm() {
        return fechaAdm;
    }

    public void setFechaAdm(Timestamp fechaAdm) {
        this.fechaAdm = fechaAdm;
    }

    public BigDecimal getBruto() {
        return bruto;
    }

    public void setBruto(BigDecimal bruto) {
        this.bruto = bruto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getCoaseguro() {
        return coaseguro;
    }

    public void setCoaseguro(BigDecimal coaseguro) {
        this.coaseguro = coaseguro;
    }

    public BigDecimal getDeducible() {
        return deducible;
    }

    public void setDeducible(BigDecimal deducible) {
        this.deducible = deducible;
    }

    public BigDecimal getNeto() {
        return neto;
    }

    public void setNeto(BigDecimal neto) {
        this.neto = neto;
    }

    public LoteCabecera getLoteCabecera() {
        return loteCabecera;
    }

    public void setLoteCabecera(LoteCabecera loteCabecera) {
        this.loteCabecera = loteCabecera;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
}
