package enums;

public enum MotivoEnum {
	
	REINGRESO(2L,"R"),
    ANULACION(1L,"A");

    private final String value;
    private final Long id;

    private MotivoEnum(Long id,String value) {
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
