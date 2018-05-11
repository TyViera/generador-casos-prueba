package modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the familia database table.
 * 
 */
@Entity
@Table(name = "familia")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Familia extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="ctacontable")
	private String ctaContable;

	@Column(name="margen",precision=6, scale=2)
	private BigDecimal margen;

	@Column(name="nombre")
	private String nombre;

	public Familia() {
	}

	public String getCtaContable() {
		return this.ctaContable;
	}

	public void setCtaContable(String ctaContable) {
		this.ctaContable = ctaContable;
	}

	public BigDecimal getMargen() {
		return this.margen;
	}

	public void setMargen(BigDecimal margen) {
		this.margen = margen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}