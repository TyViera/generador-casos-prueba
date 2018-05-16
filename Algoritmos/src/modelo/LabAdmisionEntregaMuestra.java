package modelo;

import java.sql.Timestamp;
import util.AuditoriaBean;

public class LabAdmisionEntregaMuestra extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private LabAdmisionDet labAdmisionDet;

    private Timestamp fechaEntrega;

    public LabAdmisionEntregaMuestra() {
    }

    public LabAdmisionDet getLabAdmisionDet() {
        return labAdmisionDet;
    }

    public void setLabAdmisionDet(LabAdmisionDet labAdmisionDet) {
        this.labAdmisionDet = labAdmisionDet;
    }

    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
