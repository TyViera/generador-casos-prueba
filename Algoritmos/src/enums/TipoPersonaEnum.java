package enums;

public enum TipoPersonaEnum {

    NATURAL("N", "Natural"),
    JURIDICA("J", "Juridica");

    private final String value;
    private final String nombre;

    private TipoPersonaEnum(String value, String nombre) {
        this.value = value;
        this.nombre = nombre;
    }

    public String getValue() {
        return value;
    }

    public String getNombre() {
        return nombre;
    }

}
