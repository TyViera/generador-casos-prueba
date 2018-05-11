package enums;

public enum EstadoTramaEnum {

    GENERADA("G"),
    ACEPTADA("A");

    private final String valor;

    private EstadoTramaEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
