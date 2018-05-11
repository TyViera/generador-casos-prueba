package modelo;

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
 * The persistent class for the historiaclinica database table.
 * 
 */
@Entity
@Table(name = "historiaclinica")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class HistoriaClinica extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="numero",nullable=false)
	private Integer numero;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpersona", nullable=false)
	private Persona persona;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idinformedico", nullable=false)
	private InforMedico informedico;

	public HistoriaClinica() {
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public InforMedico getInformedico() {
		return informedico;
	}

	public void setInformedico(InforMedico informedico) {
		this.informedico = informedico;
	}
	
}