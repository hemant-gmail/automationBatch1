package arrays;

public class ArrayAssignment {
	public static void main(String[] args) {
		// Make an integer array. Write a for loop to print the integer array in
		// reverse.
		// intArrayReverse();

		// Print alternate elements of String array array
		// alternateElements();

		// Find the greatest number in a array
		// greatesNumberInArray();

		// Find the least number in a array
		// leastNumberInArray();

		/*
		 * Suppose there is an integer array holding following elements:
		 * 1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
		 * 
		 * Write a program which prints which each number from array and the
		 * times it has been repeated in array Fox eg 1- Repeated 3 times 4-
		 * Repeated 6 times
		 */
		// intArrayHoldSameElement();

		int a[][] = new int[10][5];
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 5; j++) {
				a[i][j] = i * j;
			}
		}

		System.out.println(a[0][0]);
		System.out.println(a[1][3]);
		System.out.println(a[3][4]);

	}

	// Make an integer array. Write a for loop to print the integer array in
	// reverse.
	public static void intArrayReverse() {
		int[] intArray = { 1, 3, 4, 5, 53 };
		for (int i = intArray.length - 1; i >= 0; i--) {
			System.out.println(intArray[i]);
		}
	}

	// Print alternate elements of String array array
	public static void alternateElements() {
		String[] alternameEle = { "a", "r", "r", "a", "y" };
		for (int i = 0; i < alternameEle.length; i++) {
			if (i % 2 == 0) {
				System.out.println(alternameEle[i]);
			}
		}
	}

	// Find the greatest number in a array
	public static void greatesNumberInArray() {
		int bignum = 0;
		int[] num = { 15, 3, 3, 45, 3, 5, 63, 24, 3, 756, 3, 674, 654, 3, 4245, 457, 3 };
		bignum = num[0];
		for (int i = 1; i < num.length; i++) {
			if (bignum < num[i]) {
				bignum = num[i];
			}
		}
		System.out.println(bignum);
	}

	// Find the least number in a array
	public static void leastNumberInArray() {
		int smallNum = 0;
		int[] num = { 15, 3, 3, 45, 3, 5, 63, 24, 3, 756, 3, 674, 654, 3, 4245, 457, 3 };
		smallNum = num[0];
		for (int i = 1; i < num.length; i++) {
			if (smallNum > num[i]) {
				smallNum = num[i];
			}
		}
		System.out.println(smallNum);
	}

	/*
	 * Suppose there is an integer array holding following elements:
	 * 1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
	 * 
	 * Write a program which prints which each number from array and the times
	 * it has been repeated in array Fox eg 1- Repeated 3 times 4- Repeated 6
	 * times
	 */
	public static void intArrayHoldSameElement() {
		int repeatNum = 0;
		int[] intArray = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4,
				6, 311, 1 };
		for (int i = 0; i < intArray.length; i++) {
			repeatNum = 0;
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					repeatNum = repeatNum + 1;
				}
			}
			System.out.println(intArray[i] + " Repeated " + repeatNum + " times");
		}
	}

}
