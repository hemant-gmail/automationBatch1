package stringClass;

import java.util.Iterator;

public class Testing {
	public static void main(String[] args) {
		String name = "Hemant0";
		//Function 1. leght
		System.out.println(name.length());		

		//Function 2. Char at
		System.out.println(name.charAt(4));
		
		//Function 3. equals
		System.out.println(name.equals("Hemant0"));

		//Function 4. equals ignore case
		System.out.println(name.equalsIgnoreCase("hemant0"));

		//Function 5. trim remove space
		String name1 = "    Fulmali ";
		System.out.println(name1.trim());

		//Function 6. upper case
		System.out.println(name1.toUpperCase());

		//Function 7. lower case
		System.out.println(name1.toLowerCase());

		//Function 8. sub string
		System.out.println(name.substring(5));
		System.out.println(name.substring(0, 4));

		//Function 9. replace
		System.out.println(name.replace("H", "HE"));

		//Function 10. split
		System.out.println(name.split("a")[0]);
		name1= "he1ma1nt";
		String[] newS	= name1.split("1");
		for (String str : newS) {
			System.out.println(str);
		}

		//Function 11. 
		System.out.println(name.split("a")[0]);
		
}

}
