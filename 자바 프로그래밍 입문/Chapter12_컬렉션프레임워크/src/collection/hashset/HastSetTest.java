package collection.hashset;

import java.util.HashSet;

public class HastSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set); //toString�� �̹� �����Ǿ� �ִ�.
		System.out.println(b1);
		boolean b = set.add("aaa");
		
		System.out.println(set);
		System.out.println(b);
	}

}
