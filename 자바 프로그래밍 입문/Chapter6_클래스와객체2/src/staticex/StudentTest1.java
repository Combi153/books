package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		//System.out.println(Student.serialNum); // Ŭ���� �̸����� ���� //private�� �����ϸ� �� ����.
		System.out.println(Student.getSerialNum()); //���� get �Լ��� �������.
		
		Student studentJu = new Student("������");
		Student studentHa = new Student("������");
		
		System.out.println(studentJu.studentID);
		System.out.println(studentHa.studentID);
	}

}
