package practice;

public class Person {
	
	String name;
	int age;
	boolean ismarried;
	int numOfChildren;
	
	public Person() {}
	
	public Person(String pname, int page, boolean married, int numOfChild) {
		name = pname;
		age = page;
		ismarried = married;
		numOfChild = numOfChildren;
	}
	
	public void getPersonInfo() {
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("��ȥ���� : "+ ismarried);
		System.out.println("�ڽ� �� : "+ numOfChildren);
	}
}
