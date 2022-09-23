package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		// 앞에 어떤 statement가 올 수 없다. 생성되지 않은 메모리에 값을 메모리하는 경우가 돼 버릴 수 있다.
		this("이름없음",1); //생성자가 여러 개인 경우, type에 맞게 맵핑 됨.
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person returnSelf() { // Person으로 자료형 쓰기
		return this; //this를 반환하는 함수를 만들기
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
		
	}

}
