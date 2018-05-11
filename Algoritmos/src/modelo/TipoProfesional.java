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
 * The persistent class for the tipoprofesional database table.
 * 
 */
@Entity
@Table(name = "tipoprofesional")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoProfesional extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="codigoenvio",nullable=false)
	private String codigoEnvio;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("tipoProfesional")
	@OneToMany(mappedBy="tipoProfesional",fetch=FetchType.LAZY)
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