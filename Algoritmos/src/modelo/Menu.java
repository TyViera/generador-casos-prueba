package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Menu extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String icono;

    private String nombre;

    private Integer orden;

    private String url;

    private String iconoHerramienta;

    private Long idMenuPadre;

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
