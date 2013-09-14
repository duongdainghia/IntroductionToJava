package Chapter03Selection;
import java.util.Scanner;
public class PrintRandomCharacter {
	public static void main(String[]arg){		
		for(int i=0;i<26;i++){
			char character = (char)((int)(Math.random() * 25 + 65));
			System.out.print(character + ", ");			
		}
	}
}
