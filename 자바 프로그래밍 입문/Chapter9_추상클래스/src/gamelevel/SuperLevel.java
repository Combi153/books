package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("Super Run");
	}

	@Override
	public void jump() {
		System.out.println("Super Jump");	
	}

	@Override
	public void turn() {
		System.out.println("Super Turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******** Super Player *********");
		
	}

}
