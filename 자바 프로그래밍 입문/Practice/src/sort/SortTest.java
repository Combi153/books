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
		System.out.println("프로그램을 시작합니다.");
	}
	
	private void chooseLengthOfArray() {
		try {
			System.out.println("배열의 길이를 입력하세요.");
			len = sc.nextInt();
			sc.nextLine();
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.");
			chooseLengthOfArray();
		}
	}
	
	private void inputNumbersOfArray() {
		try {
			System.out.println(len + " 길이의 배열을 생성합니다.");
			array = new int[len];
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("숫자를 입력하세요. " + (len - i) + "자리 남았습니다.");
				int num = Integer.parseInt(sc.nextLine());
				array[i] = num;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
			inputNumbersOfArray();
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
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
