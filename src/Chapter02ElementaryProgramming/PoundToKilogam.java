package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class PoundToKilogam {
	public static void main(String[] arg){
		String poundString = JOptionPane.showInputDialog("Enter pound: ");
		Double pound = Double.parseDouble(poundString);
		Double kg = 0.454 * pound;
		String output = "kg is " + kg;
		JOptionPane.showMessageDialog(null,output);
	}
}
