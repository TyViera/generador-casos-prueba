package enums;

public enum TipoDescuentoEnum {

    PORCENTUAL("P"),
    FIJO("F");

    private final String value;

    private TipoDescuentoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
