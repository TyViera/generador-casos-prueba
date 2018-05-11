package modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;


/**
 * The persistent class for the menuopcion database table.
 * 
 */
@Entity
@Table(name = "menuopcion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class MenuOpcion extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idmenu", nullable=false)
	private Menu menu;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idopcion")
	private Opcion opcion;

	@JsonIgnoreProperties("menuOpcion")
	@OneToMany(mappedBy="menuOpcion",fetch=FetchType.LAZY)
	private List<TipoUsuarioMenuOpcion> tipoUsuarioMenuOpciones;

	public MenuOpcion() {
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Opcion getOpcion() {
		return this.opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}

	public List<TipoUsuarioMenuOpcion> getTipoUsuarioMenuOpciones() {
		return this.tipoUsuarioMenuOpciones;
	}

	public void setTipoUsuarioMenuOpciones(List<TipoUsuarioMenuOpcion> tipoUsuarioMenuOpciones) {
		this.tipoUsuarioMenuOpciones = tipoUsuarioMenuOpciones;
	}

	public TipoUsuarioMenuOpcion addTipoUsuarioMenuOpcione(TipoUsuarioMenuOpcion tipoUsuarioMenuOpcione) {
		getTipoUsuarioMenuOpciones().add(tipoUsuarioMenuOpcione);
		tipoUsuarioMenuOpcione.setMenuOpcion(this);
		return tipoUsuarioMenuOpcione;
	}

	public TipoUsuarioMenuOpcion removeTipoUsuarioMenuOpcione(TipoUsuarioMenuOpcion tipoUsuarioMenuOpcione) {
		getTipoUsuarioMenuOpciones().remove(tipoUsuarioMenuOpcione);
		tipoUsuarioMenuOpcione.setMenuOpcion(null);
		return tipoUsuarioMenuOpcione;
	}

}