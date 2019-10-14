

public class Paragraph extends Element {
	private String nameP;
	
	public Paragraph() {
		
	}

	@Override
	public String toString() {
		return "Paragraph [nameP=" + nameP + "]";
	}

	public String getNameP() {
		return nameP;
	}

	public void setNameP(String nameP) {
		this.nameP = nameP;
	}

	public Paragraph(String nameP) {
		super();
		this.nameP = nameP;
	}
	public void print() {
		    System.out.println("Paragraph: " + nameP);
		  }

}

