package classpart;

public class StudentTest2 {

	public static void main(String[] args) { // �̷� ������ ���� main ���� ������ ���� �ִ�
		
		Student studentJu = new Student(); // ������ ������ Ÿ��, ������ ������ ����
		studentJu.studentName = "������";
		studentJu.studentID = 100;
		studentJu.address = "������ ������ ����";
		
		Student studentNo = new Student(); // ������ ������ Ÿ��, ������ ������ ����
		studentNo.studentName = "������񿡽�";
		studentNo.studentID = 101;
		studentNo.address = "����� �������� ���ǵ���";
		
		studentJu.showStudentInfor();
		studentNo.showStudentInfor();
		
		System.out.println(studentJu); //heap �޸� �ּҸ� ����Ų��. �ν��Ͻ����� �������� �޸𸮸� ���´�.
		System.out.println(studentNo); //classpart.Student �� class�� full name
	}

}
