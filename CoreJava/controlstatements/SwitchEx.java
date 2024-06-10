package controlstatements;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your max marks:-");
		
		float mm = scan.nextFloat();
		
		System.out.print("Enter your obtained marks:-");
		
		float om = scan.nextFloat();
		
		float percentage = (om/mm)*100;
		
		System.out.println("Your percentage is:-"+percentage);
		
		int gpa = (int) ((percentage/10)%10);
		
		System.out.println("Your gpa is:-"+gpa);
		
		System.out.print("Your grade is:-");
		
		switch(gpa) {
		
		case 10 :{
			System.out.println("distinction");
			break;
		}
		case 9:{
			System.out.println("outstanding");
			break;
		}
		case 8:{
			System.out.println("excellent");
			break;
		}
		case 7:{
			System.out.println("very good");
			break;
		}
		case 6:{
			System.out.println("good");
			break;
		}
		case 5:{
			System.out.println("average");
			break;
		}
		case 4:{
			System.out.println("improve well");
			break;
		}
		default:{
			System.out.println("Fail");
			break;
		}
		
		
		}
		
		
	}

}
