package modelo;

import util.AuditoriaBean;

public class PolizaPreExistencia extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private PolizaPaciente polizaPaciente;

    private Diagnostico diagnostico;

    public PolizaPreExistencia() {
    }

    public PolizaPaciente getPolizaPaciente() {
        return polizaPaciente;
    }

    public void setPolizaPaciente(PolizaPaciente polizaPaciente) {
        this.polizaPaciente = polizaPaciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

}
