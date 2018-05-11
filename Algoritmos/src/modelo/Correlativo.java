package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the correlativo database table.
 * 
 */
@Entity
@Table(name = "correlativo")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Correlativo extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="anio")
	private String anio;

	@Column(name="nombre")
	private String nombre;

	@Column(name="numero")
	private Integer numero;

	public Correlativo() {
	}

	public String getAnio() {
		return this.anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
  
  public Integer siguienteNumero() {
    this.numero++;
    return this.numero;
  }

}