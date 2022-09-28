package practice;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("AI가 운전을 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("AI가 방향 전환을 합니다.");
	}

	@Override
	public void park() {
		System.out.println("AI가 주차를 합니다.");
	}

}