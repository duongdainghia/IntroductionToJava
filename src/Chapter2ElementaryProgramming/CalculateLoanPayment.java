package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class CalculateLoanPayment {
	public static void main(String[] arg){
		//calculate loan amount program
		 String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest: ");
		 double annualInterestRate = Double.parseDouble(annualInterestRateString);
		 double monthlyInterestRate = annualInterestRate / 1200;
		 String numberOfYearString = JOptionPane.showInputDialog(null,"Enter number of years in string: ");
		 int numberOfYear = Integer.parseInt(numberOfYearString);
		 String loanString = JOptionPane.showInputDialog(null,"Enter loan amount: ");
		 double loanAmount = Double.parseDouble(loanString);
		 double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));
		 double totalPayment = monthlyPayment * numberOfYear * 12;
		 monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		 totalPayment = (int)(totalPayment * 100) / 100.0;
		 String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
		 JOptionPane.showMessageDialog(null,output);
	}
}
