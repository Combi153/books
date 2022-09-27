package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum); //한번 스트림이 쓰이면 다시 쓸 수 없다.
		
		int count = (int)Arrays.stream(arr).count(); // 스트림을 새로 생성해야 한다.
		System.out.println(count);
	}

}
