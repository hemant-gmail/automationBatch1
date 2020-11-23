package arrays;

public class MultiDimeArray {
	public static void main(String[] args) {
		String[][] stdRecord = {{"1","Hemant"},{"2","Pragati"}};
		System.out.println(stdRecord[0][0]);
		System.out.println(stdRecord[0][1]);
		System.out.println(stdRecord[1][0]);
		System.out.println(stdRecord[1][1]);
		
		
		String[][] loginCred = new String[3][2];
		
		//row1
		loginCred[0][0]="user1";
		loginCred[0][1]="password1";
		
		//row2
		loginCred[1][0]="use2";
		loginCred[1][1]="password2";

		//row1
		loginCred[2][0]="user3";
		loginCred[2][1]="password3";
		
		System.out.println(loginCred.length);
		System.out.println(loginCred[0].length);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(loginCred[i][j]);
			} 
		}
		
		System.out.println("========================================");
		for (int i = 0; i < loginCred.length; i++) {
			for (int j = 0; j < loginCred[i].length; j++) {
				System.out.println(loginCred[i][j]);
			
			}
		}
		
	}

}
