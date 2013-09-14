package Chapter03Selection;
import javax.swing.JOptionPane;
public class WindChillTemperature {
	public static void main(String[]arg){
		String outsideTempString = JOptionPane.showInputDialog("Enter the temerature from -58F to 41F:");
		double outsideTemp = Double.parseDouble(outsideTempString);
		String speedString =  JOptionPane.showInputDialog("Enter the wind speed in mph (>= 2):");
		double speed = Double.parseDouble(speedString);
		if((outsideTemp >= -58.0 && outsideTemp < 41.0) && speed >= 2.0){
			double windChillTemp = 35.74 + 0.6215 * outsideTemp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outsideTemp * Math.pow(speed, 0.16);
			JOptionPane.showMessageDialog(null, "Wind chill temperature is " + windChillTemp);
		}
		else{
			JOptionPane.showMessageDialog(null, "Invalid input!");
		}
	}
}
