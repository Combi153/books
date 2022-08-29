package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum; // 소수 부분 버리고 정수만 저장
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)fNum + (int)dNum; // 3+0이 int로 저장
		int num2 = (int)(fNum + dNum); // 4.04가 int로 저장되며 소수 부분이 truncate
		
		System.out.println(num1);
		System.out.println(num2);
	}	

}
