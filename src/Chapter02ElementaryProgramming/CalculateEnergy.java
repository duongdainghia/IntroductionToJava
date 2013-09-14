package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class CalculateEnergy {
	public static void main(String[]arg){
		String inputWaterString = JOptionPane.showInputDialog("dien vao so luong nuoc (kg):");
		double inputWater = Double.parseDouble(inputWaterString);
		String inputInitTempString = JOptionPane.showInputDialog("dien vao nhiet do bat dau:");
		double inputInitTemp = Double.parseDouble(inputInitTempString);
		String inputFinalTempString = JOptionPane.showInputDialog("dien vao nhiet do ket thuc:");
		double inputFinalTemp = Double.parseDouble(inputFinalTempString);
		double Energy = inputWater * (inputFinalTemp - inputInitTemp) * 4184;
		JOptionPane.showMessageDialog(null, "Energy need to heat water is " + Energy);
	}		
}
