package modelo;

import java.math.BigDecimal;
import util.AuditoriaBean;

public class PolizaTarifaDiferenciada extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private BigDecimal monto1;

    private BigDecimal cantidad1;

    private String tipo1;

    private BigDecimal monto2;

    private BigDecimal cantidad2;

    private String tipo2;

    private BigDecimal monto3;

    private BigDecimal cantidad3;

    private String tipo3;

    private Poliza poliza;

    private Tarifario tarifario;

    public PolizaTarifaDiferenciada() {
    }

    public BigDecimal getMonto1() {
        return monto1;
    }

    public void setMonto1(BigDecimal monto1) {
        this.monto1 = monto1;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public BigDecimal getMonto2() {
        return monto2;
    }

    public void setMonto2(BigDecimal monto2) {
        this.monto2 = monto2;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public BigDecimal getMonto3() {
        return monto3;
    }

    public void setMonto3(BigDecimal monto3) {
        this.monto3 = monto3;
    }

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public BigDecimal getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(BigDecimal cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public BigDecimal getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(BigDecimal cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public BigDecimal getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(BigDecimal cantidad3) {
        this.cantidad3 = cantidad3;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }

}
