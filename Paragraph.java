package lab4SP;

public class Paragraph implements Element {

	private String nameP;
	private AlignStrategy align;



	public AlignStrategy getAlignStrategy() {
	    return align;
	  }

	public void setAlignStrategy(AlignStrategy alignStrategy) {
	    this.align = alignStrategy;
	  }
	public void print() {

		if (align != null) {

			align.print(nameP);

		} else {

			System.out.println(nameP);

		}

	}
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


	  public void accept(Visitor visitor) {

	    visitor.visit(this);

	  }
}

