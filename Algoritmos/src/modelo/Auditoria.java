package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "Auditoria" database table.
 * 
 */
@Entity
@Table(name="\"Auditoria\"")
@NamedQuery(name="Auditoria.findAll", query="SELECT a FROM Auditoria a")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"IdAudit\"")
	private Long idAudit;

	private String campoclaveprimaria;

	private String clavecampo;

	private Timestamp fechaactualizacion;

	private String ip;

	private String nombrecampo;

	private String nombretabla;

	private String nombreusuario;

	@Column(name="\"Observacion\"")
	private String observacion;

	private String pc;

	private String tipo;

	private String valorantiguo;

	private String valorclaveprimaria;

	private String valornuevo;

	public Auditoria() {
	}

	public Long getIdAudit() {
		return this.idAudit;
	}

	public void setIdAudit(Long idAudit) {
		this.idAudit = idAudit;
	}

	public String getCampoclaveprimaria() {
		return this.campoclaveprimaria;
	}

	public void setCampoclaveprimaria(String campoclaveprimaria) {
		this.campoclaveprimaria = campoclaveprimaria;
	}

	public String getClavecampo() {
		return this.clavecampo;
	}

	public void setClavecampo(String clavecampo) {
		this.clavecampo = clavecampo;
	}

	public Timestamp getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Timestamp fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNombrecampo() {
		return this.nombrecampo;
	}

	public void setNombrecampo(String nombrecampo) {
		this.nombrecampo = nombrecampo;
	}

	public String getNombretabla() {
		return this.nombretabla;
	}

	public void setNombretabla(String nombretabla) {
		this.nombretabla = nombretabla;
	}

	public String getNombreusuario() {
		return this.nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getPc() {
		return this.pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValorantiguo() {
		return this.valorantiguo;
	}

	public void setValorantiguo(String valorantiguo) {
		this.valorantiguo = valorantiguo;
	}

	public String getValorclaveprimaria() {
		return this.valorclaveprimaria;
	}

	public void setValorclaveprimaria(String valorclaveprimaria) {
		this.valorclaveprimaria = valorclaveprimaria;
	}

	public String getValornuevo() {
		return this.valornuevo;
	}

	public void setValornuevo(String valornuevo) {
		this.valornuevo = valornuevo;
	}

}