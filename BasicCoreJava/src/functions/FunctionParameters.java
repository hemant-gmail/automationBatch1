package functions;

public class FunctionParameters {
	public static void main(String[] args) {
		sum(10,20);
		sum(10,20,30);
		message("Hemant", 89);
	}
	
	
	public static void sum(int a, int b){
		System.out.println(a+b);	
	}
	
	public static void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void message(String name, int age){
		System.out.println("Your name is "+ name +" and your age is "+ age);
	}
}
