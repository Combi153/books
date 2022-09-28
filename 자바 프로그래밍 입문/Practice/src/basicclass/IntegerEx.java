package basicclass;

public class IntegerEx {

	public static void main(String[] args) {
		
		Integer iValue = new Integer(100);
		System.out.println(iValue); //toString 이미 구현되어 있다.
		
		Integer number1 = Integer.valueOf(100);
		Integer number2 = Integer.valueOf("100");
		
		System.out.println(number1 + " " + number2);
		
		int num = Integer.parseInt("112");
		System.out.println(num);
	}
}
