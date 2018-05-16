package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Persona extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String apePat;

    private String apeMat;

    private String nombreCompleto;

    private String direccion;

    private TipoDocumento tipoDocumento;

    private String numDocumento;

    private String ruc;

    private String tipoPersona;

    private String celular;

    private String telefono;

    private String otrosCelulares;

    private Ubigeo ubigeo;

    private Pais pais;

    private List<PolizaPaciente> polizaPacientes;

    private List<Paciente> pacientes;

    private List<Cita> citas;

    private List<TarifaSocial> tarifaSocials;

    private List<PreFacturaAseguradora> preFacturasAseguradora;

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
