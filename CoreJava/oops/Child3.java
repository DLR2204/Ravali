package oops;

class Parent6{
	
	public void marriage(String name) {
		System.out.println("You should marry kajol");
	}
}

public class Child3 extends Parent6{

	public static void main(String[] args) {
		Child3 obj = new Child3();
		
		obj.marriage("l");
	}
	
	@Override
	public void marriage(String name) {
		System.out.println("You should marry deepika");
	}
}
