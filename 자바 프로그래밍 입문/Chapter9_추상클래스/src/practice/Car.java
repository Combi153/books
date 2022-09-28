package practice;

public abstract class Car {
	
	public void start() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void end() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public abstract void drive();
	public abstract void turn();
	public abstract void park();
	
	final public void run() {
		start();
		drive();
		turn();
		park();
		end();
	}
}
