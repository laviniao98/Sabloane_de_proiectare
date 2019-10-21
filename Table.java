
package lab4SP;
public class Table implements Element{

	private String nameT;

	

	public Table() {

		

	}

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