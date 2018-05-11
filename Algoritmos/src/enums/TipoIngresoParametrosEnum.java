package enums;

public enum TipoIngresoParametrosEnum {
    LINEA("L"),
    MULTILINEA("M"),
    TEXT("T");

    private final String value;

    private TipoIngresoParametrosEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
