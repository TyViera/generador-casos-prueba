package modelo;

import java.util.List;
import util.AuditoriaBean;

public class TipoDocumento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private String codigoSunat;

    private List<Persona> personas;

    public List<LibroReclamacion> getLibroReclamaciones() {
        return libroReclamaciones;
    }

    public void setLibroReclamaciones(List<LibroReclamacion> libroReclamaciones) {
        this.libroReclamaciones = libroReclamaciones;
    }

    public List<LibroReclamacion> getLibroReclamacionesPres() {
        return libroReclamacionesPres;
    }

    public void setLibroReclamacionesPres(List<LibroReclamacion> libroReclamacionesPres) {
        this.libroReclamacionesPres = libroReclamacionesPres;
    }

    private List<LibroReclamacion> libroReclamaciones;

    private List<LibroReclamacion> libroReclamacionesPres;

    public TipoDocumento() {
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoSunat() {
        return codigoSunat;
    }

    public void setCodigoSunat(String codigoSunat) {
        this.codigoSunat = codigoSunat;
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPacientes(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona addPersona(Persona persona) {
        getPersonas().add(persona);
        persona.setTipoDocumento(this);
        return persona;
    }

    public Persona removePaciente(Persona persona) {
        getPersonas().remove(persona);
        persona.setTipoDocumento(null);
        return persona;
    }

}
