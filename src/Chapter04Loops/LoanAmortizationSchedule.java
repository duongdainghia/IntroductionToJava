package Chapter04Loops;

import java.util.Scanner;

public class LoanAmortizationSchedule {
	public static void main(String[] arg) {
		//monthly interest = monthly interest rate * balance (the remaining principal)
		//the principal paid for the month = the monthly payment - monthly interest
		//1. let user enter loan amount, number of year and interest rate
		//2. display amortization schedule for the loan
		// compute: monthly payment, total payment, monthly interest, principal, balance
		//monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate),(numberOfYear*12))))
		//totalPayment = monthlyPayment * numberOfYear * 12
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYear = input.nextInt();
		System.out.print("Annual Interest Rate: ");		
		double annualInterestRate = input.nextDouble();
		System.out.println();
		double monthlyPayment = (loanAmount * (annualInterestRate / 1200)) / (1 - (1 / Math.pow((1 + (annualInterestRate / 1200)),(numberOfYear*12))));
		double totalPayment = monthlyPayment * numberOfYear * 12;
		System.out.print("Monthly Payment: ");
		System.out.printf("%-6.2f", monthlyPayment);
		System.out.println();
		System.out.print("Total Payment: ");
		System.out.printf("%-8.2f", totalPayment);		
		System.out.println();
		System.out.println();
		double balance = loanAmount;
		System.out.printf("%-13s%-13s%-14s%7s", "Payment#", "Interest", "Principal", "Balance");
		System.out.println();
		for (int i = 1; i <= numberOfYear * 12; i++) {									
			double monthlyInterest = (annualInterestRate / 1200) * balance;
			double principalMonthlyPaid = monthlyPayment - monthlyInterest;
			balance = balance - principalMonthlyPaid;							
			System.out.printf("%-13d%-13.2f%-14.2f%7.2f", i, monthlyInterest, principalMonthlyPaid, balance);
			System.out.println();
		}		
	}
}
