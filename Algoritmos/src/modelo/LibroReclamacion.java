package modelo;


import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the libroreclamacion database table.
 *
 */
@Entity
@Table(name = "libroreclamacion")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class LibroReclamacion  extends AuditoriaBean{


    private static final long serialVersionUID = 1L;


    @Column(name="tipo",nullable=false)
    private String tipo;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idtipodocumento",nullable=false)
    private TipoDocumento tipoDocumento;

    @Column(name = "numdocumento")
    private String numDocumento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;

    @Column(name="celular")
    private String celular;

    @Column(name = "telefono")
    private String telefono;


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idtipodocumentopres",nullable=false)
    private TipoDocumento tipoDocumentoPres;

    @Column(name = "numdocumentopres")
    private String numDocumentoPres;

    @Column(name = "nombrepres", nullable = false)
    private String nombrePres;

    @Column(name = "direccionpres")
    private String direccionPres;

    @Column(name = "emailpres")
    private String emailPres;

    @Column(name="celularpres")
    private String celularPres;

    @Column(name = "telefonopres")
    private String telefonoPres;

    @Column(name = "detalle")
    private String detalle;

    @Column(name="resultadoxemail")
    private Boolean resultadoPorEmail;

    @Column(name = "respuesta")
    private String respuesta;

    @Column(name="notificado")
    private Boolean notificado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoDocumento getTipoDocumentoPres() {
        return tipoDocumentoPres;
    }

    public void setTipoDocumentoPres(TipoDocumento tipoDocumentoPres) {
        this.tipoDocumentoPres = tipoDocumentoPres;
    }

    public String getNumDocumentoPres() {
        return numDocumentoPres;
    }

    public void setNumDocumentoPres(String numDocumentoPres) {
        this.numDocumentoPres = numDocumentoPres;
    }

    public String getNombrePres() {
        return nombrePres;
    }

    public void setNombrePres(String nombrePres) {
        this.nombrePres = nombrePres;
    }

    public String getDireccionPres() {
        return direccionPres;
    }

    public void setDireccionPres(String direccionPres) {
        this.direccionPres = direccionPres;
    }

    public String getemailPres() {
        return emailPres;
    }

    public void setemailPres(String emailPres) {
        this.emailPres = emailPres;
    }

    public String getCelularPres() {
        return celularPres;
    }

    public void setCelularPres(String celularPres) {
        this.celularPres = celularPres;
    }

    public String getTelefonoPres() {
        return telefonoPres;
    }

    public void setTelefonoPres(String telefonoPres) {
        this.telefonoPres = telefonoPres;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getResultadoPorEmail() {
        return resultadoPorEmail;
    }

    public void setResultadoPorEmail(Boolean resultadoPorEmail) {
        this.resultadoPorEmail = resultadoPorEmail;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(Boolean notificado) {
        this.notificado = notificado;
    }
}
