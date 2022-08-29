package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// �����ھ��� ���. �ڹ� �����Ϸ��� Ŭ������ ������ ������ default�� �־��ش�.
	// default : public Student() {} �����ڿ� �Ű������� ����. 
	// �������� �뵵 : ó�� ��ü�� �����ϸ鼭 ó���� �ϴ� ��.
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address); 
	}
	
	public String getStudentName() { // ����ϴ� ���忡�� �޼��� �̸� ���´�. 
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	public static void main(String[] args) { // JDK�� ������
		
		int i = 10; // �⺻ ������ Ÿ�� (int ��)

		Student studentJu = new Student(100, "������"); // ������ ������ Ÿ��, ������ ������ ����
		studentJu.address = "������ ������ ����";
		
		Student studentNo = new Student(); // ������ ������ Ÿ��, ������ ������ ����
		studentNo.studentName = "������񿡽�";
		studentNo.studentID = 101;
		studentNo.address = "����� �������� ���ǵ���";
		
		studentJu.showStudentInfor();
		studentNo.showStudentInfor();
		
		
	}
}
