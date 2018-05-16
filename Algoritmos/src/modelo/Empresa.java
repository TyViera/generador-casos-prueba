package modelo;

import util.AuditoriaBean;

public class Empresa extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Persona persona;

    private String telefono;

    private String celular;

    private String email;

    private String representante;

    private Boolean esProveedor;

    public Empresa() {
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepresentante() {
        return this.representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Boolean isEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(Boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

}
