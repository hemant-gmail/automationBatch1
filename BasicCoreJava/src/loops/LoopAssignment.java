package loops;

public class LoopAssignment {
	public static void main(String[] args) {
		//Write a for loop to print even numbers between 1 to 100
		//evenNumber();
		
		//Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisible by 5 followed by that number'
		//numberDivisibleByFive();
		
		//Write a for loop to find the sum of first 100 numbers(1 to 100)
		//sumOfFirst100number();
		
/*		Write program to display following output
		1
		12
		1234
		12345
		123456
		1234567
*/
		//displayIncrementValue();
			
	}
	
	//Write a for loop to print even numbers between 1 to 100
	public static void evenNumber(){	
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0){
				System.out.print(i + " ");
			}
		}
	}
	
	//Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, 
	//it prints 'divisible by 5 followed by that number'
	public static void numberDivisibleByFive(){
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0){
				System.out.println(i + " divisible by 5");
			}else{
				System.out.println(i + " ");
				
			}			
		}
	}

	//Write a for loop to find the sum of first 100 numbers(1 to 100)
	public static void sumOfFirst100number(){
		int sum =0;
		for (int i = 1; i <= 100; i++) {
			sum =sum+i;
		}
		System.out.println(sum);
	}

	/*		Write program to display following output
		1
		12
		1234
		12345
		123456
		1234567
	 */
	public static void displayIncrementValue() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
}
