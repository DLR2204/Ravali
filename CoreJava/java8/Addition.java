package java8;

@FunctionalInterface
interface Calculator{
	
	public abstract void add(int a,int b);
}

public class Addition implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println("The sum of two values is:-"+(a+b));
		
	}

}
