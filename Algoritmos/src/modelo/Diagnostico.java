package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the diagnostico database table.
 * 
 */
@Entity
@Table(name = "diagnostico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Diagnostico extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="capa")
	private String capa;

	@Column(name="codigo",nullable=false)
	private String codigo;

	@Column(nullable=false)
	private String nombre;

	@Column(name="sexo",nullable=false)
	private Integer sexo;

	public Diagnostico() {
	}

	public String getCapa() {
		return this.capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSexo() {
		return this.sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

}