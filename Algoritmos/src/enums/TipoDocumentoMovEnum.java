package enums;

public enum TipoDocumentoMovEnum {
	
	NOTA_CREDITO(7L,"C"),
    NOTA_DEBITO(8L,"D"),
    NO_REFERENCIADO(null,"N");
    
    private final String value;
    private final Long id;

    private TipoDocumentoMovEnum(Long id,String value) {
        this.value = value;
        this.id = id;
    }

    public String getValue() {
        return value;
    }
    
    public Long getId(){
    	return id;
    }
}
