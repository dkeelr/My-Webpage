package tutorial;

import java.util.Scanner;

public class Week2_MSL {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the amount: ");
		double mortgageAmount = scan.nextDouble();
		
		System.out.println("Enter the annual interest percent: ");
		double rate = scan.nextDouble();
		rate = rate / 100 / 12;
		
		
		System.out.println("Enter the amortization in years: ");
		int amortizationPeriod = scan.nextInt();
		int amortization = amortizationPeriod * 12;
		
		double numerator = mortgageAmount*rate;
		double denominator = Math.pow(1+rate,  amortization);
		denominator = 1-(1/denominator);
		
		double monthlyPayment = numerator/denominator;
		
		System.out.println("The monthly payment is: $" + monthlyPayment);
		
		
		

	}

}
