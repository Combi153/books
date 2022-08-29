package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 생성자없이 썼다. 자바 컴파일러가 클래스에 생성자 없으면 default로 넣어준다.
	// default : public Student() {} 생성자에 매개변수가 없다. 
	// 생성자의 용도 : 처음 객체를 생성하면서 처음에 하는 일.
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address); 
	}
	
	public String getStudentName() { // 사용하는 입장에서 메서드 이름 짓는다. 
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	public static void main(String[] args) { // JDK가 실행함
		
		int i = 10; // 기본 데이터 타입 (int 등)

		Student studentJu = new Student(100, "주찬민"); // 참조형 데이터 타입, 참조형 데이터 변수
		studentJu.address = "성남시 수정구 태평동";
		
		Student studentNo = new Student(); // 참조형 데이터 타입, 참조형 데이터 변수
		studentNo.studentName = "노드재희에스";
		studentNo.studentID = 101;
		studentNo.address = "서울시 영등포구 여의도동";
		
		studentJu.showStudentInfor();
		studentNo.showStudentInfor();
		
		
	}
}
