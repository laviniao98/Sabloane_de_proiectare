package lab4SP;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Observable {

	private String nameI;
	private int priceImage;
    private String _imageName;
    private String _oldValue;
    ArrayList<Observer> obsList = new ArrayList<Observer>();

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


		this.nameI = nameI;
		String imageName= nameI;
		try {
			TimeUnit.SECONDS.sleep(5);	
		}
		catch(InterruptedException e){
			e.printStackTrace();	
		}
        this.obsList.add(DocumentManager.getInstance().getFirstObserver());
		

	}

	public Image() {	

	}

	public void print() 
	{
	    System.out.println("Image: " + nameI);
	}
	
	public void accept(Visitor visitor) {

		 visitor.visit(this);

	}
	
    public void setNewValue(String newValue){
    	this._oldValue = _imageName;
    	this._imageName = newValue;
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
    	for(Observer ob : obsList) {
    		ob.update(this._oldValue, this._imageName);
    	}
    	
    }

}

