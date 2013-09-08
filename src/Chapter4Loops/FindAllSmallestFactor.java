package Chapter4Loops;
import java.util.Scanner;

public class FindAllSmallestFactor {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.print("All smallest factors of " + number + " is: ");
		int i = 2;
		do {
			if (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;				
			} else {
				i++;
				if (number <= 1 ) {
					break;
				}
			}
		} while(i <= number);
	}
}
