/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.grupocaritafeliz.sistemaclinico.util.AuditoriaBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name = "operacionmedicadetalle")
@DynamicUpdate(value = true)
@DynamicInsert(value = true)
@SelectBeforeUpdate
public class OperacionMedicaDetalle extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iddocumentomedico")
    private DocumentoMedico documentoMedico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idoperacionmedica")
    private OperacionMedica operacionMedica;

    @Column(name = "pagamedico")
    private Boolean pagaMedico;

    public OperacionMedicaDetalle() {
    }

    public DocumentoMedico getDocumentoMedico() {
        return documentoMedico;
    }

    public void setDocumentoMedico(DocumentoMedico documentoMedico) {
        this.documentoMedico = documentoMedico;
    }

    public OperacionMedica getOperacionMedica() {
        return operacionMedica;
    }

    public void setOperacionMedica(OperacionMedica operacionMedica) {
        this.operacionMedica = operacionMedica;
    }

    public Boolean getPagaMedico() {
        return pagaMedico;
    }

    public void setPagaMedico(Boolean pagaMedico) {
        this.pagaMedico = pagaMedico;
    }

}
