package modelo;

import java.sql.Time;
import java.util.Date;
import util.AuditoriaBean;

public class ProgramaHorario extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String actividad;

    private Integer anio;

    private Date fecProg;

    private Time horaFin;

    private Time horaIni;

    private Integer mes;

    private Medico medico;

    public ProgramaHorario() {
    }

    public String getActividad() {
        return this.actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Integer getAnio() {
        return this.anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Date getFecProg() {
        return this.fecProg;
    }

    public void setFecProg(Date fecProg) {
        this.fecProg = fecProg;
    }

    public Time getHorafin() {
        return this.horaFin;
    }

    public void setHorafin(Time horafin) {
        this.horaFin = horafin;
    }

    public Time getHoraIni() {
        return this.horaIni;
    }

    public void setHoraIni(Time horaIni) {
        this.horaIni = horaIni;
    }

    public Integer getMes() {
        return this.mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
