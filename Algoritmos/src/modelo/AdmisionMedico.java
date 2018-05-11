package modelo;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import util.AuditoriaBean;

/**
 * The persistent class for the admision database table.
 *
 */
public class AdmisionMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Admision admision;

    private Medico medico;

    private Timestamp fechaAdmision;

    private BigDecimal honorarios;

    private Boolean pagaDeducible;

    private Time inicioAtencion;

    private Time finAtencion;

    private String numeroConsultorio;

    private List<Cita> citas;

    private List<InforMedico> inforMedicos;

    public AdmisionMedico() {
    }

    public BigDecimal getHonorarios() {
        return this.honorarios;
    }

    public void setHonorarios(BigDecimal honorarios) {
        this.honorarios = honorarios;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Timestamp getFechaAdmision() {
        return fechaAdmision;
    }

    public void setFechaAdmision(Timestamp fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
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

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public List<Cita> getCitas() {
        return this.citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Cita addCita(Cita cita) {
        getCitas().add(cita);
        cita.setAdmisionMedico(this);
        return cita;
    }

    public Cita removeCita(Cita cita) {
        getCitas().remove(cita);
        cita.setAdmisionMedico(null);
        return cita;
    }

    public List<InforMedico> getInforMedicos() {
        return this.inforMedicos;
    }

    public void setInforMedicos(List<InforMedico> inforMedicos) {
        this.inforMedicos = inforMedicos;
    }

    public InforMedico addInformedico(InforMedico inforMedico) {
        getInforMedicos().add(inforMedico);
        inforMedico.setAdmisionMedico(this);
        return inforMedico;
    }

    public InforMedico removeInformedico(InforMedico inforMedico) {
        getInforMedicos().remove(inforMedico);
        inforMedico.setAdmisionMedico(null);
        return inforMedico;
    }

    public Boolean getPagaDeducible() {
        return pagaDeducible;
    }

    public void setPagaDeducible(Boolean pagaDeducible) {
        this.pagaDeducible = pagaDeducible;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

}
