package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		int fee = 1000;
		bus.take(fee);
		this.money -= fee;
	}
	
	public void takeSubway(Subway subway) {
		int fee = 1500;
		subway.take(fee);
		this.money -= fee;
	}
	
	public void takeTaxi(Taxi taxi) {
		int fee = 10000;
		taxi.take(fee);
		this.money -= fee;
	}
	
	public void showInfo() {
		System.out.println(studentName + "학생의 남은 돈은 " + money + "입니다.");
	}
}
