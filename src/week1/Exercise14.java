package week1;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args)
	{
		Scanner inscan = new Scanner (System.in);
		
		System.out.println("Enter a number:");
		int int1 = Integer.parseInt(inscan.nextLine());
		
		if (int1 > 0)
		{
			System.out.println("The number is +ve");
		}
		else if(int1 < 0)
		{
			
			System.out.println("The number is -ve");
			
		}
		
		else
		{
			System.out.println("Do you know that 0 is neither +ve nor -ve?");
		}
		
	}

}
