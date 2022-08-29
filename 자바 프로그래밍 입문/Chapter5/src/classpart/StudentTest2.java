package classpart;

public class StudentTest2 {

	public static void main(String[] args) { // 이런 식으로 따로 main 빼서 실행할 수도 있다
		
		Student studentJu = new Student(); // 참조형 데이터 타입, 참조형 데이터 변수
		studentJu.studentName = "주찬민";
		studentJu.studentID = 100;
		studentJu.address = "성남시 수정구 태평동";
		
		Student studentNo = new Student(); // 참조형 데이터 타입, 참조형 데이터 변수
		studentNo.studentName = "노드재희에스";
		studentNo.studentID = 101;
		studentNo.address = "서울시 영등포구 여의도동";
		
		studentJu.showStudentInfor();
		studentNo.showStudentInfor();
		
		System.out.println(studentJu); //heap 메모리 주소를 가르킨다. 인스턴스별로 독립적인 메모리를 갖는다.
		System.out.println(studentNo); //classpart.Student 는 class의 full name
	}

}
