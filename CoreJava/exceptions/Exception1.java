package exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) throws ClassNotFoundException {
		boolean value = true;
		Scanner scan = new Scanner(System.in);

		while(value) {
		System.out.print("Enter the numerator:-");

		int fnum = scan.nextInt();

		System.out.print("Enter the denominator:-");

		int snum = scan.nextInt();

		try {

			int result = (fnum / snum);

			System.out.println("The division result is :- " + result);
			value = false;
		} catch (ArithmeticException ea) {
			System.out.println("Don't enter zero as the denominator!!");
			
			value = true;
		}}

		System.out.println("The remaining 10,000 lines of code");

	}

}
