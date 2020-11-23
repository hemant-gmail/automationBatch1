package constructor;

public class Car {
	//Instance variable ==> non static variables
	String color;
	String type;
	String fuelType;
	
	//Class variable ==> static variables
	public static int wheel ;
	
	public void features(){
		System.out.println("My car is "+color+" in color "+type+" type and fuel type is "+fuelType);
	}
	
	public Car(){
		color = "Blue";
		type = "Class-E";
		fuelType ="LPG";
		
	}
	
	public Car(String colorName, String carType, String fuelType){
		color = colorName;
		type =carType;
		this.fuelType =fuelType;
		
	}
}
