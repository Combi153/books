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
		
		Book book = new Book("�����ڹ�" ,"������");
		//System.out.println(book);
		
		 //toStirng �޼��� �̹� �ִ�.
		//System.out.println(str);
		
		Book book1 = new Book("�ڹ��� ����" ,"���ü�");
		System.out.println(book1);
	
	}

}
