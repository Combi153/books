package interfaceex.bookshelf;

import java.util.ArrayList;

public class Shelf {

	ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public int getCount() {
		return shelf.size();
	}
}
