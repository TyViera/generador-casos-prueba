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

@Entity
@Table(name = "tipotarjetadscto")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoTarjetaDescuento extends AuditoriaBean {
	private static final long serialVersionUID = 1L;


	@Column(nullable=false, length=70)
	private String nombre;
	
	@JsonIgnoreProperties("tipoTarjetaDescuento")
	@OneToMany(mappedBy = "tipoTarjetaDescuento", fetch = FetchType.LAZY)
	private List<TipoTarjetaDescuentoServicio> descuentos;
	
	public TipoTarjetaDescuento() {
		
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TipoTarjetaDescuentoServicio> getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(List<TipoTarjetaDescuentoServicio> descuentos) {
		this.descuentos = descuentos;
	}

}