package array;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student("������"));
		student.add(new Student("������"));
		student.add(new Student("��ö��"));
		
		for (Student name : student) {
			name.showStudentInfo();
		}
	}
}
