package modelo;

import java.sql.Timestamp;
import java.util.List;
import util.AuditoriaBean;

public class LabAdmisionCab extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private AdmisionMedico admisionMedico;

    private Persona persona;

    private Medico medico;

    private String observacion;

    private Boolean pacInterno;

    private Timestamp fechaAdmision;

    private List<LabResultadoCab> labResultadosCab;

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
