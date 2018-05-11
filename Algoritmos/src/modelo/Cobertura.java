package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;

/**
 * The persistent class for the cobertura database table.
 *
 */
@Entity
@Table(name = "cobertura")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Cobertura extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipocobertura")
    private String tipoCobertura;

    @JsonIgnoreProperties("cobertura")
    @OneToMany(mappedBy = "cobertura", fetch = FetchType.LAZY)
    private List<PolizaCobertura> polizaCoberturas;

    @JsonIgnoreProperties("cobertura")
    @OneToMany(mappedBy = "cobertura", fetch = FetchType.LAZY)
    private List<Tarifario> tarifarios;

    public Cobertura() {
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public List<PolizaCobertura> getPolizaCoberturas() {
        return this.polizaCoberturas;
    }

    public void setPolizaCoberturas(List<PolizaCobertura> polizaCoberturas) {
        this.polizaCoberturas = polizaCoberturas;
    }

    public PolizaCobertura addPolizaCobertura(PolizaCobertura polizaCobertura) {
        getPolizaCoberturas().add(polizaCobertura);
        polizaCobertura.setCobertura(this);
        return polizaCobertura;
    }

    public PolizaCobertura removePolizaCobertura(PolizaCobertura polizaCobertura) {
        getPolizaCoberturas().remove(polizaCobertura);
        polizaCobertura.setCobertura(null);
        return polizaCobertura;
    }

    public List<Tarifario> getTarifarios() {
        return this.tarifarios;
    }

    public void setTarifarios(List<Tarifario> tarifarios) {
        this.tarifarios = tarifarios;
    }

    public Tarifario addTarifario(Tarifario tarifario) {
        getTarifarios().add(tarifario);
        tarifario.setCobertura(this);
        return tarifario;
    }

    public Tarifario removeTarifario(Tarifario tarifario) {
        getTarifarios().remove(tarifario);
        tarifario.setCobertura(null);
        return tarifario;
    }

}
