package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class BodyMassIndex {
	public static void main(String[]arg){
		String weightString = JOptionPane.showInputDialog("Enter your weight in pound:");
		double weightInPound = Double.parseDouble(weightString);
		double weightInKg = weightInPound*0.45359237;
		String heightString = JOptionPane.showInputDialog("Enter your height in inch:");
		double heightInInch = Double.parseDouble(heightString);
		double heightInMeter = heightInInch*0.0254;
		double BMI = weightInKg / Math.pow(heightInMeter,2);
		JOptionPane.showMessageDialog(null, "Your BMI is " + (int)(BMI*10000)/10000.0);
	}
}
