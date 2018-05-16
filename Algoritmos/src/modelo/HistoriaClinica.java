package modelo;

import util.AuditoriaBean;

public class HistoriaClinica extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer numero;

    private Persona persona;

    private InforMedico informedico;

    public HistoriaClinica() {
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public InforMedico getInformedico() {
        return informedico;
    }

    public void setInformedico(InforMedico informedico) {
        this.informedico = informedico;
    }

}
