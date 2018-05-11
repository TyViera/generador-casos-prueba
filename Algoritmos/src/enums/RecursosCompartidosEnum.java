package enums;

public enum RecursosCompartidosEnum {

    CORRELATIVO("correlativo"),
    ADMISION("admision"),
    PARAMETRO("parametro"),
    PRODUCTO("producto");

    private final String value;

    private RecursosCompartidosEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
