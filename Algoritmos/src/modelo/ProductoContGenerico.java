package modelo;

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
 * The persistent class for the productocontgenerico database table.
 * 
 */
@Entity
@Table(name = "productocontgenerico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ProductoContGenerico extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idgenerico")
	private Generico generico;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idproducto")
	private Producto producto;

	public ProductoContGenerico() {
	}

	public Generico getGenerico() {
		return this.generico;
	}

	public void setGenerico(Generico generico) {
		this.generico = generico;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}