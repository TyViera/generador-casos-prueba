package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Usuario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String apeMat;

    private String apePat;

    private Boolean cambiarClave;

    private Boolean dadoBaja;

    private String celular;

    private String clave;

    private String direccion;

    private String dni;

    private String login;

    private String nombre;

    private List<UsuarioAcceso> usuarioAccesos;

    private List<UsuarioAlmacen> usuarioAlmacenes;

    private List<DocumTransferencia> documTransferencias;

    public Usuario() {
    }

    public String getApeMat() {
        return this.apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getApePat() {
        return this.apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public Boolean getCambiarClave() {
        return this.cambiarClave;
    }

    public void setCambiarClave(Boolean cambiarClave) {
        this.cambiarClave = cambiarClave;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<UsuarioAcceso> getUsuarioAccesos() {
        return this.usuarioAccesos;
    }

    public void setUsuarioAccesos(List<UsuarioAcceso> usuarioAccesos) {
        this.usuarioAccesos = usuarioAccesos;
    }

    public UsuarioAcceso addUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
        getUsuarioAccesos().add(usuarioAcceso);
        usuarioAcceso.setUsuario(this);
        return usuarioAcceso;
    }

    public UsuarioAcceso removeUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
        getUsuarioAccesos().remove(usuarioAcceso);
        usuarioAcceso.setUsuario(null);
        return usuarioAcceso;
    }

    public List<UsuarioAlmacen> getUsuarioAlmacenes() {
        return usuarioAlmacenes;
    }

    public void setUsuarioAlmacenes(List<UsuarioAlmacen> usuarioAlmacenes) {
        this.usuarioAlmacenes = usuarioAlmacenes;
    }

    public List<DocumTransferencia> getDocumTransferencias() {
        return documTransferencias;
    }

    public void setDocumTransferencias(List<DocumTransferencia> documTransferencias) {
        this.documTransferencias = documTransferencias;
    }

    @Override
    public String toString() {
        return "Usuario [apeMat=" + apeMat + ", apePat=" + apePat
                + ", cambiarClave=" + cambiarClave + ", celular=" + celular
                + ", clave=" + clave + ", direccion=" + direccion + ", dni="
                + dni + ", login=" + login + ", nombre=" + nombre + "]";
    }

    public Boolean getDadoBaja() {
        return dadoBaja;
    }

    public void setDadoBaja(Boolean dadoBaja) {
        this.dadoBaja = dadoBaja;
    }

}
