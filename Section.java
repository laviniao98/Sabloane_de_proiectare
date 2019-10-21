package lab4SP;

import java.util.ArrayList;

import java.util.List;

public class Section implements Element {

	  private String title;

	  private List<Element> content = new ArrayList<Element>();


	  public String getName() {

	    return title;

	  }

	  public void setName(String name) {

	    this.title = name;

	  }



	  public Section(String name) {

	    this.title = name;

	  }


	  public void add(Element element) {

	    this.content.add(element);

	  }


	  public void remove(Element element) {

	    this.content.remove(element);

	  }


	  public Element getElement(int index) {

	    return this.content.get(index);

	  }


	  public void print() {
		  System.out.println(title);

	    for (Element element : content) {

	      element.print();
	      

	    }

	  }



	}