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
		//�̷��ϱ� �޸� �۵� ����� �˾ƾ߰ڴ�.
		//2���� �迭�̶�� �����ϸ� �� �Ǵ� ���̴�!
	}

}
