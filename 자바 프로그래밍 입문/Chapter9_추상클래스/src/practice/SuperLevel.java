package practice;

public class SuperLevel extends PlayerLevel{
	
	public SuperLevel() {
		System.out.println("===== ����� �����Դϴ�.=====");
	}
	
	@Override
	public void move() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}

}
