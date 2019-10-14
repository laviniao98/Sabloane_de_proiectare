

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String nameC;
	

	
	public Chapter() {
		
	}
	
	private List<SubChapter> subchapterList = new ArrayList<SubChapter>() ; 

	@Override
	public String toString() {
		return "Chapter [nameC=" + nameC + "]";
	}

	public String getNameC() {
		return nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public Chapter(String nameC) {
		super();
		this.nameC = nameC;
	}
	public int createsubchapterList(String nameSC) {
		SubChapter chp1 = new SubChapter(nameSC);
		subchapterList.add(chp1);
		return subchapterList.indexOf(chp1);
	}
	


	public int createSubChapter(String subChapterName) 
	{
		SubChapter schp = new SubChapter(subChapterName);
		subchapterList.add(schp);
		return subchapterList.indexOf(schp);
	}

	

	public SubChapter getSubChapter(int index)
	{
		return subchapterList.get(index);
	}
	

	public void print() 
	{

	 System.out.println("Chapter: " + nameC);

	 for (SubChapter subChapter : subchapterList) {

	     subChapter.print();

	    }

	  }
	


}

