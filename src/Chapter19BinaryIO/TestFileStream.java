package Chapter19BinaryIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileStream {
	public static void main(String[]arg) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Nghia\\Documents\\My Box Files\\workspace\\IntroToJava\\src\\Chapter14ExceptionHandlingAndTextIO\\theco.txt");
		DataInputStream dataInput = new DataInputStream(file);
		
	}
}
