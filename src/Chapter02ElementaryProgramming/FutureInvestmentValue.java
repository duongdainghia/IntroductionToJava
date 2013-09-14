package Chapter02ElementaryProgramming;
import java.util.Scanner;
public class FutureInvestmentValue {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the investmentAmount, annualInterestRate and numberOfYear:");
		double investAmount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double numberOfYear = input.nextDouble();
		double futureInvestmentValue = investAmount * Math.pow((1 + annualInterestRate / 1200), (numberOfYear * 12));
		System.out.println("Your future invest amount is " + futureInvestmentValue);
	}
}
