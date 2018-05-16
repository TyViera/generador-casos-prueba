package modelo;

import util.AuditoriaBean;

public class InforMedicoDetalle extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Boolean valorCheck;

    private String valorTexto;

    private InforMedico informedico;

    private ParrafoInforme parrafoInforme;

    private String tituloInforme;

    private String tituloParrafo;

    private Integer orden;

    public InforMedicoDetalle() {
    }

    public Boolean getValorCheck() {
        return this.valorCheck;
    }

    public void setValorCheck(Boolean valorCheck) {
        this.valorCheck = valorCheck;
    }

    public String getValorTexto() {
        return this.valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    public InforMedico getInformedico() {
        return this.informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public ParrafoInforme getParrafoInforme() {
        return this.parrafoInforme;
    }

    public void setParrafoInforme(ParrafoInforme parrafoInforme) {
        this.parrafoInforme = parrafoInforme;
    }

    public String getTituloInforme() {
        return tituloInforme;
    }

    public void setTituloInforme(String tituloInforme) {
        this.tituloInforme = tituloInforme;
    }

    public String getTituloParrafo() {
        return tituloParrafo;
    }

    public void setTituloParrafo(String tituloParrafo) {
        this.tituloParrafo = tituloParrafo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
