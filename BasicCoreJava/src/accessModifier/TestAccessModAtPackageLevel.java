package accessModifier;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		obj.publicFunction();
		obj.defaultFunction();
		obj.protectedFunction();
	}

}
