package arrayex;

import java.util.ArrayList;

public class Student {

	private static int serialNum = 10000;
	private String studentName;
	private int studentID;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.studentID = serialNum;
		subjectList = new ArrayList<Subject>();
		
		serialNum++;		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		System.out.println(subject.getName());
		System.out.println(subject.getScorePoint());
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println(studentName + s.getName() + s.getScorePoint());
		}
	System.out.println("total :" + total);
	}
}
