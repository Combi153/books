package array;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student("ÁÖÂù¹Î"));
		student.add(new Student("±èÁö¹Î"));
		student.add(new Student("Á¤Ã¶¼ö"));
		
		for (Student name : student) {
			name.showStudentInfo();
		}
	}
}
