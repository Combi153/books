package practice;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===== ���������ϴ� �ڵ��� =====");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("===== ����� �����ϴ� �ڵ��� =====");
		Car yourcar = new ManualCar();
		yourcar.run();
	}

}
