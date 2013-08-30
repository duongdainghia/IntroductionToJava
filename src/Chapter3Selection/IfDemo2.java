package Chapter3Selection;
import javax.swing.JOptionPane;
public class IfDemo2 {
	public static void main(String[]arg){
		String yString = JOptionPane.showInputDialog("Enter y:");
		boolean y = false;
		int x = 0;
		if(y = true){
			x = 1;			
		}		
		JOptionPane.showMessageDialog(null, "x = " + x);
	}
}
