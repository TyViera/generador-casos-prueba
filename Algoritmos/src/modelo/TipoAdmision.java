package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import java.math.BigDecimal;

/**
 * The persistent class for the tipoadmision database table.
 *
 */
@Entity
@Table(name = "tipoadmision")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoAdmision extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "porcenthonorario")
    private BigDecimal porcentajeHonorario;

    @Column(name = "incluyecita")
    private Boolean incluyeCita;

    @Column(name = "modificaprecio")
    private Boolean modificaPrecio;

    @Column(name = "comprobante")
    private Boolean emiteComprobante;

    @Column(name = "hospitalizacion")
    private Boolean esHospitalizacion;

    @Column(name = "odontologia")
    private Boolean esOdontologia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idservicio")
    private Servicio servicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idserviciocontable")
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
