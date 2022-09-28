package practice;

public abstract class Car {
	
	public void start() {
		System.out.println("시동을 켭니다.");
	}
	
	public void end() {
		System.out.println("시동을 끕니다.");
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
