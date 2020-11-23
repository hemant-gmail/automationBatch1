package oops.abstraction;

public class BankUser {
	public static void main(String[] args) {
		int a;
		RBI bank = new ICICI();
		
		BankUser bank1= new BankUser();
		bank1.bankFeature(bank);
		
		//Bank					Superbank
		//HDFC					RBI
		//ICICI					RBI
		//SBI					RBI
		
		//Browsers				SuperBrowser
		//FireFox				webDriver
		//Edge					webDriver
		//Chrome				webDriver
	}
	
	public void sum(int a){
		
	}
	public void bankFeature(RBI bank){
		bank.savingAccount();
		bank.currentAccount();
		bank.creditCard();
		bank.debitCard();
	}
}
