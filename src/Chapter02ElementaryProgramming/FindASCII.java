package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class FindASCII {
	public static void main(String[]arg){
		String characterCode = JOptionPane.showInputDialog("Enter the ASCII code (from 0 to 127):");
		int charNum = Integer.parseInt(characterCode);
		char character = (char) charNum;
		JOptionPane.showMessageDialog(null,"ASCII char for " + charNum + " is " + character);
	}
}
