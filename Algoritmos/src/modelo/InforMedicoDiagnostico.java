package modelo;

import util.AuditoriaBean;

public class InforMedicoDiagnostico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Diagnostico diagnostico;

    private InforMedico informedico;

    private String tipo;

    public InforMedicoDiagnostico() {
    }

    public Diagnostico getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public InforMedico getInformedico() {
        return this.informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
