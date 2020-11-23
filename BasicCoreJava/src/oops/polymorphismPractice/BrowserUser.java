package oops.polymorphismPractice;

public class BrowserUser{

	public static void main(String[] args) {
		SuperBrowser sbr;
		String browserName1 = null;

		browserName1 = "FirBox";
		
		if (browserName1.equals("Chrome")) {
			sbr = new CromeBrowser();
			sbr.get();
			sbr.findelementById();
			sbr.close();
			
		}else if (browserName1.equals("FirBox")){
			
			sbr = new FireFoxBrowser();
			
			sbr.get();
			sbr.findelementById();
			sbr.close();
		}else if (browserName1.equals("Edge")){
			sbr = new EdgeBrowser();
			
			sbr.get();
			sbr.findelementById();
			sbr.close();
					
		}
	}
			
}
