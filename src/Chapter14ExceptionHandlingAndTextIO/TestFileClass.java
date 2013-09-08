package Chapter14ExceptionHandlingAndTextIO;

import java.io.File;

public class TestFileClass {
	public static void main(String[]arg) {
		File file = new File("C:\\Users\\Nghia\\Documents\\My Box Files\\workspace\\IntroToJava\\src\\Chapter14ExceptionHandlingAndTextIO\\theco.txt");
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be write? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}
}