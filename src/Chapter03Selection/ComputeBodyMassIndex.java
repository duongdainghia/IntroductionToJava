package Chapter03Selection;
import javax.swing.JOptionPane;
public class ComputeBodyMassIndex {
	public static void main(String[]arg){
		String weightInKgString = JOptionPane.showInputDialog("Enter your weight in kgs:");
		double weightInKg = Double.parseDouble(weightInKgString);								
		String heightInMeterString = JOptionPane.showInputDialog("Enter your height in meters:");
		double heightInMeter = Double.parseDouble(heightInMeterString);		
		double BMI = weightInKg / Math.pow(heightInMeter, 2);
		String result = "";
		if(BMI < 18.5)
			result = "Underweight";
		else if(BMI <= 24.9)
			result = "Normal";
		else if(BMI <= 29.9)
			result = "Overweight";
		else if(BMI >= 30.0)
			result = "Obese";
		JOptionPane.showMessageDialog(null, "BMI is " + BMI + "\n" + result);
	}
}
