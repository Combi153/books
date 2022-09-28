package practice;

public class AdvancedLevel extends PlayerLevel{

	public AdvancedLevel() {
		System.out.println("===== 중급자 레벨입니다.=====");
	}
	@Override
	public void move() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn 할 줄 모르지롱.");
	}
}
