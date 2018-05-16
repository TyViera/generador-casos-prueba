package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Servicio extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String nombre;

    private String codigoEnvio;

    private List<TarifaParticular> tarifaParticulares;

    private List<Tarifario> tarifarios;

    private List<DocumServicioDet> documentosServicioDet;

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
