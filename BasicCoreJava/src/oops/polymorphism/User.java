package oops.polymorphism;

public class User {
	public static void main(String[] args) {
		StaticPolymorphism obj = new StaticPolymorphism();
		obj.sum(10, 20);
		obj.sum(15, 42, 11);

		//We can use parent class referece for child class object.
		//When we use parent class reference for child class  object then we can only call functions which are present in parent class
		//When we use parent class reference for child class object then the overriden functions will get call from child class
		
		Telephone phone1 = new Telephone();
		phone1.Calling();
		System.out.println();

		Telephone phone2 = new Mobile();
		phone2.Calling();
//		phone2.texting();
		phone2.billing();
		System.out.println();

		Telephone phone3 = new SmartPhone();
		phone3.Calling();
//		phone3.texting();
//		phone3.videoCalling();
	}

}
