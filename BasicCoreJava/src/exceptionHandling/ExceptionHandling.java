package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 0;
		int b = 20;

		try {
			// 1. Arithmetic Exception
			System.out.println(b / a); //on failure delete log file.

			// 2. Index Out Of Bounds Exception:
			String name = "Hemant";
			System.out.println(name.charAt(8)); //on failure revert the config changes

			// 3. Array Index Out Of Bounds Exception
			String[] name1 = { "Hemant", "Prakash" };
			System.out.println(name1[3]); // on failure remove the error from proc

			// 4. Null Pointer Exception ********
			RBI rbi = null;
			rbi.creditCard(); //on failure restart the xyz service
		}catch (ArithmeticException e) {
			System.out.println("Recovery Senario 1: " + e.getMessage());
			}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Recovery Senario 2: " + e.getMessage());
		}		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Recovery Senario 3: " + e.getMessage());
		}		
		catch (NullPointerException e) {
			System.out.println("Recovery Senario 4: " + e.getMessage());
		}		
		catch (Exception e) {
			System.out.println("Unknown Exception");
		}
		finally {
			System.out.println("This will execute in any situation");
		}

		// Senario1:
		// Launch Browser
		// Login
		// Validate Compose email funtionality

		// Senario2: Validate the visibility of all the fields displayed on
		// homepage
		// Search textbox, Gmail link, Youtube, Language, Image link
		//
	}

}
