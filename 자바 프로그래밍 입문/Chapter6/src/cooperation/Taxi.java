package cooperation;

public class Taxi {
	
	int taxiNumber;
	int passengerCnt;
	int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCnt++;
	}
	public void showInfo() {
		System.out.println("�ý� " + taxiNumber + "�� �°��� " + passengerCnt + "���̰�, ������" + money + "�Դϴ�.");
	}
}
