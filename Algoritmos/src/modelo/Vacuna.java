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
 * The persistent class for the vacuna database table.
 * 
 */
@Entity
@Table(name = "vacuna")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Vacuna extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@Column(name="periodicidad")
	private String periodicidad;

	@Column(name="anioini")
	private Integer anioIni;
	
	@Column(name="aniofin")
	private Integer anioFin;
	
	@Column(name="mesini")
	private Integer mesIni;
	
	
	@Column(name="mesfin")
	private Integer mesFin;

	@JsonIgnoreProperties("vacuna")
	@OneToMany(mappedBy="vacuna",fetch=FetchType.LAZY)
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