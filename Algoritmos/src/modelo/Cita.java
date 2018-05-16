package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class Cita extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String origen;

    private String estadoCita;

    private Timestamp fechaCita;

    private Medico medico;

    private Persona persona;

    private AdmisionMedico admisionMedico;

    public Cita() {
    }

    public String getEstadoCita() {
        return this.estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Timestamp getFechaCita() {
        return this.fechaCita;
    }

    public void setFechaCita(Timestamp fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public AdmisionMedico getAdmisionMedico() {
        return admisionMedico;
    }

    public void setAdmisionMedico(AdmisionMedico admisionMedico) {
        this.admisionMedico = admisionMedico;
    }

}
