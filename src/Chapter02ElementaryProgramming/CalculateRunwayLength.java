package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class CalculateRunwayLength {
	public static void main(String[]arg){
		String velocityString = JOptionPane.showInputDialog("Enter the velocity:");
		double velocity = Double.parseDouble(velocityString);
		String accelerationString = JOptionPane.showInputDialog("Enter the acceleration:");
		double acceleration = Double.parseDouble(accelerationString);
		double length = (int)((Math.pow(velocity, 2) / (2 * acceleration))*1000)/1000.0;
		JOptionPane.showMessageDialog(null, "Length is " + length);
	}
}
