package enums;

public enum EstadoCitaEmergenciaEnum {

    INICIADA("I", "Iniciado"),
    ESPERA("E", "En espera"),
    ALTA("A", "De alta");

    private final String codigo;
    private final String valor;

    private EstadoCitaEmergenciaEnum(String codigo, String valor) {
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
