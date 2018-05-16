package modelo;

import util.AuditoriaBean;

public class ProductoSiteds extends AuditoriaBean {

    private static final long serialVersionUID = 1L;

    private String codigo;

    private String nombre;

    private String abreviatura;

    private String listaCodigos;

    private Aseguradora aseguradora;

    public ProductoSiteds() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getListaCodigos() {
        return listaCodigos;
    }

    public void setListaCodigos(String listaCodigos) {
        this.listaCodigos = listaCodigos;
    }

}
