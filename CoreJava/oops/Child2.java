package oops;

interface Parent3 {
	public void display();				//100%
}

abstract class Parent4 {				//0-100%  //50%
	public abstract void displayMsg();
	
	public void add(int a,int b) {
		System.out.println("The sum is:-"+(a+b));
	}
}

public class Child2 {			//0%

	public void mul(int a, int b) {
		System.out.println("The multiplication is :-"+(a*b));
	}
}
