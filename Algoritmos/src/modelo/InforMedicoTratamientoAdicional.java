package modelo;

import util.AuditoriaBean;

public class InforMedicoTratamientoAdicional extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedico informedico;

    private String adicional;

    public InforMedico getInformedico() {
        return this.informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

}
