package modelo;

import java.util.Date;
import java.util.List;
import util.AuditoriaBean;

public class PolizaPaciente extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String carnet;

    private String codigo;

    private Date fecFin;

    private Date fecIni;

    private Persona persona;

    private Poliza poliza;

    private Date finCarenciaConsultas;

    private Date finCarenciaServicios;

    private Date finLatencia;

    private Persona titular;

    private List<PolizaPreExistencia> preExistencias;

    public PolizaPaciente() {
    }

    public String getCarnet() {
        return this.carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecFin() {
        return this.fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Date getFecIni() {
        return this.fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Poliza getPoliza() {
        return this.poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Date getFinCarenciaConsultas() {
        return finCarenciaConsultas;
    }

    public void setFinCarenciaConsultas(Date finCarenciaConsultas) {
        this.finCarenciaConsultas = finCarenciaConsultas;
    }

    public Date getFinCarenciaServicios() {
        return finCarenciaServicios;
    }

    public void setFinCarenciaServicios(Date finCarenciaServicios) {
        this.finCarenciaServicios = finCarenciaServicios;
    }

    public Date getFinLatencia() {
        return finLatencia;
    }

    public void setFinLatencia(Date finLatencia) {
        this.finLatencia = finLatencia;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public List<PolizaPreExistencia> getPreExistencias() {
        return preExistencias;
    }

    public void setPreExistencias(List<PolizaPreExistencia> preExistencias) {
        this.preExistencias = preExistencias;
    }

}
