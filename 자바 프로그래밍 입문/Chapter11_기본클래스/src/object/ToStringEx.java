package object;

class Book {
	String title;
	String author;
	
	Book (String title, String author){
		this.title = title;
		this.author = author;
	}
	
	@Override //
	public String toString() {
		return title + ", " + author;
	
	}
}



public class ToStringEx {

	public static void main(String[] args) {
		
		Book book = new Book("두잇자바" ,"은종님");
		//System.out.println(book);
		
		 //toStirng 메서드 이미 있다.
		//System.out.println(str);
		
		Book book1 = new Book("자바의 정석" ,"남궁성");
		System.out.println(book1);
	
	}

}
