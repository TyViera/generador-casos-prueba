package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "motivo")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class Motivo extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipomotivo")
    private TipoMotivo tipoMotivo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codsunat")
    private String codsunat;

    @JsonIgnoreProperties("motivo")
    @OneToMany(mappedBy = "motivo", fetch = FetchType.LAZY)
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
