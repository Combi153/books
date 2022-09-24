package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
		//타입 상속
		//메서드 상속? 두 가지로 나뉘는 것 같다.
	}

}
