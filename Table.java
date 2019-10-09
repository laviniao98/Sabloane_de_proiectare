

public class Table {
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

}

