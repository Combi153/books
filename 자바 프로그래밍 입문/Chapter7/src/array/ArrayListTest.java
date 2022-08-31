package array;

import java.util.ArrayList; // ctrl shift O

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("HarryPoter", "J.K.Rowling"));
		
		for(int i = 0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
