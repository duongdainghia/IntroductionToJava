package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class FeetToMeter {
	public static void main(String[] arg){
		String feetString = JOptionPane.showInputDialog("Enter feet: ");
		Double feet = Double.parseDouble(feetString);
		Double meter = feet * 0.305;
		JOptionPane.showMessageDialog(null,meter);
	}
}
