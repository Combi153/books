package practice;

public class AdvancedLevel extends PlayerLevel{

	public AdvancedLevel() {
		System.out.println("===== �߱��� �����Դϴ�.=====");
	}
	@Override
	public void move() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("Turn �� �� ������.");
	}
}
