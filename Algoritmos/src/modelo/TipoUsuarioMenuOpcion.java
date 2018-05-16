package modelo;

import util.AuditoriaBean;

public class TipoUsuarioMenuOpcion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Boolean acceso;

    private MenuOpcion menuOpcion;

    private TipoUsuario tipoUsuario;

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
