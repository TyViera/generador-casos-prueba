package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Poliza extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Aseguradora aseguradora;

    private Persona persona;

    private String moneda;

    private String planSalud;

    private List<PolizaCobertura> polizaCoberturas;

    private List<PolizaTarifaDiferenciada> tarifasDiferenciadas;

    private List<PolizaPaciente> polizaPacientes;

    public Poliza() {
    }

    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getMoneda() {
        return this.moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPlanSalud() {
        return this.planSalud;
    }

    public void setPlanSalud(String planSalud) {
        this.planSalud = planSalud;
    }

    public List<PolizaCobertura> getPolizaCoberturas() {
        return this.polizaCoberturas;
    }

    public void setPolizaCoberturas(List<PolizaCobertura> polizaCoberturas) {
        this.polizaCoberturas = polizaCoberturas;
    }

    public PolizaCobertura addPolizaCobertura(PolizaCobertura polizaCobertura) {
        getPolizaCoberturas().add(polizaCobertura);
        polizaCobertura.setPoliza(this);
        return polizaCobertura;
    }

    public PolizaCobertura removePolizaCobertura(PolizaCobertura polizaCobertura) {
        getPolizaCoberturas().remove(polizaCobertura);
        polizaCobertura.setPoliza(null);
        return polizaCobertura;
    }

    public List<PolizaPaciente> getPolizaPacientes() {
        return this.polizaPacientes;
    }

    public void setPolizaPacientes(List<PolizaPaciente> polizaPacientes) {
        this.polizaPacientes = polizaPacientes;
    }

    public PolizaPaciente addPolizaPaciente(PolizaPaciente polizaPaciente) {
        getPolizaPacientes().add(polizaPaciente);
        polizaPaciente.setPoliza(this);
        return polizaPaciente;
    }

    public PolizaPaciente removePolizaPaciente(PolizaPaciente polizaPaciente) {
        getPolizaPacientes().remove(polizaPaciente);
        polizaPaciente.setPoliza(null);
        return polizaPaciente;
    }

    /**
     * Empresa
     *
     * @return
     */
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<PolizaTarifaDiferenciada> getTarifasDiferenciadas() {
        return tarifasDiferenciadas;
    }

    public void setTarifasDiferenciadas(List<PolizaTarifaDiferenciada> tarifasDiferenciadas) {
        this.tarifasDiferenciadas = tarifasDiferenciadas;
    }

}
