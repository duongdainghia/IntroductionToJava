package Chapter3Selection;
import java.util.Scanner;
public class Lottery {
	public static void main(String[]arg){
		int winningNumber = (int)(Math.random()*900 + 100);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit number:");
		int number = input.nextInt();
		int firstWinningNumber = winningNumber / 100;
		int secondWinningNumber = (winningNumber / 10) % 10;
		int thirdWinningNumber = winningNumber % 10; 
		int firstNumber = number / 100;
		int secondNumber = (number / 10) % 10;
		int thirdNumber = number % 10;
		if(number == winningNumber){
			System.out.println("Winning number is " + winningNumber + "\nYou win 10000$!");
		}
		else if (
				//th1
				(firstNumber == firstWinningNumber && 
				secondNumber == thirdWinningNumber &&
				thirdNumber == secondWinningNumber)||
				//th2
				(firstNumber == secondWinningNumber && 
				secondNumber == firstWinningNumber &&
				thirdNumber == thirdWinningNumber)||
				//th3
				(firstNumber == secondWinningNumber && 
				secondNumber == thirdWinningNumber &&
				thirdNumber == firstWinningNumber)||
				//th4
				(firstNumber == thirdWinningNumber && 
				secondNumber == firstWinningNumber &&
				thirdNumber == secondWinningNumber)||
				//th5
				(firstNumber == thirdWinningNumber && 
				secondNumber == firstWinningNumber &&
				thirdNumber == secondWinningNumber)){
			System.out.println("Winning number is " + winningNumber + "\nYou win 3000$!");
		}
		else if((firstNumber == firstWinningNumber || 
				firstNumber == secondWinningNumber ||
				firstNumber == thirdWinningNumber ) || 
				(secondNumber == firstWinningNumber || 
				secondNumber == secondWinningNumber ||
				secondNumber == thirdWinningNumber ) || 
				(thirdNumber == firstWinningNumber || 
				thirdNumber == secondWinningNumber ||
				thirdNumber == thirdWinningNumber )){
			System.out.println("Winning number is " + winningNumber + "\nYou win 1000$!");
		}
		else{
			System.out.println("Winning number is " + winningNumber + "\nSorry, not match!");
		}
	}
}
