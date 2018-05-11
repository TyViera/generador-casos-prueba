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
 * The persistent class for the informedicodetalle database table.
 * 
 */
@Entity
@Table(name = "informedicodetalle")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class InforMedicoDetalle extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="valorcheck")
	private Boolean valorCheck;

	@Column(name="valortexto")
	private String valorTexto;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idinformedico", nullable=false)
	private InforMedico informedico;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idparrafoinforme")
	private ParrafoInforme parrafoInforme;
  
	@Column(name="tituloinforme", length = 100)
	private String tituloInforme;
  
  	@Column(name="parrafoinforme", length = 100)
	private String tituloParrafo;
  
  	@Column(name="orden")
  	private Integer orden;
  
	public InforMedicoDetalle() {
	}

	public Boolean getValorCheck() {
		return this.valorCheck;
	}

	public void setValorCheck(Boolean valorCheck) {
		this.valorCheck = valorCheck;
	}

	public String getValorTexto() {
		return this.valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	public InforMedico getInformedico() {
		return this.informedico;
	}

	public void setInformedico(InforMedico informedico) {
		this.informedico = informedico;
	}

	public ParrafoInforme getParrafoInforme() {
		return this.parrafoInforme;
	}

	public void setParrafoInforme(ParrafoInforme parrafoInforme) {
		this.parrafoInforme = parrafoInforme;
	}

	public String getTituloInforme() {
		return tituloInforme;
	}

	public void setTituloInforme(String tituloInforme) {
		this.tituloInforme = tituloInforme;
	}

	public String getTituloParrafo() {
		return tituloParrafo;
	}

	public void setTituloParrafo(String tituloParrafo) {
		this.tituloParrafo = tituloParrafo;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
}