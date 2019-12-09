
package lab4SP;

import java.util.ArrayList;

public class Table implements Element{

	private String nameT;
    private String _oldValue;
    private ArrayList<Observer> obsList = new ArrayList<Observer>();
	

	

	public Table(String nameT) {
        this.nameT = nameT;
        obsList.add(DocumentManager.getInstance().getFirstObserver());

		

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

	public void print() 

	{
	    System.out.println("Table: " + nameT);

	}
	

	  public void accept(Visitor visitor) {

	    visitor.visit(this);

	  }
	  
	    public void setNewValue (String newValue) {
	    	this._oldValue = this.nameT;
	    	this.nameT = newValue;
	    	this.notifyObservers();
	    }
	    public void addObserver(Observer ob) {
	    	this.obsList.add(ob);
	    }
	    
	    public void removeObserver(Observer ob) {
	    	int indexObs = this.obsList.indexOf(ob);
	    	this.obsList.remove(indexObs);
	    }
	    public void notifyObservers() {
	    	for(Observer obs : obsList) {
	    		obs.update(this._oldValue,this.nameT);
	    	}
	    }
	    
		public Table copy()

		{
			return new Table(this.nameT);
		}




}