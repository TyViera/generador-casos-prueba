package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Opcion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

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
