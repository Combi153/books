package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerJu = new Customer(1010, "������");
		customerJu.bonusPoint = 1000;
		System.out.println(customerJu.showCustomerInfo());
	
		
		System.out.println("=========================");
		VIPCustomer customerLee = new VIPCustomer(1012, "���츮", 100);
		customerLee.bonusPoint = 1500;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("=========================");
		Customer customerchoi = new VIPCustomer(1014, "�ֹ���", 100);
		
	}
}
