package lab4SP;

public class OpenCommand implements Command {


	  public void execute() {
	    JSONBuilder jsonBuilder = new JSONBuilder("D:\\\\Java\\\\lab4SP\\\\book.json");
	    jsonBuilder.build();
	    Book book = new Book("book.json");
	    book.add(jsonBuilder.getResult());
	    DocumentManager.getInstance().setBook(book);
	    book.print();

	  }

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
