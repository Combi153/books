package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
	}

}
