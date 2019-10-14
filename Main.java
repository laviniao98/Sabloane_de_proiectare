

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
	book.print();
	
	
	}


}

