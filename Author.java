

public class Author {
	private String nameA;
	public  Author() {
		
	}
	public  Author(String nameA) {
		this.nameA=nameA;
		
	}
	@Override
	public String toString() {
		return "Author [nameA=" + nameA + "]";
	}
	public String getNameA() {
		return nameA;
	}
	public void setNameA(String nameA) {
		this.nameA = nameA;
	}

	public void print() 
	{
	    System.out.println("Author: " + nameA);

	 }
	

}

