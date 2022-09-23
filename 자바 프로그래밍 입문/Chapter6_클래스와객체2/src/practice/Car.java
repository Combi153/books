package practice;

public class Car {
	
	private static int serialNumber = 10000;
	int carNumber;
	
	public Car() {
		serialNumber++;
		carNumber = serialNumber;
	}
	
	public int getCarNum() {
		return carNumber;
	}
}
