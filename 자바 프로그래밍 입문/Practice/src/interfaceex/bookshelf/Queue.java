package interfaceex.bookshelf;

public interface Queue {
	
	void enQueue(String bookName);
	String deQueue();
	int getSize();
}
