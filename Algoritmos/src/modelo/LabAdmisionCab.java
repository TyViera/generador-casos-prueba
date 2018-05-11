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
@Table(name = "labadmisioncab")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LabAdmisionCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idamisionmedico")
    private AdmisionMedico admisionMedico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico")
    private Medico medico;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "pacinterno")
    private Boolean pacInterno;

    @Column(name = "fechaadmision")
    private Timestamp fechaAdmision;

    @JsonIgnoreProperties("labAdmisionCab")
    @OneToMany(mappedBy = "labAdmisionCab")
    private List<LabResultadoCab> labResultadosCab;

    @JsonIgnoreProperties("labAdmisionCab")
    @OneToMany(mappedBy = "labAdmisionCab")
    private List<LabAdmisionDet> labAdmisionesDet;

    public LabAdmisionCab() {
    }

    public AdmisionMedico getAdmisionMedico() {
        return admisionMedico;
    }

    public void setAdmisionMedico(AdmisionMedico admisionMedico) {
        this.admisionMedico = admisionMedico;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Boolean getPacInterno() {
        return pacInterno;
    }

    public void setPacInterno(Boolean pacInterno) {
        this.pacInterno = pacInterno;
    }

    public Timestamp getFechaAdmision() {
        return fechaAdmision;
    }

    public void setFechaAdmision(Timestamp fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
    }

    public List<LabResultadoCab> getLabResultadosCab() {
        return labResultadosCab;
    }

    public void setLabResultadosCab(List<LabResultadoCab> labResultadosCab) {
        this.labResultadosCab = labResultadosCab;
    }

    public List<LabAdmisionDet> getLabAdmisionesDet() {
        return labAdmisionesDet;
    }

    public void setLabAdmisionesDet(List<LabAdmisionDet> labAdmisionesDet) {
        this.labAdmisionesDet = labAdmisionesDet;
    }

}
