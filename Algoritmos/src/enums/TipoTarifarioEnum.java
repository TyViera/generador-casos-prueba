package enums;

public enum TipoTarifarioEnum {

    FIJA('F'),
    PUNTOS('P'),
    PORCENTAJE('J'),
    HONORARIO('H'),
    NO_APLICA('N');

    private final Character valor;

    private TipoTarifarioEnum(Character valor) {
        this.valor = valor;
    }

    public Character getValor() {
        return valor;
    }

}
