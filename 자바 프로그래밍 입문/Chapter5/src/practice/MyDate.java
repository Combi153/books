package practice;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public MyDate() {}
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day <0 || day >31) {
						isValid = false;
				}
				else {
						this.day = day;
				}
			case 4: case 6: case 9: case 11:
				if (day <0 || day >30) {
						isValid = false;
				}
				else {
						this.day = day;
				}
			case 2:
				if (day <0 || day >29) { //������ ���� ������� ����.
						isValid = false;
				}
				else {
						this.day = day;
				}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month >12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		
		this.year = year;
	}
	public String isValid() {
		System.out.println(isValid);
		if (isValid) {
				return "��ȿ�� ��¥�Դϴ�.";
		}
		else {
				return "��ȿ���� ���� ��¥�Դϴ�.";
		}
	}
}
