package inheritance;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		//Animal a = new Human(); 이것과 같다.
	}

	public void moveAnimal(Animal animal){
		
		animal.move(); //이것이 다형성이다. 한 줄의 코드로 다양한 기능 구현?
	}
}
