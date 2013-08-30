package Chapter3Selection;
import javax.swing.JOptionPane;
public class SimpleIfDemo {
	public static void main(String[]arg){
		String numberString = JOptionPane.showInputDialog("Enter a number:");
		int number = Integer.parseInt(numberString);
		if(number % 5 == 0){
			JOptionPane.showMessageDialog(null, "HiFive");
		}
		if(number % 2 == 0){
			JOptionPane.showMessageDialog(null, "HiEven");
		}
	}
}
