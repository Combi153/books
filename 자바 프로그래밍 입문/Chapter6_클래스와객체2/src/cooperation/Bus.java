package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCnt;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;		//���� ���� ����
		passengerCnt++;			//�°� �� ����
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°��� " + passengerCnt + "���̰�, ������ "
				+ money + "�Դϴ�.");
	}
}
