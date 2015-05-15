package week1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[]args)
	{
		
		Scanner inScan = new Scanner(System.in);
		
		System.out.println("Type the first number:");
		int number = Integer.parseInt(inScan.nextLine());
		
		System.out.println("Type the second number:");
		int number2 = Integer.parseInt(inScan.nextLine());
		
		System.out.println("Sum of "+ number + " and " + number2 + " is:" + (number+number2));
		
	}
	
}
