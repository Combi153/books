package arrayex;

public class StudentEx {

	public static void main(String[] args) {
		
		Student studentJu = new Student("������");
		studentJu.addSubject("math", 100);
		studentJu.addSubject("CS", 80);
		studentJu.addSubject("python", 100);
		
		Student studentLee = new Student("�̰�");
		studentLee.addSubject("math", 80);
		studentLee.addSubject("CS", 37);
		studentLee.addSubject("python", 56);
		
		studentJu.showStudentInfo();
		System.out.println("===============");
		studentLee.showStudentInfo();
	}

}
