package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class WindChillTemperature {
	public static void main(String[]arg){
		String outsideTempString = JOptionPane.showInputDialog("Enter the temerature from -58F to 41F:");
		double outsideTemp = Double.parseDouble(outsideTempString);
		String speedString =  JOptionPane.showInputDialog("Enter the wind speed in mph:");
		double speed = Double.parseDouble(speedString);
		double windChillTemp = 35.74 + 0.6215 * outsideTemp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemp * Math.pow(speed, 0.16);
		JOptionPane.showMessageDialog(null, "Wind chill temperature is " + windChillTemp);
		
	}
}
