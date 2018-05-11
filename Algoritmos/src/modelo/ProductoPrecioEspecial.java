package modelo;

import java.math.BigDecimal;

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

@Entity
@Table(name = "productoprecioespecial")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class ProductoPrecioEspecial extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto")
	private Producto producto;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idaseguradora")
	private Aseguradora aseguradora;
    
    public ProductoPrecioEspecial(){
    	
    }

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Aseguradora getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}
  
}