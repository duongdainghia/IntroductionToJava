package Chapter14ExceptionHandlingAndTextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[]arg) throws Exception {
		File file = new File("C:\\Users\\Nghia\\Documents\\My Box Files\\workspace\\IntroToJava\\src\\Chapter14ExceptionHandlingAndTextIO\\theco.txt");
		Scanner input = new Scanner(file);				
		while (input.hasNext()) {						
			System.out.println(input.nextLine());						
		}	
	}
}
