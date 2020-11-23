package functions;

import javax.xml.ws.handler.MessageContext;

public class FuntionNotStaticFunction {
	public int age = 32;
	public static String name = "Hemant";
	
	public static void main(String[] args) {
		//int add = sum(10,20);
		//ystem.out.println(add);
		FuntionNotStaticFunction objRef = new FuntionNotStaticFunction();
		
		int add= objRef.sum(15, 55);
		System.out.println(add);
		
		System.out.println(objRef.age);
		
		message();
		System.out.println(name);
			
	}
	
	public int sum(int a, int b){
		return a+b;
	}

	public static void message(){
		System.out.println("Your message");
	}
}
