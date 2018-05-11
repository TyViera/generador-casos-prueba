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
 * The persistent class for the tipousuario database table.
 * 
 */
@Entity
@Table(name = "tipousuario")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoUsuario extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@JsonIgnoreProperties("tipoUsuario")
	@OneToMany(mappedBy="tipoUsuario",fetch=FetchType.LAZY)
	private List<TipoUsuarioMenuOpcion> tipoUsuarioMenuOpciones;

	@JsonIgnoreProperties("tipoUsuario")
	@OneToMany(mappedBy="tipoUsuario",fetch=FetchType.LAZY)
	private List<UsuarioAcceso> usuarioAccesos;

	public TipoUsuario() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TipoUsuarioMenuOpcion> getTipoUsuarioMenuOpciones() {
		return this.tipoUsuarioMenuOpciones;
	}

	public void setTipoUsuarioMenuOpciones(List<TipoUsuarioMenuOpcion> tipoUsuarioMenuOpciones) {
		this.tipoUsuarioMenuOpciones = tipoUsuarioMenuOpciones;
	}

	public TipoUsuarioMenuOpcion addTipoUsuarioMenuOpcione(TipoUsuarioMenuOpcion tipoUsuarioMenuOpcione) {
		getTipoUsuarioMenuOpciones().add(tipoUsuarioMenuOpcione);
		tipoUsuarioMenuOpcione.setTipoUsuario(this);
		return tipoUsuarioMenuOpcione;
	}

	public TipoUsuarioMenuOpcion removeTipoUsuarioMenuOpcione(TipoUsuarioMenuOpcion tipoUsuarioMenuOpcione) {
		getTipoUsuarioMenuOpciones().remove(tipoUsuarioMenuOpcione);
		tipoUsuarioMenuOpcione.setTipoUsuario(null);
		return tipoUsuarioMenuOpcione;
	}

	public List<UsuarioAcceso> getUsuarioAccesos() {
		return this.usuarioAccesos;
	}

	public void setUsuarioAccesos(List<UsuarioAcceso> usuarioAccesos) {
		this.usuarioAccesos = usuarioAccesos;
	}

	public UsuarioAcceso addUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
		getUsuarioAccesos().add(usuarioAcceso);
		usuarioAcceso.setTipoUsuario(this);
		return usuarioAcceso;
	}

	public UsuarioAcceso removeUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
		getUsuarioAccesos().remove(usuarioAcceso);
		usuarioAcceso.setTipoUsuario(null);
		return usuarioAcceso;
	}

}