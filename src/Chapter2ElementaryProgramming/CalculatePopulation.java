package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class CalculatePopulation {
	public static void main(String[]arg){
		String yearIndex = JOptionPane.showInputDialog("Enter the number of years: ");
		int year = Integer.parseInt(yearIndex);
		int currentPopulation = 312032486;
		int totalSecond = year*365*24*60*60;
		int result = currentPopulation + (totalSecond/7 - totalSecond/13 + totalSecond/45);
		JOptionPane.showMessageDialog(null, "Population in the next " + year + "years is " + result);
	}
}
