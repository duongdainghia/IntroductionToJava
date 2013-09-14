package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class SavingAccount {
	public static void main(String[]arg){
		String amountString = JOptionPane.showInputDialog("Enter saving amount every month: ");
		double amount = Double.parseDouble(amountString);
		double monthlyRate = 0.05 / 12;
		double firstMonthAmount = amount + amount*monthlyRate;
		double secondMonthAmount = (amount + firstMonthAmount) + (amount + firstMonthAmount)*monthlyRate;
		double thirdMonthAmount = (amount + secondMonthAmount) + (amount + secondMonthAmount)*monthlyRate;
		double fourthMonthAmount = (amount + thirdMonthAmount) + (amount + thirdMonthAmount)*monthlyRate;
		double fifthMonthAmount = (amount + fourthMonthAmount) + (amount + fourthMonthAmount)*monthlyRate;
		double sixMonthAmount = (amount + fifthMonthAmount) + (amount + fifthMonthAmount)*monthlyRate;
		JOptionPane.showMessageDialog(null, "Your account amount after six month is " + (int)(sixMonthAmount*100)/100.0);
	}
}
