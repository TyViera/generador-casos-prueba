package modelo;

import java.util.List;
import util.AuditoriaBean;

public class AnalisisParametroResultado extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private AnalisisParametro analisisParametro;

    private String nombre;

    private List<LabResultadoDet> labResultadosDet;

    public AnalisisParametroResultado() {
    }

    public AnalisisParametro getAnalisisParametro() {
        return analisisParametro;
    }

    public void setAnalisisParametro(AnalisisParametro analisisParametro) {
        this.analisisParametro = analisisParametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LabResultadoDet> getLabResultadosDet() {
        return labResultadosDet;
    }

    public void setLabResultadosDet(List<LabResultadoDet> labResultadosDet) {
        this.labResultadosDet = labResultadosDet;
    }

}
