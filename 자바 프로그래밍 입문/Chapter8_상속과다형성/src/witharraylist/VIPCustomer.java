package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//super(); // default로 들어가 있다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {// 메서드 오버라이딩
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 아이디는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
}
