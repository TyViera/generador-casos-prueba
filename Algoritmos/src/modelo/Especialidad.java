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
 * The persistent class for the especialidad database table.
 * 
 */
@Entity
@Table(name = "especialidad")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Especialidad extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("especialidad")
	@OneToMany(mappedBy="especialidad",fetch=FetchType.LAZY)
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