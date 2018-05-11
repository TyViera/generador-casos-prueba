package modelo;

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
 * The persistent class for the polizapaciente database table.
 * 
 */
@Entity
@Table(name = "polizapreexistencia")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PolizaPreExistencia extends AuditoriaBean {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpolizapaciente", nullable = false)
	private PolizaPaciente polizaPaciente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddiagnostico", nullable = false)
	private Diagnostico diagnostico;

	public PolizaPreExistencia() {
	}

	public PolizaPaciente getPolizaPaciente() {
		return polizaPaciente;
	}

	public void setPolizaPaciente(PolizaPaciente polizaPaciente) {
		this.polizaPaciente = polizaPaciente;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

}