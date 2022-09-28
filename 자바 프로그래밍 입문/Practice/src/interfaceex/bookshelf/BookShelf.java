package interfaceex.bookshelf;

public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void enQueue(String bookName) {
		shelf.add(bookName);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
}
