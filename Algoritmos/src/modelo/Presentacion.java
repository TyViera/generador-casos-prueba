package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the presentacion database table.
 * 
 */
@Entity
@Table(name = "presentacion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Presentacion extends AuditoriaBean{
	
	private static final long serialVersionUID = 1L;

	@Column(name="abreviatura")
	private String abreviatura;

	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@JsonIgnoreProperties("presentacion")
	@OneToMany(mappedBy="presentacion",fetch=FetchType.LAZY)
	private List<Producto> productos;
	
	public Presentacion() {
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setPresentacion(this);
		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setPresentacion(null);
		return producto;
	}

}