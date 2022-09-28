package practice;

public class SuperLevel extends PlayerLevel{
	
	public SuperLevel() {
		System.out.println("===== 고급자 레벨입니다.=====");
	}
	
	@Override
	public void move() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

}
