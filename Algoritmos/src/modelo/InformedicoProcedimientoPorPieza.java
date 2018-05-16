package modelo;

import util.AuditoriaBean;

public class InformedicoProcedimientoPorPieza extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private InforMedicoExamen inforMedicoExamen;

    private PiezaDental piezaDental;

    public InformedicoProcedimientoPorPieza() {
    }

    public InforMedicoExamen getInforMedicoExamen() {
        return inforMedicoExamen;
    }

    public void setInforMedicoExamen(InforMedicoExamen inforMedicoExamen) {
        this.inforMedicoExamen = inforMedicoExamen;
    }

    public PiezaDental getPiezaDental() {
        return piezaDental;
    }

    public void setPiezaDental(PiezaDental piezaDental) {
        this.piezaDental = piezaDental;
    }

}
