package basicFunctions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcept {
	
	@Test
	@Parameters({"browser","intance"})
	public void launchBrowser(String br, int a){
		System.out.println(" -> Launching "+ br +" browser <- with "+a+" instance");
	}

}
