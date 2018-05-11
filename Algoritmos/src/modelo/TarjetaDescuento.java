package modelo;

import java.sql.Timestamp;

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

@Entity
@Table(name = "tarjetadscto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TarjetaDescuento extends AuditoriaBean {

	private static final long serialVersionUID = 1L;

	@Column(name = "fecemision")
	private Timestamp fechaEmision;

	@Column(name = "feccaduca")
	private Timestamp fechaCaduca;

	@Column(name = "fechaentrega")
	private Timestamp fechaEntrega;

	@Column(name = "numtarjeta")
	private Long numeroTarjeta;

	@Column(name = "entregada")
	private Boolean esEntregada;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona")
	private Persona persona;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipotarjetadscto")
	private TipoTarjetaDescuento tipoTarjetaDescuento;

	public Timestamp getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Timestamp fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Timestamp getFechaCaduca() {
		return fechaCaduca;
	}

	public void setFechaCaduca(Timestamp fechaCaduca) {
		this.fechaCaduca = fechaCaduca;
	}

	public Timestamp getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Timestamp fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Boolean getEsEntregada() {
		return esEntregada;
	}

	public void setEsEntregada(Boolean esEntregada) {
		this.esEntregada = esEntregada;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoTarjetaDescuento getTipoTarjetaDescuento() {
		return tipoTarjetaDescuento;
	}

	public void setTipoTarjetaDescuento(TipoTarjetaDescuento tipoTarjetaDescuento) {
		this.tipoTarjetaDescuento = tipoTarjetaDescuento;
	}

}