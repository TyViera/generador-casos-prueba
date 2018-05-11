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
 * The persistent class for the plantillaparrafoinforme database table.
 * 
 */
@Entity
@Table(name = "plantillaparrafoinforme")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class PlantillaParrafoInforme extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=2147483647)
	private String contenido;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idparrafoinforme", nullable=false)
	private ParrafoInforme parrafoInforme;

	public PlantillaParrafoInforme() {
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ParrafoInforme getParrafoInforme() {
		return this.parrafoInforme;
	}

	public void setParrafoInforme(ParrafoInforme parrafoInforme) {
		this.parrafoInforme = parrafoInforme;
	}

}