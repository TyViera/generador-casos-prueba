package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;


/**
 * The persistent class for the tipoinforme database table.
 * 
 */
@Entity
@Table(name = "tipoinforme")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoInforme extends AuditoriaBean {
	private static final long serialVersionUID = 1L;


	@Column(nullable=false, length=100)
	private String nombre;

	@JsonIgnoreProperties("tipoInforme")
	@OneToMany(mappedBy="tipoInforme",fetch=FetchType.LAZY)
	private List<InforMedico> informedicos;

  @Detalle
	@JsonIgnoreProperties("tipoInforme")
	@OneToMany(mappedBy="tipoInforme",fetch=FetchType.LAZY)
	private List<TituloInforme> tituloInformes;
	
	@Transient
	private String titulo;

	public TipoInforme() {
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<InforMedico> getInformedicos() {
		return this.informedicos;
	}

	public void setInformedicos(List<InforMedico> informedicos) {
		this.informedicos = informedicos;
	}

	public InforMedico addInformedico(InforMedico informedico) {
		getInformedicos().add(informedico);
		informedico.setTipoInforme(this);

		return informedico;
	}

	public InforMedico removeInformedico(InforMedico informedico) {
		getInformedicos().remove(informedico);
		informedico.setTipoInforme(null);

		return informedico;
	}

	public List<TituloInforme> getTituloInformes() {
		return this.tituloInformes;
	}

	public void setTituloInformes(List<TituloInforme> tituloInformes) {
		this.tituloInformes = tituloInformes;
	}

	public TituloInforme addTituloInforme(TituloInforme tituloInforme) {
		getTituloInformes().add(tituloInforme);
		tituloInforme.setTipoInforme(this);

		return tituloInforme;
	}

	public TituloInforme removeTituloInforme(TituloInforme tituloInforme) {
		getTituloInformes().remove(tituloInforme);
		tituloInforme.setTipoInforme(null);

		return tituloInforme;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "TipoInforme [id="+getId() + "nombre=" + nombre + ", titulo=" + titulo + "]";
	}
	
	
	
	

}