package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String nameSB;
	public SubChapter() {
		
	}
	
	private List<Paragraph> paragraphList = new ArrayList<Paragraph>() ; 
	private List<Image> imageList = new ArrayList<Image>() ; 
	private List<Table> tableList = new ArrayList<Table>() ; 
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
		paragraphList.add(pr);
		return paragraphList.indexOf(pr);
	}
	public int createimageList(String nameI) {
		Image im = new Image(nameI);
		imageList.add(im);
		return imageList.indexOf(im);
	}
	public int createtableLis(String nameT) {
		Table tb = new Table(nameT);
		tableList.add(tb);
		return tableList.indexOf(tb);
	}
	
	
	
	


}
