package chapter08_section05;

import chapter08_section04.Financial;

public class PackageDemo
{
	public static void main(String[] args)
	{
		double price = 9.95;
		double taxRate = 8.25;
		double tax = Financial.percentOf(price, taxRate);
		System.out.printf("Tax: %.2f\n", tax);
	}
}
