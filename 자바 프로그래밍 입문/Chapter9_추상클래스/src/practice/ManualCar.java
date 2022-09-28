package practice;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("사람이 코너를 돕니다.");
	}

	@Override
	public void park() {
		System.out.println("사람이 주차를 합니다.");
	}

}
