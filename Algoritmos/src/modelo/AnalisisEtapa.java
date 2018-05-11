package modelo;

import java.util.List;
import util.AuditoriaBean;

public class AnalisisEtapa extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private Integer orden;

    private String formaPresentacion;

    private AnalisisTipo analisisTipo;

    private List<LabEtapaAnalisisEtiqueta> labEtapaAnalisisEtiquetas;

    private List<LabEtapaMetodo> metodos;

    private List<AnalisisParametro> parametros;

    public AnalisisEtapa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public AnalisisTipo getAnalisisTipo() {
        return analisisTipo;
    }

    public void setAnalisisTipo(AnalisisTipo analisisTipo) {
        this.analisisTipo = analisisTipo;
    }

    public String getFormaPresentacion() {
        return formaPresentacion;
    }

    public void setFormaPresentacion(String formaPresentacion) {
        this.formaPresentacion = formaPresentacion;
    }

    public List<LabEtapaAnalisisEtiqueta> getLabEtapaAnalisisEtiquetas() {
        return labEtapaAnalisisEtiquetas;
    }

    public void setLabEtapaAnalisisEtiquetas(List<LabEtapaAnalisisEtiqueta> labEtapaAnalisisEtiquetas) {
        this.labEtapaAnalisisEtiquetas = labEtapaAnalisisEtiquetas;
    }

    public List<LabEtapaMetodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(List<LabEtapaMetodo> metodos) {
        this.metodos = metodos;
    }

    public List<AnalisisParametro> getParametros() {
        return parametros;
    }

    public void setParametros(List<AnalisisParametro> parametros) {
        this.parametros = parametros;
    }

}
