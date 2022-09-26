package generics;

public class Powder extends Material{

	@Override
	public String toString() {
		return "재료는 Powder";
	}

	@Override
	public void doPrinting() {
		
		System.out.println("Plastic으로 프린팅");
	}
}
