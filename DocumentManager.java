package lab4SP;
import java.awt.print.Book;

public class DocumentManager {
	
	  private static DocumentManager instance= null;
	  private static lab4SP.Book book = null;
	  
	  private FirstObserver firstObserver = new FirstObserver();
	  private SecondObserver secondObserver = new SecondObserver();
	  private DocumentManager() {
	  }

	  public static DocumentManager getInstance() {
	    if (instance == null) {
	      instance = new DocumentManager();
	    }
	    return instance;
	  }

	  public void setBook(lab4SP.Book book) {
	    this.book = book;
	  }

	  public static lab4SP.Book getBook() {
	    return book;
	  }
	  
	  public FirstObserver getFirstObserver() {
			return this.firstObserver;
		}

	public SecondObserver getSecondObserver() {
			return this.secondObserver;
		}

	}
