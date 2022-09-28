package basicclass;

class MyDate{
	
	private int month;
	private int day;
	private int year;
	
	public MyDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		
		
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if(this.month == date.month && this.day == date.day && this.year == date.year) {
				return true;
			}
			else return false;
		}
		return false;
		
	}
	
	
}


public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
	}

}
