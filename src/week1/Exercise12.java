package week1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner inscan = new Scanner(System.in);

		try {
			System.out.println("Enter your name:");
			String name1 = inscan.nextLine();
			System.out.println("Enter age:");
			int int1 = Integer.parseInt(inscan.nextLine());

			System.out.println("Enter second name:");
			String name2 = inscan.nextLine();
			System.out.println("Enter second age:");
			int int2 = Integer.parseInt(inscan.nextLine());

			System.out.println("The combined age of " + name1 + " and " + name2
					+ " is : " + (int1 + int2));
		}

		finally {
			inscan.close();

			// All input streams should be closed
		}

	}
}
