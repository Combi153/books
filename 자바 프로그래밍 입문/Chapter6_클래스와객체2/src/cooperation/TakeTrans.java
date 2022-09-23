package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJu = new Student("주찬민",10000);
		Student studentChoi = new Student("최정선",5000);
		Student studentEdward = new Student("Edward", 20000);
		
		
		Bus bus32 = new Bus(32);
		studentJu.takeBus(bus32);
		studentJu.showInfo();
		bus32.showInfo();
		
		Subway subway2 = new Subway(2);
		studentChoi.takeSubway(subway2);
		studentChoi.showInfo();
		subway2.showInfo();
		
		Taxi taxi1365 = new Taxi(1365);
		studentEdward.takeTaxi(taxi1365);
		studentEdward.showInfo();
		taxi1365.showInfo();
	}

}
