package Chapter02ElementaryProgramming;
import javax.swing.JOptionPane;
public class FindCharNumber {
		public static void main(String[]arg){
			String characterCode = JOptionPane.showInputDialog("Enter the ASCII character:");
//			char character = characterCode.charAt(0);
//			int charNum = (int)character;
			int charNum = characterCode.charAt(0);
			JOptionPane.showMessageDialog(null,"ASCII char for " + characterCode + " is " + charNum);
		}
}
