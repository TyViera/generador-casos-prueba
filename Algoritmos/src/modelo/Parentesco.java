package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Parentesco extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String codigoSiteds;

    private List<Paciente> pacientes;

    public Parentesco() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoSiteds() {
        return codigoSiteds;
    }

    public void setCodigoSiteds(String codigoSiteds) {
        this.codigoSiteds = codigoSiteds;
    }

    public List<Paciente> getPacientes() {
        return this.pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Paciente addPaciente(Paciente paciente) {
        getPacientes().add(paciente);
        paciente.setParentesco(this);
        return paciente;
    }

    public Paciente removePaciente(Paciente paciente) {
        getPacientes().remove(paciente);
        paciente.setParentesco(null);
        return paciente;
    }

}
