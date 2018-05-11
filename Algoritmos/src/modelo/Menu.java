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
 * The persistent class for the menu database table.
 * 
 */
/**
 * @author ANGEL
 *
 */
@Entity
@Table(name = "menu")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Menu extends AuditoriaBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="icono",nullable=false)
	private String icono;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@Column(name="orden",nullable=false)
	private Integer orden;

	@Column(name="url")
	private String url;
	
	@Column(name="iconoherramienta")
	private String iconoHerramienta;

	//@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="idmenupadre")
	//private Menu menu;
	
	@Column(name = "idmenupadre")
	private Long idMenuPadre;

	/*@JsonIgnoreProperties("menu")
	@OneToMany(mappedBy="menu",fetch=FetchType.LAZY)
	private List<Menu> menus;*/

	@JsonIgnoreProperties("menu")
	@OneToMany(mappedBy="menu",fetch=FetchType.LAZY)
	private List<MenuOpcion> menuOpcions;

	public Menu() {
	}

	public String getIcono() {
		return this.icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public Long getIdMenuPadre() {
		return idMenuPadre;
	}

	public void setIdMenuPadre(Long idMenuPadre) {
		this.idMenuPadre = idMenuPadre;
	}

	public List<MenuOpcion> getMenuOpcions() {
		return this.menuOpcions;
	}

	public void setMenuOpcions(List<MenuOpcion> menuOpcions) {
		this.menuOpcions = menuOpcions;
	}

	public MenuOpcion addMenuOpcion(MenuOpcion menuOpcion) {
		getMenuOpcions().add(menuOpcion);
		menuOpcion.setMenu(this);
		return menuOpcion;
	}

	public MenuOpcion removeMenuOpcion(MenuOpcion menuOpcion) {
		getMenuOpcions().remove(menuOpcion);
		menuOpcion.setMenu(null);
		return menuOpcion;
	}

	public String getIconoHerramienta() {
		return iconoHerramienta;
	}

	public void setIconoHerramienta(String iconoHerramienta) {
		this.iconoHerramienta = iconoHerramienta;
	}

	

}