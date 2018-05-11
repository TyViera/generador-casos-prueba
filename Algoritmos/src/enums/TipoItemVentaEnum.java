package enums;

public enum TipoItemVentaEnum {

    PRODUCTO("P"),
    SERVICIO("S");

    private final String value;

    private TipoItemVentaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
