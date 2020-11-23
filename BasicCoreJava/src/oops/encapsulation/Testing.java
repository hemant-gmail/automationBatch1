package oops.encapsulation;

public class Testing  {
	
	public static void main(String[] args) {
		UserDetails details = new UserDetails();
		details.test();
		
		details.setAge(-40);
		System.out.println(details.getAge());
		//ppp.age=-40; not posible as its private
	}
	

}
