package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJu = new Student();
		studentJu.studentName = "������";
		studentJu.address = "������ ������ ����";
		
		studentJu.showStudentInfor();
		
		String name = studentJu.getStudentName();
		System.out.println(name);
		
		studentJu.setStudentName("������");
		name = studentJu.getStudentName();
		System.out.println(name);
	}

}
