package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class SumDigitInInteger {
	public static void main(String[] arg){
		String integerString = JOptionPane.showInputDialog("Enter integer between 0 and 1000: ");
		Integer i = Integer.parseInt(integerString);
		Integer i1 = i / 1000 ;
		Integer i2 = (i / 100) % 10 ;
		Integer i3 = (i / 10) % 10 ;
		Integer i4 = i % 10 ;
		String output = "Digit's sum in integer is " + (i1 + i2 + i3 + i4);
		JOptionPane.showMessageDialog(null,output);
	}
}
