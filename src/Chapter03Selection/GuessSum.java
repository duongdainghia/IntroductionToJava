package Chapter03Selection;
import java.util.Scanner;
public class GuessSum {
	public static void main(String[]arg){
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int number3 = (int)(Math.random()*10);
		int winningSum = number1 + number2 + number3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sum of three one digit number:");
		int sum = input.nextInt();		
		if(sum == winningSum){
			System.out.println("Three number is " + number1 + ", " + number2 + ", " + number3 + 
					"\nWinning number is " + winningSum + "\nYou win 10000$!");
		}		
		else{
			System.out.println("Three number is " + number1 + ", " + number2 + ", " + number3 + 
					"\nWinning number is " + winningSum + "\nSorry not match!");
		}
	}
}
