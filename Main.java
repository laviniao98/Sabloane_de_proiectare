package lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Book aaa =new Book("aaa")	;
	Author bbb= new Author("bbb");
	 aaa.addAuthor(bbb);
	int indexOfChapter = aaa.createChapter("ChapterOne");
	Chapter chpOne =aaa.getChapter(indexOfChapter);
	int indexOfSubChapter =chpOne.createsubchapterList("Chapter One one");
	SubChapter chpOneOne =chpOne.getSubChapter("indexOfSubChapter");
	int indexOfParagraph= chpOneOne.createparagraphList("pr");
	int indexOfImage= chpOneOne.createimageList("im");
	int indexOfTable= chpOneOne.createtableList("tb");
	
	
	
	
		
	

	}

}
