package lab4SP;

import java.util.concurrent.TimeUnit;

public class Image implements Element {

	private String nameI;

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
		

	}

	public Image() {

		

	}

	public void print() 

	{

	    System.out.println("Image: " + nameI);

	}



}

