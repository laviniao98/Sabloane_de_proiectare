

import java.util.ArrayList;
import java.util.List;

public class Book {
	private Author author;
	private String name;
	
	private List<Chapter> chapterList = new ArrayList<Chapter>() ; 
	private List<Author> authorList = new ArrayList<Author>() ; 
	
	public Book() {
		
	}
	public Book(String name) {
		this.name=name;	
	}
	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int createChapter(String nameC) {
		Chapter chp = new Chapter(nameC);
		chapterList.add(chp);
		return chapterList.indexOf(chp);
	}
	public void addAuthor(Author author)
	{
		authorList.add(author);
	}


	public Chapter getChapter(int index)
	{
		return chapterList.get(index);
	}
	

	 public void print() 
	 {

	   System.out.println("Book: " + name);
	   for (Chapter c : chapterList) {
	      c.print();
	   }

	  }
	

}
