package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerJu = new Customer();
		customerJu.setCustomerID(1010);
		customerJu.setCustomerName("������");
		customerJu.bonusPoint = 1000;
		System.out.println(customerJu.showCustomerInfo());
	
		
		System.out.println("=========================");
		Customer customerLee = new Customer();
		customerLee.setCustomerID(1012);
		customerLee.setCustomerName("���츮");
		customerLee.bonusPoint = 1500;
		System.out.println(customerLee.showCustomerInfo());
	}
}
