package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("물건을 팝니다.");
	}

	@Override
	public void buy() {
		System.out.println("물건을 삽니다.");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
