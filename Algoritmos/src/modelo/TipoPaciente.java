package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the tipopaciente database table.
 * 
 */
@Entity
@Table(name = "tipopaciente")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoPaciente extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="abreviatura")
	private String abreviatura;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("tipoPaciente")
	@OneToMany(mappedBy="tipoPaciente")
	private List<Admision> admisions;

	public TipoPaciente() {
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Admision> getAdmisions() {
		return this.admisions;
	}

	public void setAdmisions(List<Admision> admisions) {
		this.admisions = admisions;
	}

	public Admision addAdmisions(Admision admision) {
		getAdmisions().add(admision);
		admision.setTipoPaciente(this);
		return admision;
	}

	public Admision removeAtencion(Admision admision) {
		getAdmisions().remove(admision);
		admision.setTipoPaciente(null);
		return admision;
	}

}