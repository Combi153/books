package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "이혜리");
		Customer customerKim = new Customer(10011, "김신");
		GoldCustomer customerYu = new GoldCustomer(10012, "YuAh");
		GoldCustomer customerJu = new GoldCustomer(10013, "Ju");
		VIPCustomer customerChoi = new VIPCustomer(10014, "Choi", 100);
		VIPCustomer customerJeong = new VIPCustomer(10014, "ChanSung", 100);

		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerYu);
		customerList.add(customerJu);
		customerList.add(customerChoi);
		customerList.add(customerJeong);

		System.out.println("============= 고객 정보 =============");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("============= 할인율과 보너스 포인트 결과 =============");
		int pay = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(pay);
			System.out.println(customer.getCustomerName() + "님이 " 
			+ cost + "를 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}
}
