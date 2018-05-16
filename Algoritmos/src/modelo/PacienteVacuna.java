package modelo;

import java.util.Date;
import util.AuditoriaBean;

public class PacienteVacuna extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer edadAnios;

    private Integer edadMeses;

    private Date fechaVacuna;

    private Persona persona;

    private Vacuna vacuna;

    public PacienteVacuna() {
    }

    public Integer getEdadAnios() {
        return this.edadAnios;
    }

    public void setEdadAnios(Integer edadAnios) {
        this.edadAnios = edadAnios;
    }

    public Integer getEdadMeses() {
        return this.edadMeses;
    }

    public void setEdadMeses(Integer edadMeses) {
        this.edadMeses = edadMeses;
    }

    public Date getFechaVacuna() {
        return this.fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vacuna getVacuna() {
        return this.vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

}
