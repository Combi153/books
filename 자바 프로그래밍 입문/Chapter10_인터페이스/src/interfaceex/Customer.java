package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("������ �˴ϴ�.");
	}

	@Override
	public void buy() {
		System.out.println("������ ��ϴ�.");
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}

}
