package chapter05_section04;

import java.util.Scanner;

/**
   This program calculates a simple tax return.
 */
public class TaxCalculator
{  
	public static void main(String[] args)
	{  
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your income: ");
		double income = in.nextDouble();

		System.out.print("Are you married? (Y/N) ");
		String input = in.next();
		in.close();

		int status;
		if (input.toLowerCase().equals("y")) 
		{
			status = TaxReturn.MARRIED;
		}
		else if (input.toLowerCase().equals("n")) 
		{
			status = TaxReturn.SINGLE;
		}
		else {
			status = 0;
			System.out.println("Are you dumb and single, dumb and married, or just dumb?");
		}

		TaxReturn aTaxReturn = new TaxReturn(income, status);

		System.out.println("Tax: "
				+ aTaxReturn.getTax());
	}
}