package arrays;

public class HomeWorkArray {
	public static void main(String[] args) {
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===========================================");
			
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3
		//4 4 4 4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("===========================================");

		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		//13 14 15 16
		int p=1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(p + " ");
				p=p+1;
			}
			System.out.println();
		}
		System.out.println("===========================================");

		//1
		//1 2
		//1 2 3
		//1 2 3 4
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===========================================");
			
		//1
		//1 1
		//1 1 1
		//1 1 1 1
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}

	}

}
