package practice;

public class BeginnerLevel extends PlayerLevel{
	
	public BeginnerLevel() {
		System.out.println("===== �ʱ��� �����Դϴ�.=====");
	}
	
	@Override
	public void move() {
		System.out.println("õõ�� �Ƚ��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump �� �� ������.");
	}

	@Override
	public void turn() {
		System.out.println("Turn �� �� ������.");
	}

}
