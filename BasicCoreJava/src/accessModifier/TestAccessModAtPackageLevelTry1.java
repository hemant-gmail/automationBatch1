package accessModifier;

public class TestAccessModAtPackageLevelTry1 {

	public static void main(String[] args) {
		AccessModifierTry1 amt = new AccessModifierTry1();
		amt.PublicFunction1();
		//amt.PrivateFunction1();		Not allow.
		amt.DefaultFunction1();
		amt.ProtectedFunction1();

	}
	
		
}
