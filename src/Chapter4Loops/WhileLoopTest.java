package Chapter4Loops;
import java.util.Scanner;
public class WhileLoopTest {	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int number, max;
//		number = input.nextInt();
//		max = number;
//		do {
//			number = input.nextInt();
//			if (number > max)
//			max = number;
//		} while (number != 0);
//		System.out.println("max is " + max);
//		System.out.println("number " + number);
		//vi du 2: while
//		Scanner input = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("Enter an integer " +
//		"(the input ends if it is 0)");
//		int number = input.nextInt();
//		while (number != 0) {
//			sum += number;
//			System.out.println("Enter an integer " +
//			"(the input ends if it is 0)");
//			number = input.nextInt();
//		}
		//vi du 2: do-while
		Scanner input = new Scanner(System.in);
		int number = 0,sum = 0;		
		do {			
			sum += number;
			System.out.println("Enter an integer " +
			"(the input ends if it is 0)");
			number = input.nextInt();			
		} while (number != 0);
	}
}
