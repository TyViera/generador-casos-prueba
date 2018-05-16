package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Especialidad extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<MedicoEspecialidad> medicoEspecialidades;

    public Especialidad() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MedicoEspecialidad> getMedicoEspecialidades() {
        return this.medicoEspecialidades;
    }

    public void setMedicoEspecialidades(List<MedicoEspecialidad> medicoEspecialidades) {
        this.medicoEspecialidades = medicoEspecialidades;
    }

    public MedicoEspecialidad addMedicoEspecialidade(MedicoEspecialidad medicoEspecialidade) {
        getMedicoEspecialidades().add(medicoEspecialidade);
        medicoEspecialidade.setEspecialidad(this);
        return medicoEspecialidade;
    }

    public MedicoEspecialidad removeMedicoEspecialidade(MedicoEspecialidad medicoEspecialidade) {
        getMedicoEspecialidades().remove(medicoEspecialidade);
        medicoEspecialidade.setEspecialidad(null);
        return medicoEspecialidade;
    }

}
