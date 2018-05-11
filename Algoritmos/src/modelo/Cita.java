package modelo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the cita database table.
 *
 */
@Entity
@Table(name = "cita")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Cita extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "origen", nullable = false)
    private String origen;

    @Column(name = "estadocita", nullable = false)
    private String estadoCita;

    @Column(name = "fechacita", nullable = false)
    private Timestamp fechaCita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmedico", nullable = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona", nullable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idadmisionmedico")
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
