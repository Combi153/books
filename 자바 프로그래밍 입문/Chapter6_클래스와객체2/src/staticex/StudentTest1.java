package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		//System.out.println(Student.serialNum); // 클래스 이름으로 참조 //private로 선언하면 못 쓴다.
		System.out.println(Student.getSerialNum()); //따로 get 함수를 사용하자.
		
		Student studentJu = new Student("주찬민");
		Student studentHa = new Student("하지훈");
		
		System.out.println(studentJu.studentID);
		System.out.println(studentHa.studentID);
	}

}
