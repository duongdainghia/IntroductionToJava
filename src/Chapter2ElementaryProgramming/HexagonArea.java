package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class HexagonArea {
	public static void main(String[]arg){
		String sideString = JOptionPane.showInputDialog("Enter the side of hexagon:");
		double side = Double.parseDouble(sideString);
		double area = (3*Math.sqrt(3)/2)*Math.pow(side, 2);
		JOptionPane.showMessageDialog(null, "area is "+(int)(area*10000)/10000.0);		
	}
}
