package enums;

public enum ComprobanteEnum {

    BOLETA("B"),
    FACTURA("F");

    private final String value;

    private ComprobanteEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
