package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class TipoAdmision extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private BigDecimal porcentajeHonorario;

    private Boolean incluyeCita;

    private Boolean modificaPrecio;

    private Boolean emiteComprobante;

    private Boolean esHospitalizacion;

    private Boolean esOdontologia;

    private Servicio servicio;

    private ServicioContable servicioContable;

    public TipoAdmision() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public ServicioContable getServicioContable() {
        return servicioContable;
    }

    public void setServicioContable(ServicioContable servicioContable) {
        this.servicioContable = servicioContable;
    }

    public BigDecimal getPorcentajeHonorario() {
        return porcentajeHonorario;
    }

    public void setPorcentajeHonorario(BigDecimal porcentajeHonorario) {
        this.porcentajeHonorario = porcentajeHonorario;
    }

    public Boolean getIncluyeCita() {
        return incluyeCita;
    }

    public void setIncluyeCita(Boolean incluyeCita) {
        this.incluyeCita = incluyeCita;
    }

    public Boolean getModificaPrecio() {
        return modificaPrecio;
    }

    public void setModificaPrecio(Boolean modificaPrecio) {
        this.modificaPrecio = modificaPrecio;
    }

    public Boolean getEmiteComprobante() {
        return emiteComprobante;
    }

    public void setEmiteComprobante(Boolean emiteComprobante) {
        this.emiteComprobante = emiteComprobante;
    }

    public Boolean getEsHospitalizacion() {
        return esHospitalizacion;
    }

    public void setEsHospitalizacion(Boolean esHospitalizacion) {
        this.esHospitalizacion = esHospitalizacion;
    }

    public Boolean getEsOdontologia() {
        return esOdontologia;
    }

    public void setEsOdontologia(Boolean esOdontologia) {
        this.esOdontologia = esOdontologia;
    }

}
