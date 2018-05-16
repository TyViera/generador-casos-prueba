package modelo;

import util.AuditoriaBean;

public class MedicoEspecialidad extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Especialidad especialidad;

    private Medico medico;

    public MedicoEspecialidad() {
    }

    public Especialidad getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
