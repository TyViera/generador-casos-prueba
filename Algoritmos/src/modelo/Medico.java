package modelo;

import java.math.BigDecimal;
import java.util.List;
import util.AuditoriaBean;

public class Medico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String apeMat;

    private String apePat;

    private String celular;

    private String colegiatura;

    private String ctaContable;

    private String direccion;

    private String dni;

    private Boolean esSocio;

    private BigDecimal honorarioMax;

    private BigDecimal honorarioMin;

    private String nombre;

    private String nombreCompleto;

    private String rne;

    private String ruc;

    private Integer tiempoAtencion;

    private String numeroConsultorio;

    private Archivo foto;

    private Archivo firma;

    private List<Cita> citas;

    private TipoProfesional tipoProfesional;

    private List<MedicoEspecialidad> medicoEspecialidades;

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
