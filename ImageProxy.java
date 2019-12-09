package lab4SP;

public class ImageProxy implements Element {
	private String name;
	private int priceImageProxy;
	Image image = null;
	public ImageProxy(String name) {
		this.name= name;
		
	}
	public void print() {
		if(this.image == null) {
		this.image= new Image(this.name);
		}
		this.image.print();
	}
	

	public void accept(Visitor visitor) {

	    visitor.visit(this);

	  }
	

	public Element copy() {

		// TODO Auto-generated method stub

		return null;

	}
	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		
	}

}
