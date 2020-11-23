package oops.encapsulation;

public class UserDetails {
	private int age;
	
	void test(){
		System.out.println("test");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0){
		this.age = age;
		}
	}
}
