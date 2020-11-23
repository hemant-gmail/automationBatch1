package ifEsleStatment;

public class Nestedifelsestatment {

	public static void main(String[] args) {
		int month = 3;
		double year = 2020;

		if (month == 2) {
			if (year % 4 == 0) {
				System.out.println("This is leap year");
			} else {
				System.out.println("This is not leap year");
			}
		} else {
			System.out.println("Enter month other than feb");
		}
		
		String hem = "Hemant";
		if (hem != "Hemant"){
			System.out.println("Text is something else");
		}else{
			System.out.println("Text is Hemant");
		}

	}
}
