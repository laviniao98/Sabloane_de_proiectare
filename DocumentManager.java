package lab4SP;
import java.awt.print.Book;
import java.util.Stack;

public class DocumentManager {
	
	  private static DocumentManager instance= null;
	  private static lab4SP.Book book = null;
	  
	  private Section Section;
	  
	  private FirstObserver firstObserver = new FirstObserver();
	  private SecondObserver secondObserver = new SecondObserver();
	  private Stack<Command> history = new Stack<Command>();
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
	  public void setSection(Section Section)
		{
			this.Section = Section;
		}
	  public Section getSection()
		{
			return this.Section;
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
	
	
	public Command getHistory() {
		Command c = this.history.peek();
		this.history.pop();
		return c;
	}

	public void setHistory(Command history) {
		this.history.push(history);

	}

	}
