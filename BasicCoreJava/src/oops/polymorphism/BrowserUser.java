package oops.polymorphism;

public class BrowserUser {
	public static void main(String[] args) {
		SuperBrowser dr = null;
		String BrowserType = "";

		BrowserType = "Edge";
		if (BrowserType.equals("Chrome")) {
			dr = new CromeBrowser();

		} else if (BrowserType.equals("FireFox")) {
			dr = new FireFoxBrowser();

		} else if (BrowserType.equals("Edge")) {
			dr = new EdgeBrowser();
			
		} else {
			dr = new SuperBrowser();
		}
		
		dr.get();
		dr.FindbyElementId();
		dr.Close();

	}

}
