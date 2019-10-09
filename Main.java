

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
	Book aaa =new Book("aaa")	;
	Author bbb= new Author("bbb");
	 aaa.addAuthor(bbb);
	int indexOfChapter = aaa.createChapter("ChapterOne");
	Chapter chpOne =aaa.getChapter(indexOfChapter);
	int indexOfSubChapter =chpOne.createsubchapterList("Chapter One one");
	SubChapter chpOneOne =chpOne.getSubChapter(indexOfSubChapter);
	int indexOfParagraph= chpOneOne.createparagraphList("pr");
	int indexOfImage= chpOneOne.createimageList("im");
	int indexOfTable= chpOneOne.createtableList("tb");
	
	bbb.print();
	System.out.print(aaa);
	
	}

	private static void print() {
		// TODO Auto-generated method stub
		
	}

}

