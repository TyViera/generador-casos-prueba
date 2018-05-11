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
 * The persistent class for the opcion database table.
 * 
 */
@Entity
@Table(name = "opcion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Opcion extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="nombre",nullable=false)
	private String nombre;
	
	@JsonIgnoreProperties("opcion")
	@OneToMany(mappedBy="opcion",fetch=FetchType.LAZY)
	private List<MenuOpcion> menuOpcions;

	public Opcion() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MenuOpcion> getMenuOpcions() {
		return this.menuOpcions;
	}

	public void setMenuOpcions(List<MenuOpcion> menuOpcions) {
		this.menuOpcions = menuOpcions;
	}

	public MenuOpcion addMenuOpcion(MenuOpcion menuOpcion) {
		getMenuOpcions().add(menuOpcion);
		menuOpcion.setOpcion(this);
		return menuOpcion;
	}

	public MenuOpcion removeMenuOpcion(MenuOpcion menuOpcion) {
		getMenuOpcions().remove(menuOpcion);
		menuOpcion.setOpcion(null);
		return menuOpcion;
	}

}