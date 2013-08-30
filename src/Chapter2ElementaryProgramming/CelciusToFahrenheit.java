package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class CelciusToFahrenheit {
	public static void main(String[] arg){
		String CelciusString = JOptionPane.showInputDialog("Enter the Celcius: ");
		Double Celcius = Double.parseDouble(CelciusString);
		Double Fahrenheit = (9.0 / 5) * Celcius + 32;
	    String output = "Fahrenheit is " + Fahrenheit;
		JOptionPane.showMessageDialog(null,output);
	}
}
