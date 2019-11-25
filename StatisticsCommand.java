package lab4SP;
public class StatisticsCommand implements Command {

	  public void execute() {

	    BookStatistics statistici_carte = new BookStatistics();
	    DocumentManager.getInstance().getBook().accept(statistici_carte);
	    statistici_carte.printStatistics();



	  }

}
