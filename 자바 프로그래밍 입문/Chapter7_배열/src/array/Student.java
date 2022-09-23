package array;

public class Student {

	private static int serialNum = 10000;
	
	private String studentName;
	private int studentID;
	
	Student(String studentName){
		this.studentName = studentName;
		this.studentID = serialNum;
		serialNum++;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + studentID);
	}
	

}
