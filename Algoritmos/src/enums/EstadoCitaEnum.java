package enums;

public enum EstadoCitaEnum {

    SEPARADA("S", "Separada"),
    CANCELADA("C", "Cancelada"),
    CONFIRMADA("F", "Confirmada"),
    EN_ATENCION("E", "En atención"),
    ATENDIDO("A", "Atendido");

    private final String codigo;
    private final String valor;

    private EstadoCitaEnum(String codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

}
