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
		System.out.println("택시 " + taxiNumber + "의 승객은 " + passengerCnt + "명이고, 수입은" + money + "입니다.");
	}
}
