package Chapter4Loops;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 101);
		int guess = -1;
		while(guess != number){
			System.out.println("Enter your guess:");
			guess = input.nextInt();
			if(guess== number){
				System.out.println("Yes, the number is " + number);
			}
			else if (guess > number){
				System.out.println("Your guess is too high!");
			}
			else{
				System.out.println("Your guess is too low!");
			}
		}
		
		
	}
}
