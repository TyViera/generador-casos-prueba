package enums;

public enum EstadoAdmisionEnum {

    GENERADA("G", "GENERADA"),
    LIQUIDADA("L", "LIQUIDADA"),
    FACTURADA("F", "FACTURADA"),
    SUNAT("S", "SUNAT"),
    TRAMA("T", "TRAMA"),
    ANULADO("A", "ANULADA");

    private final String valor;
    private final String nombreLargo;

    private EstadoAdmisionEnum(String valor, String nombreLargo) {
        this.valor = valor;
        this.nombreLargo = nombreLargo;
    }

    public String getValor() {
        return valor;
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public static String getNombreLargo(String nombreCorto) {
        if (GENERADA.valor.equals(nombreCorto)) {
            return GENERADA.nombreLargo;
        }
        if (LIQUIDADA.valor.equals(nombreCorto)) {
            return LIQUIDADA.nombreLargo;
        }
        if (FACTURADA.valor.equals(nombreCorto)) {
            return FACTURADA.nombreLargo;
        }
        if (SUNAT.valor.equals(nombreCorto)) {
            return SUNAT.nombreLargo;
        }
        if (TRAMA.valor.equals(nombreCorto)) {
            return TRAMA.nombreLargo;
        }
        if (ANULADO.valor.equals(nombreCorto)) {
            return ANULADO.nombreLargo;
        }
        return null;
    }

}
