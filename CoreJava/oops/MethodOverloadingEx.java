package oops;

public class MethodOverloadingEx {
	
	public void add(int a,int b) {
		System.out.println("6.the sum of two integers is :-" +(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("9.The sum of 3 integers is :-"+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("12.The sum of an int and float is :-"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("15.The of a float and an int is :-"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.The sum of two float are :-"+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		
		obj.add('a','b');
		
		
		
	}
}
