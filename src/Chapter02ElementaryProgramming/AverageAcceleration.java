package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class AverageAcceleration {
	public static void main(String[] arg){
		String startVelocityString = JOptionPane.showInputDialog("Enter starting velocity: ");
		double startVelocity = Double.parseDouble(startVelocityString);
		String endingVelocityString = JOptionPane.showInputDialog("Enter ending velocity: ");
		double endingVelocity = Double.parseDouble(endingVelocityString);
		String timeSpanString = JOptionPane.showInputDialog("Enter time span in seconds: ");
		double timeSpan = Double.parseDouble(timeSpanString);
		double averageAcceleration = (endingVelocity - startVelocity) / timeSpan;
		String output = "The average acceleration is " + (int)(averageAcceleration*10000) / 10000.0;
		JOptionPane.showMessageDialog(null,output);
	}
}
