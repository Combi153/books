package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3};
		
		int[] numbers1;
		numbers1 = new int[] {1,2,3,4};
		
		int[] numbers2 = new int[5];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i<numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}
		
		for (int i = 0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
	}

}
