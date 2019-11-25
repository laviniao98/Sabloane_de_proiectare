package lab4SP;
import java.util.ArrayList;

import java.util.List;



public class Book implements Element {

	private Author author;

	private String name;

	private List<Element> content = new ArrayList<Element>();

	//private List<Chapter> chapterList = new ArrayList<Chapter>() ; 

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



	public void addAuthor(Author author)

	{

		this.authorList.add(author);

	}
	 public void addContent(Element element) {

		    this.content.add(element);

		  }


	  public void print() {
		  
		for (Author i : authorList) {
			i.print();
		
		}
		
	    for (Element element : content) {

	      element.print();

	    }
		
	  }
	  

	  public void accept(Visitor visitor) {

	    for (Element element : content) {
	      element.accept(visitor);
	    }

	    visitor.visit(this);

	  }

	public void add(Element element) {
		// TODO Auto-generated method stub
		this.content.add(element);
		
	}
	  


	



}