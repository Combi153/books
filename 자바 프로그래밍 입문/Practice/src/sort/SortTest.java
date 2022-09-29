package sort;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class SortRunner {
	
	private int len;
	private int[] array;
	private Scanner sc = new Scanner(System.in);
	
	public SortRunner() {}
	
	private void start() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	private void chooseLengthOfArray() {
		try {
			System.out.println("�迭�� ���̸� �Է��ϼ���.");
			len = sc.nextInt();
			sc.nextLine();
			
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			chooseLengthOfArray();
		}
	}
	
	private void inputNumbersOfArray() {
		try {
			System.out.println(len + " ������ �迭�� �����մϴ�.");
			array = new int[len];
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("���ڸ� �Է��ϼ���. " + (len - i) + "�ڸ� ���ҽ��ϴ�.");
				int num = Integer.parseInt(sc.nextLine());
				array[i] = num;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			inputNumbersOfArray();
			
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			System.out.println(e);
			
		} finally {
			System.out.println(Arrays.toString(array));
		}
	}
	
	final public void run() {
		start();
		chooseLengthOfArray();
		inputNumbersOfArray();
		//chooseSort();
		//printNumber();
		//end();
	}
}



public class SortTest {

	public static void main(String[] args) {
		
		SortRunner sort = new SortRunner();
		sort.run();
		
		//Scanner sc = new Scanner(System.in);
		//String a = sc.nextLine();
		//System.out.println(1 + Integer.parseInt(a));
				
	}
	
}
