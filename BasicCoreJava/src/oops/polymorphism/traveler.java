package oops.polymorphism;

public class traveler {
	public static void main(String[] args) {
		Vehicale obj = null;
		String traveltype ="";
		
		traveltype ="Cycle";
		if (traveltype.endsWith("Cycle")){
			obj = new Cycle();
		}else if (traveltype.endsWith("MotorCycle")){
			obj = new MotorCycle();
		}else if (traveltype.endsWith("Car")){
			obj = new Car1() ;
		}

		obj.travelling();
	}

}
