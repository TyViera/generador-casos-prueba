package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import com.grupocaritafeliz.sistemaclinico.util.Detalle;

/**
 * The persistent class for the poliza database table.
 *
 */
@Entity
@Table(name = "poliza")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Poliza extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAseguradora", nullable = false)
    private Aseguradora aseguradora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(name = "moneda", nullable = false)
    private String moneda;

    @Column(name = "plansalud")
    private String planSalud;

    @Detalle
    @JsonIgnoreProperties("poliza")
    @OneToMany(mappedBy = "poliza", fetch = FetchType.LAZY)
    private List<PolizaCobertura> polizaCoberturas;

    @Detalle
    @JsonIgnoreProperties("poliza")
    @OneToMany(mappedBy = "poliza", fetch = FetchType.LAZY)
    private List<PolizaTarifaDiferenciada> tarifasDiferenciadas;

    @JsonIgnoreProperties("poliza")
    @OneToMany(mappedBy = "poliza", fetch = FetchType.LAZY)
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
