package loops;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+1);
			if (i==2){
				break;
			}
		}
	}
}
