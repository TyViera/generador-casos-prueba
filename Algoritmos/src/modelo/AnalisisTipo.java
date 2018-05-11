package modelo;

import java.util.List;
import util.AuditoriaBean;

public class AnalisisTipo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String abreviatura;

    private String nombre;

    private Tarifario tarifario;

    private TarifaParticular tarifaParticular;

    private AnalisisCategoria analisisCategoria;

    private List<AnalisisEtapa> etapas;

    private List<LabResultadoTipoImpresion> resultadosImpresion;

    private List<LabObservacionResultado> observaciones;

    public AnalisisTipo() {
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

    public TarifaParticular getTarifaParticular() {
        return tarifaParticular;
    }

    public void setTarifaParticular(TarifaParticular tarifaParticular) {
        this.tarifaParticular = tarifaParticular;
    }

    public AnalisisCategoria getAnalisisCategoria() {
        return analisisCategoria;
    }

    public void setAnalisisCategoria(AnalisisCategoria analisisCategoria) {
        this.analisisCategoria = analisisCategoria;
    }

    public List<AnalisisEtapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<AnalisisEtapa> etapas) {
        this.etapas = etapas;
    }

    public List<LabObservacionResultado> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(List<LabObservacionResultado> observaciones) {
        this.observaciones = observaciones;
    }

    public List<LabResultadoTipoImpresion> getResultadosImpresion() {
        return resultadosImpresion;
    }

    public void setResultadosImpresion(List<LabResultadoTipoImpresion> resultadosImpresion) {
        this.resultadosImpresion = resultadosImpresion;
    }

}
