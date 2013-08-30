package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class ComputeCylinderVolume {
	public static void main(String[] arg){
		String radiusString = JOptionPane.showInputDialog("Enter the radius: ");
		Double radius = Double.parseDouble(radiusString);
		String lengthOfCylinderString = JOptionPane.showInputDialog("Enter the length of cylinder: ");
		Double lengthOfCylinder = Double.parseDouble(lengthOfCylinderString);
		Double area = ((int)((radius * radius * Math.PI)*10000)) / 10000.0;
		Double volume = ((int)((area * lengthOfCylinder)*100))/100.0;
		String output = "Area is " + area + 
				"\nVolume is " + volume;
		JOptionPane.showMessageDialog(null,output);
	}
}
