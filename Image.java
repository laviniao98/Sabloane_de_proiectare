package lab1;

public class Image {
	private String nameI;
	@Override
	public String toString() {
		return "Image [nameI=" + nameI + "]";
	}
	public String getNameI() {
		return nameI;
	}
	public void setNameI(String nameI) {
		this.nameI = nameI;
	}
	public Image(String nameI) {
		super();
		this.nameI = nameI;
	}
	public Image() {
		
	}

}
