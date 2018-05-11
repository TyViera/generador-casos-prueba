package modelo;

import java.math.BigDecimal;
import java.util.List;
import util.AuditoriaBean;

/**
 * The persistent class for the aseguradora database table.
 *
 */
public class Aseguradora extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String celular;

    private String codigoIafas;

    private String ctaContable;

    private String direccion;

    private BigDecimal dsctoFarmacia;

    private String email;

    private BigDecimal factorServicio;

    private BigDecimal tarifaCama;

    private BigDecimal honorarios;

    private BigDecimal porcentajeIncrementoFeriado;

    private String nombre;

    private BigDecimal porcEmergdia;

    private BigDecimal porcEmergNoche;

    private String reprLegal;

    private String ruc;

    private String telefono;

    private Boolean incrEmergHonorarios;

    private Boolean verificaPlanSiteds;

    private List<Poliza> polizas;

    private List<PreFacturaAseguradora> preFacturasAseguradora;

    private Persona persona;

    public Aseguradora() {
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCodigoIafas() {
        return this.codigoIafas;
    }

    public void setCodigoIafas(String codigoIafas) {
        this.codigoIafas = codigoIafas;
    }

    public String getCtaContable() {
        return this.ctaContable;
    }

    public void setCtaContable(String ctaContable) {
        this.ctaContable = ctaContable;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigDecimal getDsctoFarmacia() {
        return this.dsctoFarmacia;
    }

    public void setDsctoFarmacia(BigDecimal dsctoFarmacia) {
        this.dsctoFarmacia = dsctoFarmacia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getFactorServicio() {
        return this.factorServicio;
    }

    public void setFactorServicio(BigDecimal factorServicio) {
        this.factorServicio = factorServicio;
    }

    public BigDecimal getHonorarios() {
        return this.honorarios;
    }

    public void setHonorarios(BigDecimal honorarios) {
        this.honorarios = honorarios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPorcEmergdia() {
        return this.porcEmergdia;
    }

    public void setPorcEmergdia(BigDecimal porcEmergdia) {
        this.porcEmergdia = porcEmergdia;
    }

    public BigDecimal getPorcEmergNoche() {
        return this.porcEmergNoche;
    }

    public void setPorcEmergNoche(BigDecimal porcEmergNoche) {
        this.porcEmergNoche = porcEmergNoche;
    }

    public String getReprLegal() {
        return this.reprLegal;
    }

    public void setReprLegal(String reprLegal) {
        this.reprLegal = reprLegal;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getIncrEmergHonorarios() {
        return incrEmergHonorarios;
    }

    public void setIncrEmergHonorarios(Boolean incrEmergHonorarios) {
        this.incrEmergHonorarios = incrEmergHonorarios;
    }

    public List<Poliza> getPolizas() {
        return this.polizas;
    }

    public void setPolizas(List<Poliza> polizas) {
        this.polizas = polizas;
    }

    public Poliza addPolizaPaciente(Poliza poliza) {
        getPolizas().add(poliza);
        poliza.setAseguradora(this);
        return poliza;
    }

    public Poliza removePolizaPaciente(Poliza poliza) {
        getPolizas().remove(poliza);
        poliza.setAseguradora(null);
        return poliza;
    }

    public List<PreFacturaAseguradora> getPreFacturasAseguradora() {
        return preFacturasAseguradora;
    }

    public void setPreFacturasAseguradora(List<PreFacturaAseguradora> preFacturasAseguradora) {
        this.preFacturasAseguradora = preFacturasAseguradora;
    }

    public BigDecimal getPorcentajeIncrementoFeriado() {
        return porcentajeIncrementoFeriado;
    }

    public void setPorcentajeIncrementoFeriado(BigDecimal porcentajeIncrementoFeriado) {
        this.porcentajeIncrementoFeriado = porcentajeIncrementoFeriado;
    }

    public BigDecimal getTarifaCama() {
        return tarifaCama;
    }

    public void setTarifaCama(BigDecimal tarifaCama) {
        this.tarifaCama = tarifaCama;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Boolean getVerificaPlanSiteds() {
        return verificaPlanSiteds;
    }

    public void setVerificaPlanSiteds(Boolean verificaPlanSiteds) {
        this.verificaPlanSiteds = verificaPlanSiteds;
    }

}
