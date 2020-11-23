package exceptionHandling;

import oops.abstraction.RBI;

public class UnCheckedException {
	public static void main(String[] args) {
		int a=0;
		int b=20;
		
		//1. Arithmetic Exception
		//System.out.println(b/a);
		
		//2. Index Out Of Bounds Exception:
		String name = "Hemant";
		//System.out.println(name.charAt(8));
		
		//3. Array Index Out Of Bounds Exception
		String[] name1 = {"Hemant","Prakash"};
		//System.out.println(name1[3]);
		
		//4. Null Pointer Exception ********
		RBI rbi = null;
		rbi.creditCard();
		
		
	}

}
