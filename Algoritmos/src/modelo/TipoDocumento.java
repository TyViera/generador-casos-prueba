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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the tipodocumento database table.
 *
 */
@Entity
@Table(name = "tipodocumento")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoDocumento extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "abreviatura")
    private String abreviatura;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codsunat")
    private String codigoSunat;

    @JsonIgnoreProperties("archivo")
    @OneToMany(mappedBy = "tipoDocumento", fetch = FetchType.LAZY)
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

    @JsonIgnoreProperties("tipoDocumento")
    @OneToMany(mappedBy = "tipoDocumento", fetch = FetchType.LAZY)

    private List<LibroReclamacion> libroReclamaciones;

    @JsonIgnoreProperties("tipoDocumentoPres")
    @OneToMany(mappedBy = "tipoDocumentoPres", fetch = FetchType.LAZY)
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
