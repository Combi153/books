package test;

import classpart.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJu = new Student();
		studentJu.studentName = "주찬민";
		studentJu.address = "성남시 수정구 태평동";
		
		studentJu.showStudentInfor();
		
	}

}
