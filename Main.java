package lab4SP;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

//import com.sun.xml.internal.txw2.Document;

public class Main {



	public String Author;
	public String Book;
	public String Chapter;
	public String SubChapter;
	public String Paragraph;
	public String Image;

	public String Table;

	public Main(String A, String B, String C, String SC, String P, String I, String T)



	{



		this.Author = A;



		this.Book = B;



		this.Chapter = C;



		this.SubChapter = SC;



		this.Image = I;



		this.Table = T;



	}





		// TODO Auto-generated method stub
/*
	Book book =new Book("aaa")	;

	Author bbb= new Author("bbb");

	 book.addAuthor(bbb);

	int indexOfChapter = book.createChapter("ChapterOne");

	Chapter chpOne =book.getChapter(indexOfChapter);

	int indexOfSubChapter =chpOne.createsubchapterList("Chapter One one");

	SubChapter chpOneOne =chpOne.getSubChapter(indexOfSubChapter);

	int indexOfParagraph= chpOneOne.createparagraphList("pr");

	int indexOfImage= chpOneOne.createimageList("im");

	int indexOfParagraph2= chpOneOne.createparagraphList("pr2");

	int indexOfTable= chpOneOne.createtableList("tb");

	int indexOfParagraph3= chpOneOne.createparagraphList("pr3");

	int indexOfImage2= chpOneOne.createimageList("im2");
*/
/*
	    Book noapteBuna = new Book("Noapte buna copii.!");
	    Author Gh = new Author("Radu Gheo");
	    noapteBuna.addAuthor(Gh);
	    Section cap1 = new Section("Capitolul 1.");
	    cap1.add(new Paragraph("Text 1"));
	    cap1.add(new Paragraph("Text 2"));
	    cap1.add(new Image("Image 1"));
	    noapteBuna.addContent(cap1);
	    noapteBuna.addContent(new Paragraph("Multumesc"));
	    
	    noapteBuna.print();
*/
/*
		public static void main(String[] args) throws Exception {
			long startTime = System.currentTimeMillis();
			ImageProxy img1 = new ImageProxy("Pamela Anderson");
			ImageProxy img2 = new ImageProxy("Kim Kardashian");
			ImageProxy img3 = new ImageProxy("Kirby Griffin");
			Section playboyS1 = new Section("Front Cover");
			playboyS1.add(img1);
			Section playboyS2 = new Section("Summer Girls");
			playboyS2.add(img2);
			playboyS2.add(img3);
			Book playboy = new Book("Playboy");
			playboy.addContent(playboyS1);
			playboy.addContent(playboyS2);
			long endTime = System.currentTimeMillis();
			System.out.println("Creation of the content took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing of the section 1 took " + (endTime -
			startTime) + " milliseconds");
			startTime = System.currentTimeMillis();
			playboyS1.print();
			endTime = System.currentTimeMillis();
			System.out.println("Printing again the section 1 took " + (endTime -
			startTime) + " milliseconds");
			}

	//book.print();
	*/
	
	/*
	public static void main(String[] args) throws Exception {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");

		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new CenterStrategy());
		p2.setAlignStrategy(new RightStrategy());
		p3.setAlignStrategy(new LeftStrategy());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		}
	*/
	/*
	public static void main(String[] args) throws Exception {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		Paragraph p5 = new Paragraph("Paragraph 5");
		cap1.add(p5);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		//Finacial stats = new BookStatistics();
		//stats.print_price();
		}
	*/
	public static void main(String[] args) throws Exception {
		
		/*
		Builder jsonBuilder = new JSONBuilder("D:\\Java\\lab4SP\\book.json");
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		myBook.print();
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		Paragraph p5 = new Paragraph("Paragraph 5");
		cap1.add(p5);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
	*/	
		//Command cmd1 = new OpenCommand();
		//cmd1.execute();
		//Command cmd2 = new StatisticsCommand();
		//cmd2.execute();
		//DocumentManager.getBook().print();
		
	/*	
		try {
			FileOutputStream fos = new FileOutputStream(new File("./bookXML.xml"));
			XMLEncoder encoder = new XMLEncoder(fos);
			encoder.writeObject(cap1);
			encoder.writeObject(p1);
			encoder.writeObject(p2);
			encoder.writeObject(p3);
			encoder.writeObject(p4);
			encoder.close();
			fos.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	*/	
		
		
		

			Section cap1 = new Section("Capitolul 1");
			Paragraph p1 = new Paragraph("Paragraph 1");
			cap1.add(p1);
			Paragraph p2 = new Paragraph("Paragraph 2");
			cap1.add(p2);
			Paragraph p3 = new Paragraph("Paragraph 3");
			cap1.add(p3);
			Paragraph p4 = new Paragraph("Paragraph 4");
			cap1.add(p4);
			cap1.add(new ImageProxy("ImageOne"));
			cap1.add(new Image("ImageTwo"));
			cap1.add(new Paragraph("Some text"));
			cap1.add(new Table("Table 1"));
			//FirstObserver firstObserver = new FirstObserver();
			//SecondObserver secondObserver = new SecondObserver();
			//cap1.addObserver(firstObserver);
			//cap1.addObserver(secondObserver);
			//p1.addObserver(firstObserver);
			//p1.addObserver(secondObserver);
			//p2.addObserver(firstObserver);
			cap1.setNewValue("CHAPTER 1");
			p1.setNewValue("PARAGRAPH 2");
			p2.setNewValue("PARAGRAPH 3");
			//cap1.removeObserver(firstObserver);
			cap1.setNewValue("CHAPTER 1.1");
			

	}
}



