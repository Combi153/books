package practice;

public abstract class PlayerLevel {

	public abstract void move();
	public abstract void jump();
	public abstract void turn();
	
	final public void go(int num) {
		move();
		
		for (int i = 0; i < num; i++) {
			jump();
		}
		
		turn();
	}
}
