package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class InforMedicoIndicacion extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Timestamp fechaInicio;

    private String indicaciones;

    private InforMedico informedico;

    public InforMedicoIndicacion() {
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

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

}
