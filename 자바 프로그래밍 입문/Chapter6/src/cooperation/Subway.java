package cooperation;

public class Subway {
	
	int subwayLine;
	int passengerCnt;
	int money;
	
	public Subway(int subwayLine) {
		this.subwayLine = subwayLine;
	}
	
	public void take(int money) {
		this.money = money;		//���� ���� ����
		passengerCnt++;			//�°� �� ����
	}
	
	public void showInfo() {
		System.out.println("����ö" + subwayLine + "ȣ���� �°��� " + passengerCnt + "���̰�, ������ "
				+ money + "�Դϴ�.");
	}
}
