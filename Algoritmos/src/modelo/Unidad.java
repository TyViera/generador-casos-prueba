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
 * The persistent class for the unidad database table.
 * 
 */
@Entity
@Table(name = "unidad")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Unidad extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="abreviatura")
	private String abreviatura;

	@Column(name="codsunat")
	private String codSunat;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("unidad")
	@OneToMany(mappedBy="unidad")
	private List<Producto> productos;

	public Unidad() {
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getCodSunat() {
		return this.codSunat;
	}

	public void setCodSunat(String codSunat) {
		this.codSunat = codSunat;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setUnidad(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setUnidad(null);

		return producto;
	}
	
}