package arrays;

public class ArrayExample1 {
	public static void main(String[] args) {
		String[] stds = new String[6];
		stds[0]="H";
		stds[1]="E";
		stds[2]="M";
		stds[3]="A";
		stds[4]="N";
		stds[5]="T";
		
		System.out.println("Size of my Array is "+stds.length);
		System.out.println(stds[0]);
		System.out.println(stds[1]);
		System.out.println(stds[2]);
		System.out.println(stds[3]);
		System.out.println(stds[4]);
		System.out.println(stds[5]);
		
		for (int i = 0; i <= stds.length-1; i++) {
			if (i != stds.length-1){
				System.out.print(stds[i]+"=>");
			}else
			{
				System.out.print(stds[i]);
			}
		}
		
		System.out.println("------------------------------------------------");
		for (int i = stds.length-1; i >=0 ; i--) {
			System.out.println(stds[i]);
		}
		
	}
}
