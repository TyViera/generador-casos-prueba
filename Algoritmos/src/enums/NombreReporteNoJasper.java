package enums;

public enum NombreReporteNoJasper {

    LABORATORIO("resultados_laboratorio");

    private final String value;

    private NombreReporteNoJasper(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
