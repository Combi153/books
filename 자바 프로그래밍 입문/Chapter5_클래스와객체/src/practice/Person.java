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
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("결혼여부 : "+ ismarried);
		System.out.println("자식 수 : "+ numOfChildren);
	}
}
