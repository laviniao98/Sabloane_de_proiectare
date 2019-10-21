package lab4SP;

public class Paragraph implements Element {

	private String nameP;

	public Paragraph() {

	
	}

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

