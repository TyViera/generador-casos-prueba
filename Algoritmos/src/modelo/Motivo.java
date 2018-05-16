package modelo;

import java.util.List;
import util.AuditoriaBean;

public class Motivo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private TipoMotivo tipoMotivo;

    private String nombre;

    private String codsunat;

    private List<DocumentoCabecera> documentoCabeceras;

    public TipoMotivo getTipoMotivo() {
        return tipoMotivo;
    }

    public void setTipoMotivo(TipoMotivo tipoMotivo) {
        this.tipoMotivo = tipoMotivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DocumentoCabecera> getDocumentoCabeceras() {
        return documentoCabeceras;
    }

    public void setDocumentoCabeceras(List<DocumentoCabecera> documentoCabeceras) {
        this.documentoCabeceras = documentoCabeceras;
    }

    public String getCodsunat() {
        return codsunat;
    }

    public void setCodsunat(String codsunat) {
        this.codsunat = codsunat;
    }

}
