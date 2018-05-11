package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tipomotivo")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class TipoMotivo extends AuditoriaBean {
    private static final long serialVersionUID = 1L;

    @Column(name="nombre")
    private String nombre;

    @JsonIgnoreProperties("tipoMotivo")
    @OneToMany(mappedBy = "tipoMotivo", fetch = FetchType.LAZY)
    private List<Motivo> motivos;

    public TipoMotivo(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
