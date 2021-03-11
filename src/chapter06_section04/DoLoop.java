package chapter06_section04;

import java.util.Scanner;

/**
   This program shows how you can prompt for input that fulfills
   a certain condition. Try entering negative values, such as
   -2 or -0.5, to see how they are rejected.
 */
public class DoLoop 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double value;
		
		//Do loop example of input validation
		do
		{
			System.out.print("Enter a number >= 0: ");
			value = in.nextDouble();
		}
		while (value < 0); //Invalid input, try again!
		in.close();
		
		double root = Math.sqrt(value);
		System.out.println("The square root of the number is " + root);
	}
}
