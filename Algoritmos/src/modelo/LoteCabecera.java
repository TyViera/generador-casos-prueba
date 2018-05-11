package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.dto.PreFacturaDTO;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Temporal;

/**
 * The persistent class for the liquidacionCab database table.
 *
 */
@Entity
@Table(name = "lotecab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LoteCabecera extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "fecini")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicial;

    @Column(name = "fecfin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "facturado")
    private Boolean facturado;

    @Column(name = "numtrama")
    private Integer numeroTrama;

    @Column(name = "estadotrama")
    private String estadoTrama;

    @JsonIgnoreProperties("loteCabecera")
    @OneToMany(mappedBy = "loteCabecera", fetch = FetchType.LAZY)
    private List<LoteDetalle> loteDetalles;

    @JsonIgnoreProperties("loteCabecera")
    @OneToMany(mappedBy = "loteCabecera", fetch = FetchType.LAZY)
    private List<LoteFactura> loteFacturas;

    @Transient
    private List<PreFacturaDTO> detalleDto;

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getFacturado() {
        return facturado;
    }

    public void setFacturado(Boolean facturado) {
        this.facturado = facturado;
    }

    public List<LoteDetalle> getLoteDetalles() {
        return loteDetalles;
    }

    public void setLoteDetalles(List<LoteDetalle> loteDetalles) {
        this.loteDetalles = loteDetalles;
    }

    public List<PreFacturaDTO> getDetalleDto() {
        return detalleDto;
    }

    public void setDetalleDto(List<PreFacturaDTO> detalleDto) {
        this.detalleDto = detalleDto;
    }

    public Integer getNumeroTrama() {
        return numeroTrama;
    }

    public void setNumeroTrama(Integer numeroTrama) {
        this.numeroTrama = numeroTrama;
    }

    public String getEstadoTrama() {
        return estadoTrama;
    }

    public void setEstadoTrama(String estadoTrama) {
        this.estadoTrama = estadoTrama;
    }

    public List<LoteFactura> getLoteFacturas() {
        return loteFacturas;
    }

    public void setLoteFacturas(List<LoteFactura> loteFacturas) {
        this.loteFacturas = loteFacturas;
    }

}
