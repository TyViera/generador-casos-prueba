package enums;

public enum TipoImpresoraEnum {

    MATRICIAL("M"),
    TERMICA("T");

    private final String value;

    private TipoImpresoraEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
