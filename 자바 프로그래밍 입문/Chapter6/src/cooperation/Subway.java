package cooperation;

public class Subway {
	
	int subwayLine;
	int passengerCnt;
	int money;
	
	public Subway(int subwayLine) {
		this.subwayLine = subwayLine;
	}
	
	public void take(int money) {
		this.money = money;		//버스 수입 증가
		passengerCnt++;			//승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("지하철" + subwayLine + "호선의 승객은 " + passengerCnt + "명이고, 수입은 "
				+ money + "입니다.");
	}
}
