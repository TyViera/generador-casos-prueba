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
 * The persistent class for the productonocubierto database table.
 * 
 */
@Entity
@Table(name = "productonocubierto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ProductoNoCubierto extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="tipo")
	private String tipo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idaseguradora")
	private Aseguradora aseguradora;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idproducto")
	private Producto producto;

	public ProductoNoCubierto() {
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Aseguradora getAseguradora() {
		return this.aseguradora;
	}

	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}