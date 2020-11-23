package functions;

import accessModifier.AccessModifierTry1;

public class TestAccessModAtProjectLevelTry1 extends AccessModifierTry1{
	public static void main(String[] args) {
		AccessModifierTry1 amt = new AccessModifierTry1();
		amt.PublicFunction1();
		//amt.PrivateFunction1(); not allow
		//amt.DefaultFunction1(); not allow
		//amt.ProtectedFunction1(); not allow
		
		TestAccessModAtProjectLevelTry1 camt = new TestAccessModAtProjectLevelTry1();
		camt.ProtectedFunction1();		
	}
}
