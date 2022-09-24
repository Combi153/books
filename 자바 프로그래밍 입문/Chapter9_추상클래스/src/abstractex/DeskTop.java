package abstractex;

public class DeskTop extends Computer{

	//구현의 책임이 있다.
	
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}

}
