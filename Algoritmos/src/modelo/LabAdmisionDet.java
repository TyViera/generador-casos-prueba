package modelo;

import java.util.List;
import util.AuditoriaBean;

public class LabAdmisionDet extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LabAdmisionCab labAdmisionCab;

    private AnalisisTipo analisisTipo;

    private Boolean muestraEntregada;

    private Integer numeroMuestras;

    private String tipo;

    private List<LabAdmisionEntregaMuestra> labAdmisionEntregaMuestras;

    public LabAdmisionDet() {
    }

    public LabAdmisionCab getLabAdmisionCab() {
        return labAdmisionCab;
    }

    public void setLabAdmisionCab(LabAdmisionCab labAdmisionCab) {
        this.labAdmisionCab = labAdmisionCab;
    }

    public AnalisisTipo getAnalisisTipo() {
        return analisisTipo;
    }

    public void setAnalisisTipo(AnalisisTipo analisisTipo) {
        this.analisisTipo = analisisTipo;
    }

    public Boolean getMuestraEntregada() {
        return muestraEntregada;
    }

    public void setMuestraEntregada(Boolean muestraEntregada) {
        this.muestraEntregada = muestraEntregada;
    }

    public Integer getNumeroMuestras() {
        return numeroMuestras;
    }

    public void setNumeroMuestras(Integer numeroMuestras) {
        this.numeroMuestras = numeroMuestras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<LabAdmisionEntregaMuestra> getLabAdmisionEntregaMuestras() {
        return labAdmisionEntregaMuestras;
    }

    public void setLabAdmisionEntregaMuestras(List<LabAdmisionEntregaMuestra> labAdmisionEntregaMuestras) {
        this.labAdmisionEntregaMuestras = labAdmisionEntregaMuestras;
    }

}
