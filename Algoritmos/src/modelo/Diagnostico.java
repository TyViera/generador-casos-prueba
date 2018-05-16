package modelo;

import util.AuditoriaBean;

public class Diagnostico extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String capa;

    private String codigo;

    private String nombre;

    private Integer sexo;

    public Diagnostico() {
    }

    public String getCapa() {
        return this.capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSexo() {
        return this.sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

}
