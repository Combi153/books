package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCnt;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money = money;		//버스 수입 증가
		passengerCnt++;			//승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은 " + passengerCnt + "명이고, 수입은 "
				+ money + "입니다.");
	}
}
