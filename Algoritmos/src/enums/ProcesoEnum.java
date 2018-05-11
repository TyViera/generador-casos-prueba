package enums;

public enum ProcesoEnum {

    FARMACIA("farmacia"),
    ADMISION("admision"),
    ATENCION("atencion"),
    COBRANZA("cobranza"),
    CARITA("carita"),
    TODOS("todos"),
    FACTURACION("facturacion");

    private final String valor;

    private ProcesoEnum(String nombre) {
        this.valor = nombre;
    }

    public String getValor() {
        return valor;
    }

}
