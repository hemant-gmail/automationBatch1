package accessModifier;

public class AccessModifierTry1 {
	public static void main(String[] args) {
		AccessModifierTry1 amt = new AccessModifierTry1();
		System.out.println("Printing withing class");
		amt.PublicFunction1();
		amt.PrivateFunction1();
		amt.DefaultFunction1();
		amt.ProtectedFunction1();
	}
	
	public void PublicFunction1(){
		//can be accessed throughout the project
		System.out.println("Printing Public Function1");
	}
	
	private void PrivateFunction1(){
		//can be accessed within the class
		System.out.println("Printing Private Function1");
	}

	void DefaultFunction1(){
		//can be accessed within the package
		System.out.println("Printing Deafult Funcation1");
	}
	
	protected void ProtectedFunction1(){
		//can be accessed within Package and outside of the package by using child/Sub/Inheritance class
		System.out.println("Printing Protected Function1");
	}
}
