package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("I can't jump");
	}

	@Override
	public void turn() {
		System.out.println("I can't turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******** Beginner *********");
	}
	
}
