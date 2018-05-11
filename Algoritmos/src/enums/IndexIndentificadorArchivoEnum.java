package enums;

public enum IndexIndentificadorArchivoEnum {
	
	FOTO(0),
	FIRMA(1);

	private int index;

	private IndexIndentificadorArchivoEnum(int index) {
		this.index= index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
