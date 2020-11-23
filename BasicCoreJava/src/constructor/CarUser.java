package constructor;

public class CarUser {
	public static void main(String[] args) {
		//Object ==> Object is an instance of a class
		
		//Primitive: int, short, byte, long, double, float, boolean, char
		//Non - Primitive: Classes, Arrays, Interfaces

		//Data type  	Object(reference)		Object(instance)
		Car 			car1 				= 	new Car();
		int				a					=	10;
		boolean			status				=	true;
		
		car1.color="Red";
		car1.type="SUV";
		car1.fuelType="CNG";
		car1.features();

		Car car2 = 	new Car();
		car2.color="Yellow";
		car2.type="SUV1";
		car2.fuelType="CNG-Petrol";
		car2.features();

		Car car3 = 	new Car();
		car3.color="White";
		car3.type="Sedan";
		car3.fuelType="CNG-Deisel";
		car3.features();

		Car car4 = new Car("Purple", "SUV-2", "Only Petrol");
		car4.features();

		Car car5 = new Car();
		car5.features();
	}

}
