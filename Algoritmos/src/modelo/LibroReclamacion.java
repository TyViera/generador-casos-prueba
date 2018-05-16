package modelo;

import util.AuditoriaBean;

public class LibroReclamacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String tipo;

    private TipoDocumento tipoDocumento;

    private String numDocumento;

    private String nombre;

    private String direccion;

    private String email;

    private String celular;

    private String telefono;

    private TipoDocumento tipoDocumentoPres;

    private String numDocumentoPres;

    private String nombrePres;

    private String direccionPres;

    private String emailPres;

    private String celularPres;

    private String telefonoPres;

    private String detalle;

    private Boolean resultadoPorEmail;

    private String respuesta;

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
