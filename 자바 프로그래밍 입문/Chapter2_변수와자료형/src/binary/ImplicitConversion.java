package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // literal 10(int) -> byte 10
		int num = bNum; // byte 10 -> int 10
		
		System.out.println(num);
		
		long lNum = 10; // literal 10(int) -> long 10
		float fNum = lNum; // long 10 -> float 10
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //  float (float 10 + int 10) -> double 10
		
		System.out.println(dNum);
	}

}
