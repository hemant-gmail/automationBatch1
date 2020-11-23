package accessModifier;

public class AccessModifier {
	//Access modifiers
	//Public Private Protected No-Acces Mod/Detault
	
			
	//public >> Can be accessed throughout the project
	//Class=YES | package=YES | project=YES
	
	
	//private >> Can be accessed within the class
	//Class=YES | package=NO | project=NO
	
	
	//default >> can be accessed within the package
	//Class=YES | package=YES | project=NO
	
	
	//protected >> can be accessed within the package and can be accessed outside of package by using child class object
	//Class=YES | package=YES | project=No*
	
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		obj.publicFunction();
		obj.priateFunction();
		obj.defaultFunction();
		obj.priateFunction();

	}
	
	public void publicFunction(){
		System.out.println("Public function");
		System.out.println("Programming is…enjoy ");
	}
	
	private void priateFunction(){
		System.out	.println("Private function");
	}
	
	void defaultFunction(){
		System.out.println("Default function");
	}
	
	protected void protectedFunction(){
		System.out.println("Protected function");
	}

	
	
	
}
