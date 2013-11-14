package Chapter04Loops;

import java.util.Scanner;

public class ComputeLoanWithVariousInterestRate {
	public static void main(String[] arg) {
		//1. Let user enter the loan amount and loan period in number of years
		//2. Display the monthly and total payments for each interest rate starting from 
		//5% to 8%, with an increment of 1/8
		//formular to compute monthly payment: 
		//monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate),(numberOfYear*12))))
		//totalPayment = monthlyPayment * numberOfYear * 12
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();		
		System.out.print("Number of Years: ");
		int numberOfYear = input.nextInt();
		//run loop with starting point is interest rate from 5% to 8% with an increment 1/8
		double startingInterestRate = 5;
		double endingInterestRate = 8;
		double increment = 1.0 / 8;
		double monthlyInterestRate = 5;
		int incrementStep = (int)((endingInterestRate - startingInterestRate) / increment) + 1;
		System.out.println("Interest Rate     Monthly Payment     Total Payment");
		for (int i = 0; i < incrementStep; i++) {
			double monthlyPayment = (loanAmount * (monthlyInterestRate / 1200) / (1 - (1 / Math.pow((1 + (monthlyInterestRate / 1200)),(numberOfYear*12)))));			
			double totalPayment = monthlyPayment * numberOfYear * 12;
			System.out.printf("%5.3f%1s            %6.2f              %8.2f", monthlyInterestRate, "%", monthlyPayment, totalPayment);		
			monthlyInterestRate += increment;
			System.out.println();
		}
		
	}
}
