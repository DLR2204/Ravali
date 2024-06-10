package oops;

interface Parent1 {

	public void add(int a, int b);

}

interface Parent2 {

	public void add(int a, int b);
}

public class Child1 implements Parent1, Parent2 {

	public void add(int a, int b) {
		System.out.println("The sum is :-" + (a + b));
	}

	public static void main(String[] args) {
		Child1 obj = new Child1();

		obj.add(2, 8);
	}

}
