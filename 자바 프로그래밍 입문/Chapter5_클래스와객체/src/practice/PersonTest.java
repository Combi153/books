package practice;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personJames = new Person();
		personJames.age = 40;
		personJames.name = "James";
		personJames.ismarried = true;
		personJames.numOfChildren = 3;
		
		personJames.getPersonInfo();
		System.out.println();
		
		Person personHarry = new Person("Harry", 30, true, 2);
		personHarry.getPersonInfo();
	}

}
