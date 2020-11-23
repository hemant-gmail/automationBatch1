package variablesAndDataTypes;

public class SwapNumbers {
	public static void main(String[] args) {
		int a= 15;
		int b=50;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		//Practice
		String[] strArray = {"a","b","b","v"};
		String[] strArray1 = new String[5]; 
		int[] intArray = {1,2,3,4,5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i==3){
				break;
			}
		}
		System.out.println();
		for (int i : intArray) {
			System.out.println(i+60);
		}
	}

}
