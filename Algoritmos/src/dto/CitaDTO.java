package dto;

import java.sql.Timestamp;

public class CitaDTO {

    private Long id;
    private String persona;
    private Boolean separado;
    private String estado;
    private String hora;
    private Timestamp horaInicio;
    private String turno;
    private Long medicoId;
    private String medico;
    private Long admisionMedicoId;

    public CitaDTO() {
        id = null;
        persona = "";
        separado = Boolean.FALSE;
        estado = "";
        hora = "";
        horaInicio = null;
        turno = "";
        medicoId = null;
        admisionMedicoId = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Boolean isSeparado() {
        return separado;
    }

    public void setSeparado(Boolean separado) {
        this.separado = separado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Long getAdmisionMedicoId() {
        return admisionMedicoId;
    }

    public void setAdmisionMedicoId(Long admisionMedicoId) {
        this.admisionMedicoId = admisionMedicoId;
    }

}
