package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the generico database table.
 * 
 */
@Entity
@Table(name = "generico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Generico extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("generico")
	@OneToMany(mappedBy="generico")
	private List<ProductoContGenerico> productoContGenericos;

	public Generico() {
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ProductoContGenerico> getProductoContGenericos() {
		return this.productoContGenericos;
	}

	public void setProductoContGenericos(List<ProductoContGenerico> productoContGenericos) {
		this.productoContGenericos = productoContGenericos;
	}

	public ProductoContGenerico addProductocontgenerico(ProductoContGenerico productoContGenerico) {
		getProductoContGenericos().add(productoContGenerico);
		productoContGenerico.setGenerico(this);
		return productoContGenerico;
	}

	public ProductoContGenerico removeProductocontgenerico(ProductoContGenerico productoContGenerico) {
		getProductoContGenericos().remove(productoContGenerico);
		productoContGenerico.setGenerico(null);
		return productoContGenerico;
	}

}