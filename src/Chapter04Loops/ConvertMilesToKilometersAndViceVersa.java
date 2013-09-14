package Chapter04Loops;

public class ConvertMilesToKilometersAndViceVersa {
public static void main(String[]arg) {
	System.out.println("Miles     Kilometers   |   Kilometers     Miles");
	for (int i = 0; i < 10; i++) {		
		System.out.printf("%-5d     %-10.3f   |   %-10d     %-5.3f\n", i+1, (i+1)*1.609, i+1, (i+1)*0.621);
	}
}
}
