package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class BodyMassIndex2 {
	public static void main(String[]arg){
		String weightString = JOptionPane.showInputDialog("Enter your weight in kg:");
		double weightInKg = Double.parseDouble(weightString);		
		String heightString = JOptionPane.showInputDialog("Enter your height in meter:");
		double heightInMeter = Double.parseDouble(heightString);		
		double BMI = weightInKg / Math.pow(heightInMeter,2);
		JOptionPane.showMessageDialog(null, "Your BMI is " + (int)(BMI*10000)/10000.0);
	}
}

