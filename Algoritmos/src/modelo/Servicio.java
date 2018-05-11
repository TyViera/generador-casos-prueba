package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.FetchType;

@Entity
@Table(name = "servicio")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Servicio extends AuditoriaBean {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigoenvio")
    private String codigoEnvio;

    @JsonIgnoreProperties("servicio")
    @OneToMany(mappedBy = "servicio")
    private List<TarifaParticular> tarifaParticulares;

    @JsonIgnoreProperties("servicio")
    @OneToMany(mappedBy = "servicio", fetch = FetchType.LAZY)
    private List<Tarifario> tarifarios;

    @JsonIgnoreProperties("servicio")
    @OneToMany(mappedBy = "servicio", fetch = FetchType.LAZY)
    private List<DocumServicioDet> documentosServicioDet;

    @JsonIgnoreProperties("servicio")
    @OneToMany(mappedBy = "servicio", fetch = FetchType.LAZY)
    private List<PreFacturaAseguradora> preFacturasAseguradora;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public List<TarifaParticular> getTarifaParticulares() {
        return tarifaParticulares;
    }

    public void setTarifaParticulares(List<TarifaParticular> tarifaParticulares) {
        this.tarifaParticulares = tarifaParticulares;
    }

    public List<Tarifario> getTarifarios() {
        return tarifarios;
    }

    public void setTarifarios(List<Tarifario> tarifarios) {
        this.tarifarios = tarifarios;
    }

    public List<DocumServicioDet> getDocumentosServicioDet() {
        return documentosServicioDet;
    }

    public void setDocumentosServicioDet(List<DocumServicioDet> documentosServicioDet) {
        this.documentosServicioDet = documentosServicioDet;
    }

    public List<PreFacturaAseguradora> getPreFacturasAseguradora() {
        return preFacturasAseguradora;
    }

    public void setPreFacturasAseguradora(List<PreFacturaAseguradora> preFacturasAseguradora) {
        this.preFacturasAseguradora = preFacturasAseguradora;
    }

}
