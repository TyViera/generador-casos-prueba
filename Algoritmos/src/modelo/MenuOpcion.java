package modelo;

import java.util.List;
import util.AuditoriaBean;

public class MenuOpcion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Menu menu;

    private Opcion opcion;

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
