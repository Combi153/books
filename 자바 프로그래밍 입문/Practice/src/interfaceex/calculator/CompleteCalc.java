package interfaceex.calculator;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("�����Դϴ�.");
			return Calc.ERROR;
		}
		return num1 / (num2 * 1.0) ;
	}
	
	public void showInfo() {
		System.out.println("������ ���� �Դϴ�.");
	}

}
