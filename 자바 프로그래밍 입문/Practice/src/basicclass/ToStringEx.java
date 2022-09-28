package basicclass;

import java.util.Arrays;

class Book{
	
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "Ä®ÀÇ³ë·¡");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String("¹¹ ÀÓ¸¶");
		Integer i1 = new Integer(123);
		System.out.println(str);
		System.out.println(i1);
		//Arrays.toString(null)
	}

}
