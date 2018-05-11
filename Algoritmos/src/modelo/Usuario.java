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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

/**
 * The persistent class for the usuario database table.
 *
 */
@Entity
@Table(name = "usuario")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Usuario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "apemat")
    private String apeMat;

    @Column(name = "apepat")
    private String apePat;

    @Column(name = "cambiarclave", nullable = false)
    private Boolean cambiarClave;

    @Column(name = "dadobaja")
    private Boolean dadoBaja;

    @Column(name = "celular")
    private String celular;

    @JsonProperty
    @Column(name = "clave", nullable = false)
    private String clave;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "dni")
    private String dni;

    @Column(name = "login")
    private String login;

    @Column(name = "nombre")
    private String nombre;

    @Detalle
    @JsonIgnoreProperties("usuario")
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<UsuarioAcceso> usuarioAccesos;

    @Detalle
    @JsonIgnoreProperties("usuario")
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<UsuarioAlmacen> usuarioAlmacenes;

    @JsonIgnoreProperties("usuarioRecibe")
    @OneToMany(mappedBy = "usuarioRecibe", fetch = FetchType.LAZY)
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

    @JsonIgnore
    public String getClave() {
        return this.clave;
    }

    @JsonProperty
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
