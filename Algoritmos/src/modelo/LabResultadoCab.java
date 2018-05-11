package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * The persistent class for the laboratorio database table.
 *
 */
@Entity
@Table(name = "labresultadocab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabResultadoCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idlabadmisioncab")
    private LabAdmisionCab labAdmisionCab;

    @Column(name = "fecharesultado")
    private Timestamp fechaResultado;

    @Column(name = "entregado")
    private Boolean entregado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuarioresp")
    private Usuario usuarioResp;

    @Column(name = "fechaentrega")
    private Timestamp fechaEntrega;

    @Column(name = "observacion")
    private String observacion;

    @JsonIgnoreProperties("labResultadocab")
    @OneToMany(mappedBy = "labResultadocab")
    private List<LabResultadoDet> labResultadosDet;

    @JsonIgnoreProperties("labResultadocab")
    @OneToMany(mappedBy = "labResultadocab")
    private List<LabObservacionResultado> labObservacionesResultadoDet;

    @JsonIgnoreProperties("labResultadocab")
    @OneToMany(mappedBy = "labResultadocab")
    private List<LabEtapaMetodo> labEtapaMetodos;

    public LabResultadoCab() {
    }

    public LabAdmisionCab getLabAdmisionCab() {
        return labAdmisionCab;
    }

    public void setLabAdmisionCab(LabAdmisionCab labAdmisionCab) {
        this.labAdmisionCab = labAdmisionCab;
    }

    public Timestamp getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Timestamp fechaResultado) {
        this.fechaResultado = fechaResultado;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Usuario getUsuarioResp() {
        return usuarioResp;
    }

    public void setUsuarioResp(Usuario usuarioResp) {
        this.usuarioResp = usuarioResp;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public List<LabResultadoDet> getLabResultadosDet() {
        return labResultadosDet;
    }

    public void setLabResultadosDet(List<LabResultadoDet> labResultadosDet) {
        this.labResultadosDet = labResultadosDet;
    }

    public List<LabObservacionResultado> getLabObservacionesResultadoDet() {
        return labObservacionesResultadoDet;
    }

    public void setLabObservacionesResultadoDet(List<LabObservacionResultado> labObservacionesResultadoDet) {
        this.labObservacionesResultadoDet = labObservacionesResultadoDet;
    }

    public List<LabEtapaMetodo> getLabEtapaMetodos() {
        return labEtapaMetodos;
    }

    public void setLabEtapaMetodos(List<LabEtapaMetodo> labEtapaMetodos) {
        this.labEtapaMetodos = labEtapaMetodos;
    }

}
