package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class InforMedicoAnotacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaInicio;

    private String indicaciones;

    private String tratamiento;

    private InforMedico informedico;

    public InforMedicoAnotacion() {
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

}
