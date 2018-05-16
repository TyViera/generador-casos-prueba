package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class Interconsulta extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Admision admision;

    private Especialidad especialidad;

    private Persona persona;

    private Medico medico;

    private Medico medicoAtiende;

    private Timestamp fechaAtencion;

    private String motivo;

    public Interconsulta() {
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
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

    public Medico getMedicoAtiende() {
        return medicoAtiende;
    }

    public void setMedicoAtiende(Medico medicoAtiende) {
        this.medicoAtiende = medicoAtiende;
    }

    public Timestamp getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Timestamp fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
