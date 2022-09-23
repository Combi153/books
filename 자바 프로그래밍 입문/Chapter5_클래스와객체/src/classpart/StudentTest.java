package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJu = new Student();
		studentJu.studentName = "주찬민";
		studentJu.address = "성남시 수정구 태평동";
		
		studentJu.showStudentInfor();
		
		String name = studentJu.getStudentName();
		System.out.println(name);
		
		studentJu.setStudentName("주찬희");
		name = studentJu.getStudentName();
		System.out.println(name);
	}

}
