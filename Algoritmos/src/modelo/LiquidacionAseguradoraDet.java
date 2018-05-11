package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "liquidaaseguradoradet")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LiquidacionAseguradoraDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;
    @Column(name = "serie", nullable = false)
    private String serie;

    @Column(name = "numero", nullable = false)
    private Long numero;

    @Column(name = "importe")
    private BigDecimal importe;

    @Column(name = "importeneto")
    private BigDecimal importeNeto;

    @Column(name = "descuento")
    private BigDecimal descuento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idliquidaaseguradoracab")
    private LiquidacionAseguradoraCab liquidacionAseguradoraCab;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpaciente")
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicio")
    private Servicio servicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico")
    private Medico medico;

    public LiquidacionAseguradoraDet() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(BigDecimal importeNeto) {
        this.importeNeto = importeNeto;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public LiquidacionAseguradoraCab getLiquidacionAseguradoraCab() {
        return liquidacionAseguradoraCab;
    }

    public void setLiquidacionAseguradoraCab(LiquidacionAseguradoraCab liquidacionAseguradoraCab) {
        this.liquidacionAseguradoraCab = liquidacionAseguradoraCab;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
