package generics;

public class Plastic extends Material{

	@Override
	public String toString() {
		return "재료는 Plastic";
	}

	@Override
	public void doPrinting() {
		
		System.out.println("Plastic으로 프린팅");
	}

	
}
