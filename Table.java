

public class Table extends Element{
	private String nameT;
	
	public Table() {
		
	}

	@Override
	public String toString() {
		return "Table [nameT=" + nameT + "]";
	}

	public String getNameT() {
		return nameT;
	}

	public void setNameT(String nameT) {
		this.nameT = nameT;
	}

	public Table(String nameT) {
		super();
		this.nameT = nameT;
	}
	
	public void print() 
	{
	    System.out.println("Table: " + nameT);
	}

}

