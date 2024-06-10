package basics;

public class ConstructorEx {

	public ConstructorEx() {		//default constr
		System.out.println("Iam from the default constructor");
	}
	
	public ConstructorEx(String name) {
		System.out.println("My name is :-"+name);
	}
	
	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("Ravalika");//object creation/constr calling
		
		
	}
	
}
