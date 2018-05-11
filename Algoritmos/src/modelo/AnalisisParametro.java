package modelo;

import java.util.List;
import util.AuditoriaBean;

public class AnalisisParametro extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String unidadMedida;

    private Integer orden;

    private Boolean cursiva;

    private String tipo;

    private AnalisisEtapa analisisEtapa;

    private List<AnalisisParametroResultado> analisisParametrosResultados;

    private List<LabResultadoDet> labResultadosDet;

    private List<AnalisisValorRef> analisisValoresRef;

    public AnalisisParametro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getCursiva() {
        return cursiva;
    }

    public void setCursiva(Boolean cursiva) {
        this.cursiva = cursiva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public AnalisisEtapa getAnalisisEtapa() {
        return analisisEtapa;
    }

    public void setAnalisisEtapa(AnalisisEtapa analisisEtapa) {
        this.analisisEtapa = analisisEtapa;
    }

    public List<AnalisisParametroResultado> getAnalisisParametrosResultados() {
        return analisisParametrosResultados;
    }

    public void setAnalisisParametrosResultados(List<AnalisisParametroResultado> analisisParametrosResultados) {
        this.analisisParametrosResultados = analisisParametrosResultados;
    }

    public List<LabResultadoDet> getLabResultadosDet() {
        return labResultadosDet;
    }

    public void setLabResultadosDet(List<LabResultadoDet> labResultadosDet) {
        this.labResultadosDet = labResultadosDet;
    }

    public List<AnalisisValorRef> getAnalisisValoresRef() {
        return analisisValoresRef;
    }

    public void setAnalisisValoresRef(List<AnalisisValorRef> analisisValoresRef) {
        this.analisisValoresRef = analisisValoresRef;
    }

}
