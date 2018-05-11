package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the polizapaciente database table.
 * 
 */
@Entity
@Table(name = "polizapaciente")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PolizaPaciente extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;


	@Column(name="carnet",nullable=false)
	private String carnet;

	@Column(name="codigo")
	private String codigo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecfin")
	private Date fecFin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecini")
	private Date fecIni;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpersona", nullable=false)
	private Persona persona;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpoliza", nullable=false)
	private Poliza poliza;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fincarencia1")
	private Date finCarenciaConsultas;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fincarencia2")
	private Date finCarenciaServicios;
	
	@Temporal(TemporalType.DATE)
	@Column(name="finlatencia")
	private Date finLatencia;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtitular")
    private Persona titular;
	
	@JsonIgnoreProperties("polizaPaciente")
    @OneToMany(mappedBy = "polizaPaciente", fetch = FetchType.LAZY)
    private List<PolizaPreExistencia> preExistencias;

	public PolizaPaciente() {
	}

	public String getCarnet() {
		return this.carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFecFin() {
		return this.fecFin;
	}

	public void setFecFin(Date fecFin) {
		this.fecFin = fecFin;
	}

	public Date getFecIni() {
		return this.fecIni;
	}

	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public Date getFinCarenciaConsultas() {
		return finCarenciaConsultas;
	}

	public void setFinCarenciaConsultas(Date finCarenciaConsultas) {
		this.finCarenciaConsultas = finCarenciaConsultas;
	}

	public Date getFinCarenciaServicios() {
		return finCarenciaServicios;
	}

	public void setFinCarenciaServicios(Date finCarenciaServicios) {
		this.finCarenciaServicios = finCarenciaServicios;
	}

	public Date getFinLatencia() {
		return finLatencia;
	}

	public void setFinLatencia(Date finLatencia) {
		this.finLatencia = finLatencia;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public List<PolizaPreExistencia> getPreExistencias() {
		return preExistencias;
	}

	public void setPreExistencias(List<PolizaPreExistencia> preExistencias) {
		this.preExistencias = preExistencias;
	}
	
}