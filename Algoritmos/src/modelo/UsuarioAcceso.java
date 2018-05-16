package modelo;

import util.AuditoriaBean;

public class UsuarioAcceso extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private TipoUsuario tipoUsuario;

    private Usuario usuario;

    public UsuarioAcceso() {
    }

    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
