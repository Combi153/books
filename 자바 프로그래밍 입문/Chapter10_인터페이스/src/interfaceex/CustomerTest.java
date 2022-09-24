package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		customer.order(); //모두 같다. 자바의 가상 메서드 방식
		buyer.order();
		seller.order();
	}

}
