package practice;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.orderNum = 201803120001L;
		order1.custID = "abc123";
		order1.date = "2018.03.12";
		order1.custName = "ȫ���";
		order1.pdID = "PD0345-12";
		order1.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println(order1.orderNum);
		System.out.println(order1.custID);
		System.out.println(order1.date);
		System.out.println(order1.custName);
		System.out.println(order1.pdID);
		System.out.println(order1.address);
	}
}
