package enums;

public enum EstadoDocumentoEnum {

    GENERADO('G', "Generado"),
    VALIDADO('V', "Validado por SUNAT"),
    EMITIDO('E', "Emitido para SUNAT"),
    ENVIADO_A_CONTABILIDAD('C', "Enviado a Contabilidad"),
    ANULADO('A', "Anulado"),
    SUBIDO_PAGINA('W', "Subido a pagina web");

    private final Character codigo;
    private final String valor;

    private EstadoDocumentoEnum(Character codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Character getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

}
