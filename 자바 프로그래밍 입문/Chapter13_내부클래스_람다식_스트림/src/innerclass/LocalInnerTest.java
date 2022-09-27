package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	
	public Runnable getRunnable() {
		
		int localNum = 100;
	 		
		return new Runnable() {

			@Override
			public void run() {

				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
			
		};
		
		/*
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				
				//localNum += 100; 지역변수를 변화시킬 수 없다. 스택 메모리에서 사라질 수 있기 때문.
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		
		}
		
		return new MyRunnable();
	*/
	}
}




public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.getRunnable().run();
		outer.runnable.run();
	}

}
