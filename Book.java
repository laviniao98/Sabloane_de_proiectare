package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	
	private List<Chapter> chapterList = new ArrayList<Chapter>() ; 
	private List<Author> chapterList = new ArrayList<Chapter>() ; 
	
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
	
	public int addAuthor(String nameA) {
		Author a= new Author(nameA);
		
	}
}
