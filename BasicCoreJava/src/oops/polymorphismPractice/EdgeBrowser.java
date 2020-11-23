package oops.polymorphismPractice;

public class EdgeBrowser extends SuperBrowser {
	public void get(){
		System.out.println("This is get() from Edge browser");
	}

	public void findelementById(){
		System.out.println("This is findelementById() from Edge browser");
	}

	public void close(){
		System.out.println("This is close() from Edge browser");
	}

}
