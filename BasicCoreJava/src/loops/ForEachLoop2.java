package loops;

public class ForEachLoop2 {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		
		for (int i : intArray) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		int j=0;
		for (int i : intArray) {
			j=j+i;
			System.out.print(j + " ");
		}
	}
}
