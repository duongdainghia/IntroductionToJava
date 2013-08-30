package Chapter4Loops;
import java.util.Scanner;
public class SentinelValue {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer (The input end if it is 0): ");
		int data = input.nextInt();
		int sum = 0;
		while(data != 0){
			sum += data;
			System.out.println("Enter an integer (The input end if it is 0): ");
			data = input.nextInt();			
		}
		System.out.println("Sum is " + sum);
	}
}
