package functions;

public class Car {
	
	//Note: default value of integer variable is 0, String variable is null
	
	//Instance variable >> non static variable >> cab be called only using object of the class.
	public String color;
	public String type;

	//Class variable >> Static variable >> can be call using class name.(mean also can call by object of class)
	public static int wheels;

	
	public void feature(){
		System.out.println("My car color is "+color+" which has "+wheels+" wheel and its of "+type+" type");
	}

}
