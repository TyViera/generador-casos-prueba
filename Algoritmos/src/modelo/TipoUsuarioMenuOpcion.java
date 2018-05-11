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
 * The persistent class for the tipousuariomenuopcion database table.
 * 
 */
@Entity
@Table(name = "tipousuariomenuopcion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoUsuarioMenuOpcion extends AuditoriaBean {

	private static final long serialVersionUID = 1L;

	@Column(name = "acceso", nullable = false)
	private Boolean acceso;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmenuopcion", nullable = false)
	private MenuOpcion menuOpcion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipousuario", nullable = false)
	private TipoUsuario tipoUsuario;

	@Column(name = "barraherramienta", nullable = false)
	private Boolean barraHerramienta;

	public TipoUsuarioMenuOpcion() {
	}

	public Boolean getAcceso() {
		return this.acceso;
	}

	public void setAcceso(Boolean acceso) {
		this.acceso = acceso;
	}

	public MenuOpcion getMenuOpcion() {
		return this.menuOpcion;
	}

	public void setMenuOpcion(MenuOpcion menuOpcion) {
		this.menuOpcion = menuOpcion;
	}

	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Boolean getBarraHerramienta() {
		return barraHerramienta;
	}

	public void setBarraHerramienta(Boolean barraHerramienta) {
		this.barraHerramienta = barraHerramienta;
	}

}