package ifEsleStatment;

public class ArithOperator {
	public static void main(String[] args) {
		//Arithmatic operatior = + - / * %
		int a=40;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// % mode
		System.out.println(20%10);
		
		//+ Operator for addition and concatenation
		String firstname = "Hemant";
		String lastName = "Fulmali";
		
		System.out.println(firstname + " "+ lastName);
		System.out.println(a+firstname+b);
		System.out.println(a+b+firstname);
		System.out.println(firstname+a+b);
		System.out.println(firstname+(a+b));
		
	}
}
