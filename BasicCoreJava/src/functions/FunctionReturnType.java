package functions;

public class FunctionReturnType {
	public static void main(String[] args) {
		System.out.println(sum(10,20)); 
		
		//eligibility return boolean
		System.out.println(eligibility(40,82));
		System.out.println(eligibility(60,15));
		System.out.println(eligibility(40,28));

		
		}

	public static int sum(int a, int b){
		return a+b;
	}
	
	public static boolean eligibility(int jeeMarks, int cetMarks){
		
		if (jeeMarks >=50 || cetMarks >=80){
			return true;
		}else{
			return false;
		}
		
	}
}
