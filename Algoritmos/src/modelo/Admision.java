package modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.sql.Time;
import util.AuditoriaBean;

/**
 * The persistent class for the admision database table.
 *
 */
public class Admision extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private TipoAdmision tipoAdmision;

    private Cobertura cobertura;

    private Persona persona;

    private Poliza poliza;

    private TipoPaciente tipoPaciente;

    private TipoAfiliacion tipoAfiliacion;

    private ProductoSiteds productoSiteds;

    private String numAutorizacion;

    private BigDecimal honorarios;

    private BigDecimal deducible;

    private BigDecimal deducibleDental;

    private BigDecimal coAseguro;

    private Timestamp fechaAdmision;

    private Timestamp fechaAlta;

    private Time inicioAtencion;

    private Time finAtencion;

    private Boolean alta;

    private Boolean liquidado;

    private Boolean facturado;

    private String estadoAdmision;

    private List<PreFacturaAseguradora> preFacturasAseguradora;

    private List<AdmisionMedico> admisionesMedico;

    private List<DocumentoCabecera> documentoCabeceras;

    private List<Interconsulta> interconsultas;

    private List<AdmisionDescuentoSocial> admisionDescuentosSociales;

    private List<HospitalizacionPrestacion> hospitalizacionPrestaciones;

    public Admision() {
    }

    public BigDecimal getCoAseguro() {
        return this.coAseguro;
    }

    public void setCoAseguro(BigDecimal coAseguro) {
        this.coAseguro = coAseguro;
    }

    public BigDecimal getDeducible() {
        return this.deducible;
    }

    public void setDeducible(BigDecimal deducible) {
        this.deducible = deducible;
    }

    public BigDecimal getDeducibleDental() {
        return deducibleDental;
    }

    public void setDeducibleDental(BigDecimal deducibleDental) {
        this.deducibleDental = deducibleDental;
    }

    public BigDecimal getHonorarios() {
        return this.honorarios;
    }

    public void setHonorarios(BigDecimal honorarios) {
        this.honorarios = honorarios;
    }

    public String getNumAutorizacion() {
        return this.numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public Cobertura getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Poliza getPoliza() {
        return this.poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public TipoAdmision getTipoAdmision() {
        return this.tipoAdmision;
    }

    public void setTipoAdmision(TipoAdmision tipoAdmision) {
        this.tipoAdmision = tipoAdmision;
    }

    public TipoPaciente getTipoPaciente() {
        return this.tipoPaciente;
    }

    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEstadoAdmision() {
        return estadoAdmision;
    }

    public void setEstadoAdmision(String estadoAdmision) {
        this.estadoAdmision = estadoAdmision;
    }

    public List<PreFacturaAseguradora> getPreFacturasAseguradora() {
        return preFacturasAseguradora;
    }

    public void setPreFacturasAseguradora(List<PreFacturaAseguradora> preFacturasAseguradora) {
        this.preFacturasAseguradora = preFacturasAseguradora;
    }

    public List<AdmisionMedico> getAdmisionesMedico() {
        return admisionesMedico;
    }

    public void setAdmisionesMedico(List<AdmisionMedico> admisionesMedico) {
        this.admisionesMedico = admisionesMedico;
    }

    public Timestamp getFechaAdmision() {
        return fechaAdmision;
    }

    public void setFechaAdmision(Timestamp fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
    }

    public List<DocumentoCabecera> getDocumentoCabeceras() {
        return documentoCabeceras;
    }

    public void setDocumentoCabeceras(List<DocumentoCabecera> documentoCabeceras) {
        this.documentoCabeceras = documentoCabeceras;
    }

    public List<Interconsulta> getInterconsultas() {
        return interconsultas;
    }

    public void setInterconsultas(List<Interconsulta> interconsultas) {
        this.interconsultas = interconsultas;
    }

    public List<AdmisionDescuentoSocial> getAdmisionDescuentosSociales() {
        return admisionDescuentosSociales;
    }

    public void setAdmisionDescuentosSociales(List<AdmisionDescuentoSocial> admisionDescuentosSociales) {
        this.admisionDescuentosSociales = admisionDescuentosSociales;
    }

    public Time getInicioAtencion() {
        return inicioAtencion;
    }

    public void setInicioAtencion(Time inicioAtencion) {
        this.inicioAtencion = inicioAtencion;
    }

    public Time getFinAtencion() {
        return finAtencion;
    }

    public void setFinAtencion(Time finAtencion) {
        this.finAtencion = finAtencion;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public TipoAfiliacion getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(TipoAfiliacion tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public ProductoSiteds getProductoSiteds() {
        return productoSiteds;
    }

    public void setProductoSiteds(ProductoSiteds productoSiteds) {
        this.productoSiteds = productoSiteds;
    }

    public Boolean getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(Boolean liquidado) {
        this.liquidado = liquidado;
    }

    public Boolean getFacturado() {
        return facturado;
    }

    public void setFacturado(Boolean facturado) {
        this.facturado = facturado;
    }

    public List<HospitalizacionPrestacion> getHospitalizacionPrestaciones() {
        return hospitalizacionPrestaciones;
    }

    public void setHospitalizacionPrestaciones(List<HospitalizacionPrestacion> hospitalizacionPrestaciones) {
        this.hospitalizacionPrestaciones = hospitalizacionPrestaciones;
    }

}
