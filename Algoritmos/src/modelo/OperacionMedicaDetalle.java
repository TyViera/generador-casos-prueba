/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import util.AuditoriaBean;

public class OperacionMedicaDetalle extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private DocumentoMedico documentoMedico;

    private OperacionMedica operacionMedica;

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
