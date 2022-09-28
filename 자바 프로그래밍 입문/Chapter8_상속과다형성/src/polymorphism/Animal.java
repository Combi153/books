package polymorphism;

public class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}

	public void reading() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void scout() {
		System.out.println("�������� �ֺ��� ���̴ϴ�.");
	}
}