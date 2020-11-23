package functions;

import accessModifier.AccessModifier;
				//child class					//Parent class
				//subclass						//Super class
				//derived class
public class TestAccessModAtProjectLevel extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		obj.publicFunction();
		
		TestAccessModAtProjectLevel obj1 = new TestAccessModAtProjectLevel();
		obj1.protectedFunction();
	}

}
