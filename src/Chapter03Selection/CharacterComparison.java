package Chapter03Selection;
import javax.swing.JOptionPane;
public class CharacterComparison {
	public static void main(String[]arg){
		String firstCharacterString = JOptionPane.showInputDialog("Enter the first character you want to compare?");
		char firstCharacter = firstCharacterString.charAt(0);
		String secondCharacterString = JOptionPane.showInputDialog("Enter the second character you want to compare?");
		char secondCharacter = secondCharacterString.charAt(0);
		JOptionPane.showMessageDialog(null, 
				firstCharacter + " > " + secondCharacter + " is " + (firstCharacter > secondCharacter) + "\n" + 
			 	firstCharacter + " >= " + secondCharacter + " is " + (firstCharacter >= secondCharacter) + "\n" + 
			 	firstCharacter + " < " + secondCharacter + " is " + (firstCharacter < secondCharacter) + "\n" +
			 	firstCharacter + " <= " + secondCharacter + " is " + (firstCharacter <= secondCharacter) + "\n" +
			 	firstCharacter + " = " + secondCharacter + " is " + (firstCharacter == secondCharacter) + "\n" + 
			 	firstCharacter + " != " + secondCharacter + " is " + (firstCharacter != secondCharacter));							
	}
}
