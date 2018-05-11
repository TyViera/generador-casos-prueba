package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the parentesco database table.
 *
 */
@Entity
@Table(name = "parentesco")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Parentesco extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigositeds", nullable = false)
    private String codigoSiteds;

    @JsonIgnoreProperties("parentesco")
    @OneToMany(mappedBy = "parentesco", fetch = FetchType.LAZY)
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
