
import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String nameSB;
	public SubChapter() {
		
	}
	
	private List<Element> elements = new ArrayList<Element>() ; 

	@Override
	public String toString() {
		return "SubChapter [nameSB=" + nameSB + "]";
	}
	public String getNameSB() {
		return nameSB;
	}
	public void setNameSB(String nameSB) {
		this.nameSB = nameSB;
	}
	public SubChapter(String nameSB) {
		super();
		this.nameSB = nameSB;
	}
	
	public int createparagraphList(String nameP) {
		Paragraph pr = new Paragraph(nameP);
		elements.add(pr);
		return elements.indexOf(pr);
	}
	public int createimageList(String nameI) {
		Image im = new Image(nameI);
		elements.add(im);
		return elements.indexOf(im);
	}
	public int createtableList(String nameT) {
		Table tb = new Table(nameT);
		elements.add(tb);
		return elements.indexOf(tb);
	}
	
	public void print() {
		    System.out.println("Subchapter: " + nameSB);
		    for (Element e : elements) {
		      e.print();
		    }
	}
	
}

