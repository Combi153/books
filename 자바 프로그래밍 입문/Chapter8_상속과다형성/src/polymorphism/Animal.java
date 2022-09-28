package polymorphism;

public class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void reading() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void scout() {
		System.out.println("독수리가 주변을 살핍니다.");
	}
}