package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the pacientevacuna database table.
 * 
 */
@Entity
@Table(name = "pacientevacuna")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PacienteVacuna extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;


	@Column(name="edadAnios",nullable=false)
	private Integer edadAnios;

	@Column(name="edadMeses",nullable=false)
	private Integer edadMeses;

	@Temporal(TemporalType.DATE)
	@Column(name="fechavacuna",nullable=false)
	private Date fechaVacuna;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpersona", nullable=false)
	private Persona persona;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idvacuna", nullable=false)
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