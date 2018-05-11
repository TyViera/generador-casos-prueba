package modelo;

import java.sql.Time;
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.SqlTimeDeserializer;


/**
 * The persistent class for the programahorario database table.
 * 
 */
@Entity
@Table(name = "programahorario")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ProgramaHorario extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="actividad")
	private String actividad;

	@Column(name="anio")
	private Integer anio;

	@Column(name="fecprog")
	@Temporal(TemporalType.DATE)
	private Date fecProg;
	
	@JsonFormat(pattern = "HH:mm")
	@JsonDeserialize(using = SqlTimeDeserializer.class)
	@Column(name="horafin")
	private Time horaFin;

	@JsonFormat(pattern = "HH:mm")
	@JsonDeserialize(using = SqlTimeDeserializer.class)
	@Column(name="horaini")
	private Time horaIni;

	@Column(name="mes")
	private Integer mes;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idmedico")
	private Medico medico;

	public ProgramaHorario() {
	}

	public String getActividad() {
		return this.actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Date getFecProg() {
		return this.fecProg;
	}

	public void setFecProg(Date fecProg) {
		this.fecProg = fecProg;
	}

	public Time getHorafin() {
		return this.horaFin;
	}

	public void setHorafin(Time horafin) {
		this.horaFin = horafin;
	}

	public Time getHoraIni() {
		return this.horaIni;
	}

	public void setHoraIni(Time horaIni) {
		this.horaIni = horaIni;
	}

	public Integer getMes() {
		return this.mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Medico getMedico() {
		return this.medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}