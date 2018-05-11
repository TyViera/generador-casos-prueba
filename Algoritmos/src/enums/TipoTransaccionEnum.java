package enums;

public enum TipoTransaccionEnum {

    COMPRA("C"),
    VENTA("V"),
    OTROS("O");

    private final String valor;

    private TipoTransaccionEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
