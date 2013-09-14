package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class MinutesToYears {
	public static void main(String[] arg){
		String minutesString = JOptionPane.showInputDialog("Enter minutes: ");
		Integer minutes = Integer.parseInt(minutesString);
		Integer years = minutes / (60 * 24 * 365);
		Integer days = (minutes / (60 * 24)) % 365;
		String output = minutesString + " minutes is approximately " + years + " years and " + days + " days";
		JOptionPane.showMessageDialog(null, output);
	}
}
