package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoUsuario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private List<TipoUsuarioMenuOpcion> tipoUsuarioMenuOpciones;

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
