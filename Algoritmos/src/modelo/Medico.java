package modelo;

import java.math.BigDecimal;
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

/**
 * The persistent class for the medico database table.
 *
 */
@Entity
@Table(name = "medico")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Medico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "apemat", nullable = false)
    private String apeMat;

    @Column(name = "apepat", nullable = false)
    private String apePat;

    @Column(name = "celular")
    private String celular;

    @Column(name = "colegiatura", nullable = false)
    private String colegiatura;

    @Column(name = "ctacontable")
    private String ctaContable;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "essocio")
    private Boolean esSocio;

    @Column(name = "honorariomax", precision = 7, scale = 2)
    private BigDecimal honorarioMax;

    @Column(name = "honorariomin", precision = 7, scale = 2)
    private BigDecimal honorarioMin;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "nombrecompleto", nullable = false)
    private String nombreCompleto;

    @Column(name = "rne")
    private String rne;

    @Column(name = "ruc")
    private String ruc;

    @Column(name = "tiempoatencion")
    private Integer tiempoAtencion;

    @Column(name = "numeroconsultorio")
    private String numeroConsultorio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idarchivo")
    private Archivo foto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idarchivofirma")
    private Archivo firma;

    @JsonIgnoreProperties("medico")
    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    private List<Cita> citas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipoprofesional")
    private TipoProfesional tipoProfesional;

    @JsonIgnoreProperties("medico")
    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    private List<MedicoEspecialidad> medicoEspecialidades;

    @JsonIgnoreProperties("medico")
    @OneToMany(mappedBy = "medico", fetch = FetchType.LAZY)
    private List<DescuentoMedico> descuentosMedicos;

    public Medico() {
    }

    public String getApeMat() {
        return this.apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getApePat() {
        return this.apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getColegiatura() {
        return this.colegiatura;
    }

    public void setColegiatura(String colegiatura) {
        this.colegiatura = colegiatura;
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getEsSocio() {
        return this.esSocio;
    }

    public void setEsSocio(Boolean esSocio) {
        this.esSocio = esSocio;
    }

    public BigDecimal getHonorarioMax() {
        return this.honorarioMax;
    }

    public void setHonorarioMax(BigDecimal honorarioMax) {
        this.honorarioMax = honorarioMax;
    }

    public BigDecimal getHonorarioMin() {
        return this.honorarioMin;
    }

    public void setHonorarioMin(BigDecimal honorarioMin) {
        this.honorarioMin = honorarioMin;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRne() {
        return this.rne;
    }

    public void setRne(String rne) {
        this.rne = rne;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Integer getTiempoAtencion() {
        return this.tiempoAtencion;
    }

    public void setTiempoAtencion(Integer tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public List<Cita> getCitas() {
        return this.citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Cita addCita(Cita cita) {
        getCitas().add(cita);
        cita.setMedico(this);
        return cita;
    }

    public Cita removeCita(Cita cita) {
        getCitas().remove(cita);
        cita.setMedico(null);
        return cita;
    }

    public TipoProfesional getTipoProfesional() {
        return this.tipoProfesional;
    }

    public void setTipoProfesional(TipoProfesional tipoProfesional) {
        this.tipoProfesional = tipoProfesional;
    }

    public List<MedicoEspecialidad> getMedicoEspecialidades() {
        return this.medicoEspecialidades;
    }

    public void setMedicoEspecialidades(List<MedicoEspecialidad> medicoEspecialidades) {
        this.medicoEspecialidades = medicoEspecialidades;
    }

    public MedicoEspecialidad addMedicoEspecialidade(MedicoEspecialidad medicoEspecialidade) {
        getMedicoEspecialidades().add(medicoEspecialidade);
        medicoEspecialidade.setMedico(this);
        return medicoEspecialidade;
    }

    public MedicoEspecialidad removeMedicoEspecialidade(MedicoEspecialidad medicoEspecialidade) {
        getMedicoEspecialidades().remove(medicoEspecialidade);
        medicoEspecialidade.setMedico(null);
        return medicoEspecialidade;
    }

    public Archivo getFoto() {
        return foto;
    }

    public void setFoto(Archivo foto) {
        this.foto = foto;
    }

    public Archivo getFirma() {
        return firma;
    }

    public void setFirma(Archivo firma) {
        this.firma = firma;
    }

    public List<DescuentoMedico> getDescuentosMedicos() {
        return descuentosMedicos;
    }

    public void setDescuentosMedicos(List<DescuentoMedico> descuentosMedicos) {
        this.descuentosMedicos = descuentosMedicos;
    }

}
