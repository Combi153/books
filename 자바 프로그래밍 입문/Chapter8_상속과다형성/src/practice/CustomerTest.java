package practice;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerJu = new VIPCustomer();
		customerJu.setCustomerID(10020);
		customerJu.setCustomerName("������");
		customerJu.bonusPoint = 10000;
		System.out.println(customerJu.showCustomerInfo());
	}

}
