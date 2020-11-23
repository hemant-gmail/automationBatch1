package oops.inheritance;

public class User {

	public static void main(String[] args) {
		Telephone phone1 = new Telephone();
		phone1.Calling();
		System.out.println();

		Mobile phone2 = new Mobile();
		phone2.texting();
		phone2.Calling();
		System.out.println();

		SmartPhone phone3 = new SmartPhone();
		phone3.videoCalling();
		phone3.texting();
		phone3.Calling();

	}

}
