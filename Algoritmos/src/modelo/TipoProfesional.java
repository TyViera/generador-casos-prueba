package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoProfesional extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String codigoEnvio;

    private String nombre;

    private List<Medico> medicos;

    public TipoProfesional() {
    }

    public String getCodigoEnvio() {
        return this.codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedicos() {
        return this.medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public Medico addMedico(Medico medico) {
        getMedicos().add(medico);
        medico.setTipoProfesional(this);
        return medico;
    }

    public Medico removeMedico(Medico medico) {
        getMedicos().remove(medico);
        medico.setTipoProfesional(null);
        return medico;
    }

}
