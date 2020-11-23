package constructor;

public class Bike {
	String color;
	int stroke;
	String wheelType;

	public void feature() {
		System.out.println("My bike color is " + color + ", its " + stroke + " stroke and it has " + wheelType + " wheel");
	}

	public Bike() {
//		System.out.println("Default Constructor");
	}

	public Bike(String color, int stroke, String wheelType) {
		this.color = color;
		this.stroke =stroke;
		this.wheelType=wheelType;
	}
}
