package staticex;

public class Student {
	
	private static int serialNum = 10000; //private�� �����ϸ� �ν��Ͻ����� ��� ���Ѵ�. �� ���� ���ϵ���
	int studentID;
	String studentName;
	
	Student(String studentName){
		this.studentID = serialNum;
		serialNum++;
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		/*
		�������� ��� ����
		int i = 10;
		i++;
		
		�ν��Ͻ� ���� ��� �Ұ���
		studentName = "ȫ�浿";
		why : �ν��Ͻ��� ������ ���Ŀ� �ٷ�� �����̱� ����
		
		static ������ �ν��Ͻ��� �������� �ʾƵ� ����� �� �ִ�.
		 */
		return serialNum; // static ����
	}
}
