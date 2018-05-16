package modelo;

import java.util.Date;
import util.AuditoriaBean;

public class Paciente extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Persona persona;

    private String email;

    private Date fecNac;

    private Character sexo;

    private String tipoSangre;

    private Archivo foto;

    private Parentesco parentesco;

    private Persona padre;

    private Persona madre;

    public Paciente() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecNac() {
        return this.fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Character getSexo() {
        return this.sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Parentesco getParentesco() {
        return this.parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public Archivo getFoto() {
        return foto;
    }

    public void setFoto(Archivo foto) {
        this.foto = foto;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

}
