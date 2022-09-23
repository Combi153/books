package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		// �տ� � statement�� �� �� ����. �������� ���� �޸𸮿� ���� �޸��ϴ� ��찡 �� ���� �� �ִ�.
		this("�̸�����",1); //�����ڰ� ���� ���� ���, type�� �°� ���� ��.
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person returnSelf() { // Person���� �ڷ��� ����
		return this; //this�� ��ȯ�ϴ� �Լ��� �����
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
		
	}

}
