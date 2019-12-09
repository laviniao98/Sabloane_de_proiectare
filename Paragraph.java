package lab4SP;

import java.util.ArrayList;

public class Paragraph implements Element {

	private String nameP;
	private AlignStrategy align;
	
    private String _oldValue;
    private ArrayList<Observer> obsList = new ArrayList<Observer>();



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
        obsList.add(DocumentManager.getInstance().getFirstObserver());

	}


	  public void accept(Visitor visitor) {
	    visitor.visit(this);
	  }
	  
	  
	    public void setNewValue(String newValue) {
	    	this._oldValue = nameP;
	    	this.nameP = newValue;
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
	    	for(Observer obs : this.obsList) {
	    		obs.update(this._oldValue,this.nameP);
	    	}
	    }
	    

		public Paragraph copy()

		{

			return new Paragraph(this.nameP);

		}
}

