package exceptionHandling;

public class ThrowKeyword {
	public static void main(String[] args) {
//		sum(10,20);
		//throw new Exception("Testing exception");
	}

	//User define exception
	public static void sum(int a, int b) throws InterruptedException{
		System.out.println(a+b);
		Thread.sleep(2000);
	}

}
