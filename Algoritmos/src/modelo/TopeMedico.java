package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class TopeMedico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private Integer anio;

    private Integer mes;

    private BigDecimal tope;

    private Medico medico;

    public TopeMedico() {
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public BigDecimal getTope() {
        return tope;
    }

    public void setTope(BigDecimal tope) {
        this.tope = tope;
    }

}
