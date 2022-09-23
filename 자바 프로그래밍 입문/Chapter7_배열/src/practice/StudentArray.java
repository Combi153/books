package practice;

import java.util.Arrays;

public class StudentArray {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		
		students[0] = new Student();
		students[0].setName("James");
		students[0].setStudentID(1001);
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");
		
		System.out.println(Arrays.toString(students)); 
		
		for(int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		//이러니까 메모리 작동 방식을 알아야겠다.
		//2차원 배열이라고 생각하면 안 되는 것이다!
	}

}
