package oops.polymorphism;

public class Mobile extends Telephone {
	
	//Method overriding
	//when we have same methods with same parameters in parent and childe class
	public void texting(){
		System.out.println("Texting message from mobile");
	}

	public void Calling(){
		System.out.println("Calling from mobile");
	}

}
