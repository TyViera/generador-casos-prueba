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

@Entity
@Table(name="ubigeo")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Ubigeo extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="codUbigeo")
	private String codigoUbigeo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtipoubigeo")
	private TipoUbigeo tipoUbigeo;


	public Ubigeo() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoUbigeo getTipoUbigeo() {
		return this.tipoUbigeo;
	}

	public void setTipoUbigeo(TipoUbigeo tipoUbigeo) {
		this.tipoUbigeo = tipoUbigeo;
	}

	public String getCodigoUbigeo() {
		return codigoUbigeo;
	}

	public void setCodigoUbigeo(String codigoUbigeo) {
		this.codigoUbigeo = codigoUbigeo;
	}
}