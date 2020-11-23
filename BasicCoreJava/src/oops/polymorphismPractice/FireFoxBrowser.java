package oops.polymorphismPractice;

public class FireFoxBrowser  extends SuperBrowser{
	public void get(){
		System.out.println("This is get() from FireFox browser");
	}

	public void findelementById(){
		System.out.println("This is findelementById() from FireFox browser");
	}

	public void close(){
		System.out.println("This is close() from FireFox browser");
	}

}
