package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the tituloinforme database table.
 * 
 */
@Entity
@Table(name = "tituloinforme")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TituloInforme extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="descripcion",nullable=false)
	private String descripcion;

	@Column(name="orden",nullable=false)
	private Integer orden;

	@JsonIgnoreProperties("tituloInforme")
	@OneToMany(mappedBy="tituloInforme",fetch=FetchType.LAZY)
	private List<ParrafoInforme> parrafoInformes;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtipoinforme", nullable=false)
	private TipoInforme tipoInforme;

	public TituloInforme() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public List<ParrafoInforme> getParrafoInformes() {
		return this.parrafoInformes;
	}

	public void setParrafoInformes(List<ParrafoInforme> parrafoInformes) {
		this.parrafoInformes = parrafoInformes;
	}

	public ParrafoInforme addParrafoInforme(ParrafoInforme parrafoInforme) {
		getParrafoInformes().add(parrafoInforme);
		parrafoInforme.setTituloInforme(this);

		return parrafoInforme;
	}

	public ParrafoInforme removeParrafoInforme(ParrafoInforme parrafoInforme) {
		getParrafoInformes().remove(parrafoInforme);
		parrafoInforme.setTituloInforme(null);

		return parrafoInforme;
	}

	public TipoInforme getTipoInforme() {
		return this.tipoInforme;
	}

	public void setTipoInforme(TipoInforme tipoInforme) {
		this.tipoInforme = tipoInforme;
	}

	@Override
	public String toString() {
		return "TituloInforme [id="+getId() + "descripcion=" + descripcion + ", orden=" + orden
				+ ", tipoInforme=" + tipoInforme + "]";
	}
	
	

}