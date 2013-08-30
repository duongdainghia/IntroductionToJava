package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class GratuityAndTotal {
	public static void main(String[] arg){
		String subtotalString = JOptionPane.showInputDialog("Enter subtotal: ");
		Double subtotal = Double.parseDouble(subtotalString);
		String gratuityRateString = JOptionPane.showInputDialog("Enter gratuity rate: ");
		Double gratuityRate = Double.parseDouble(gratuityRateString);
		Double gratuity = subtotal * gratuityRate / 100;
		Double total = subtotal + gratuity;
		String output = "Gratuity is " + gratuity +
				"\nTotal is " + total;
		JOptionPane.showMessageDialog(null, output);
	}
}
