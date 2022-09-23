package staticex;

public class Student {
	
	private static int serialNum = 10000; //private로 선언하면 인스턴스에서 사용 못한다. 값 변경 못하도록
	int studentID;
	String studentName;
	
	Student(String studentName){
		this.studentID = serialNum;
		serialNum++;
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		/*
		지역변수 사용 가능
		int i = 10;
		i++;
		
		인스턴스 변수 사용 불가능
		studentName = "홍길동";
		why : 인스턴스가 생성된 이후에 다루는 변수이기 때문
		
		static 변수는 인스턴스가 생성되지 않아도 사용할 수 있다.
		 */
		return serialNum; // static 변수
	}
}
