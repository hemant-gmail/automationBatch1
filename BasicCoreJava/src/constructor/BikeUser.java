package constructor;

public class BikeUser {

	public static void main(String[] args) {
/*		Bike bk = new Bike();

		bk.color = "Red";
		bk.stroke = 5;
		bk.wheelType = "Spoke";
		bk.feature();

		Bike bk1 = new Bike();

		bk1.color = "Silver";
		bk1.stroke = 4;
		bk1.wheelType = "Alloy";
		bk1.feature();

		Bike bk2 = new Bike();

		bk2.color = "Blue";
		bk2.stroke = 5;
		bk2.wheelType = "Alloy";
		bk2.feature();
*/		
		Bike bk3 = new Bike("Blank", 4, "Spoke");
		bk3.feature();
		Bike bk4 = new Bike();
		bk4.feature();
	}
}
