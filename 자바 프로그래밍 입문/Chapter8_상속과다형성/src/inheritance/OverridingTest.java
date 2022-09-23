package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println(price + "을 내야하며 "+ customerLee.showCustomerInfo());
		
		VIPCustomer customerJu = new VIPCustomer(100010, "JU", 100);
		price = customerJu.calcPrice(10000);
		System.out.println(price + "을 내야하며 " + customerJu.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(100010, "WHO", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println(price + "을 내야하며 " + customerWho.showCustomerInfo());
		// 가상함수? 재정의된 메서드가 호출된다.
		
		Customer customerGold = new GoldCustomer(100011, "Gold");
		System.out.println(customerGold.showCustomerInfo());
	}

}
