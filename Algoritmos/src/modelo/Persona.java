package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

/**
 * The persistent class for the persona database table.
 *
 */
@Entity
@Table(name = "persona")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Persona extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apepat", nullable = false)
    private String apePat;

    @Column(name = "apemat")
    private String apeMat;

    @Column(name = "nombrecompleto", nullable = false)
    private String nombreCompleto;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipodocumento")
    private TipoDocumento tipoDocumento;

    @Column(name = "numdocumento")
    private String numDocumento;

    @Column(name = "ruc")
    private String ruc;

    @Column(name = "tipopersona")
    private String tipoPersona;

    @Column(name = "celular")
    private String celular;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "otroscelulares")
    private String otrosCelulares;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idubigeo")
    private Ubigeo ubigeo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpais")
    private Pais pais;

    @Detalle
    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<PolizaPaciente> polizaPacientes;

    @Detalle
    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Cita> citas;

    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<TarifaSocial> tarifaSocials;

    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<PreFacturaAseguradora> preFacturasAseguradora;

    @JsonIgnoreProperties("persona")
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<HistoriaClinica> historiasClinica;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return this.apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return this.apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipodocumento) {
        this.tipoDocumento = tipodocumento;
    }

    public String getNumDocumento() {
        return this.numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
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

    public String getOtrosCelulares() {
        return otrosCelulares;
    }

    public void setOtrosCelulares(String otrosCelulares) {
        this.otrosCelulares = otrosCelulares;
    }

    public List<PolizaPaciente> getPolizaPacientes() {
        return this.polizaPacientes;
    }

    public void setPolizaPacientes(List<PolizaPaciente> polizaPacientes) {
        this.polizaPacientes = polizaPacientes;
    }

    public PolizaPaciente addPolizaPersona(PolizaPaciente polizaPersona) {
        getPolizaPacientes().add(polizaPersona);
        polizaPersona.setPersona(this);
        return polizaPersona;
    }

    public PolizaPaciente removePolizaPersona(PolizaPaciente polizaPersona) {
        getPolizaPacientes().remove(polizaPersona);
        polizaPersona.setPersona(null);
        return polizaPersona;
    }

    public List<Cita> getCitas() {
        return this.citas;
    }

    public void setCita(List<Cita> citas) {
        this.citas = citas;
    }

    public Cita addCita(Cita cita) {
        getCitas().add(cita);
        cita.setPersona(this);
        return cita;
    }

    public Cita removeCita(Cita cita) {
        getCitas().remove(cita);
        cita.setPersona(null);
        return cita;
    }

    public List<TarifaSocial> getTarifaSocials() {
        return tarifaSocials;
    }

    public void setTarifaSocials(List<TarifaSocial> tarifaSocials) {
        this.tarifaSocials = tarifaSocials;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apePat=" + apePat + ", apeMat="
                + apeMat + ", nombreCompleto=" + nombreCompleto
                + ", tipoDocumento=" + tipoDocumento + ", numDocumento="
                + numDocumento + ", ruc=" + ruc + ", tipoPersona="
                + tipoPersona + "]";
    }

    public List<PreFacturaAseguradora> getPreFacturasAseguradora() {
        return preFacturasAseguradora;
    }

    public void setPreFacturasAseguradora(List<PreFacturaAseguradora> preFacturasAseguradora) {
        this.preFacturasAseguradora = preFacturasAseguradora;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<HistoriaClinica> getHistoriasClinica() {
        return historiasClinica;
    }

    public void setHistoriasClinica(List<HistoriaClinica> historiasClinica) {
        this.historiasClinica = historiasClinica;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

}
