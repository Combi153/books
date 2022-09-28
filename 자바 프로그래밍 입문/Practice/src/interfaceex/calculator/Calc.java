package interfaceex.calculator;

public interface Calc {
	
	final public double PI = 3.14;
	final public int ERROR = -999999999;
	
	public int add(int num1, int num2);
	public int subtract(int num1, int num2);
	public int times(int num1, int num2);
	public double divide(int num1, int num2);
}
