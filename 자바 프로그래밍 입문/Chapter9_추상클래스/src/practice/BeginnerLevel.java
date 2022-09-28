package practice;

public class BeginnerLevel extends PlayerLevel{
	
	public BeginnerLevel() {
		System.out.println("===== 초급자 레벨입니다.=====");
	}
	
	@Override
	public void move() {
		System.out.println("천천히 걷습니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump 할 줄 모르지롱.");
	}

	@Override
	public void turn() {
		System.out.println("Turn 할 줄 모르지롱.");
	}

}
