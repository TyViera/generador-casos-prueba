package enums;

public enum TipoPersonaVentaEnum {

    PARTICULAR("P"),
    CONVENIO("C"),
    ASEGURADO("A");

    private final String value;

    private TipoPersonaVentaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
