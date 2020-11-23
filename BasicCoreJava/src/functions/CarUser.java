package functions;

public class CarUser {
	public static void main(String[] args) {
		Car carObj1 = new Car();
		carObj1.feature();
		System.out.println("====================================================================");	
		carObj1.color="Silver";
		carObj1.type="Maruti Suzuki";
		carObj1.wheels=5;
		carObj1.feature();
		
		System.out.println("====================================================================");
		Car carObj2 = new Car();
		/*carObj2.color="Purple";
		carObj2.type = "SUV";*/
		carObj2.wheels = 7;
		carObj2.feature();
		System.out.println("====================================================================");		
		Car carObj3 = new Car();
		carObj3.feature();
	}

}
