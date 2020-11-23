package accessModifier;

public class TempClass {

	static char helpMe;
	public static void main(String[] args) throws Exception {

		xyz();
//		System.out.println(helpMe);
		
	}

	public static void xyz() throws Exception {
//		throw new Exception("Some exception");
		System.out.println(helpMe);
	}



}

