package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Vacuna extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String descripcion;

    private String nombre;

    private String periodicidad;

    private Integer anioIni;

    private Integer anioFin;

    private Integer mesIni;

    private Integer mesFin;

    private List<PacienteVacuna> pacienteVacunas;

    public Vacuna() {
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodicidad() {
        return this.periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Integer getAnioIni() {
        return anioIni;
    }

    public void setAnioIni(Integer anioIni) {
        this.anioIni = anioIni;
    }

    public Integer getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public Integer getMesIni() {
        return mesIni;
    }

    public void setMesIni(Integer mesIni) {
        this.mesIni = mesIni;
    }

    public Integer getMesFin() {
        return mesFin;
    }

    public void setMesFin(Integer mesFin) {
        this.mesFin = mesFin;
    }

    public List<PacienteVacuna> getPacienteVacunas() {
        return this.pacienteVacunas;
    }

    public void setPacienteVacunas(List<PacienteVacuna> pacienteVacunas) {
        this.pacienteVacunas = pacienteVacunas;
    }

    public PacienteVacuna addPacienteVacuna(PacienteVacuna pacienteVacuna) {
        getPacienteVacunas().add(pacienteVacuna);
        pacienteVacuna.setVacuna(this);
        return pacienteVacuna;
    }

    public PacienteVacuna removePacienteVacuna(PacienteVacuna pacienteVacuna) {
        getPacienteVacunas().remove(pacienteVacuna);
        pacienteVacuna.setVacuna(null);
        return pacienteVacuna;
    }

}
