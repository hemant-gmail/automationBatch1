package arrays;

public class TwoDimetionalArray2 {
	public static void main(String[] args) {
		String[][] stddata = {{"User1","Password1"},{"User2","Password2"},{"User2","Password3"}};
		
		for (int r = 0; r < stddata.length; r++) {
			for (int c = 0; c < stddata[r].length; c++) {
				if (c==0){
				System.out.print(stddata[r][c]+" ");
				}else {
					System.out.println(stddata[r][c]);
				}
			}
		}
		
		System.out.println("======================================");
		
		for (int r = 0; r < stddata.length; r++) {
			for (int c = 0; c < stddata[r].length; c++) {
				System.out.print(stddata[r][c]+" ");
				}
			System.out.println();
			
		}
		
	}

}
