package thisex;

class BirthDay{
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		// year = year; 는 안 된다.
		// year = y; 는 가능
		// this.year = year; 이런 꼴을 가장 많이 쓴다.
	}
	public void printThis() {
		System.out.println(this); // 가르치는 주소는 인스턴스마다 다르다.
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1);
		b1.printThis(); //인스턴스 마다 주소값이 같다.
		System.out.println(b2);
		b2.printThis();
	}

}
