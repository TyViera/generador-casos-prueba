package enums;

public enum SexoEnum {

//	TODOS("Todos", 0),
    MASCULINO("Masculino", "M"),
    FEMENINO("Femenino", "F");

    private final String nombre;
    private final String valor;

    private SexoEnum(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

}
