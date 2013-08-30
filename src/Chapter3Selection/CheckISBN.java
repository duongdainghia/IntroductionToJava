package Chapter3Selection;
import java.util.Scanner;
public class CheckISBN {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first 9 digits of an ISBN as integer:");
		int inputISBN = input.nextInt();
		int firstNum = inputISBN / 100000000;
		int secondNum = (inputISBN / 10000000) % 10;
		int thirdNum = (inputISBN / 1000000) % 10;
		int fourthNum = (inputISBN / 100000) % 10;
		int fifthNum = (inputISBN / 10000) % 10;
		int sixthNum = (inputISBN / 1000) % 10;
		int seventhNum = (inputISBN / 100) % 10;
		int eighthNum = (inputISBN / 10) % 10;
		int ninthNum = inputISBN % 10;
		int tenthNum = (firstNum * 1 + secondNum * 2 + thirdNum * 3 + fourthNum * 4 + fifthNum * 5 + 
						sixthNum * 6 + seventhNum * 7 + eighthNum * 8 + ninthNum * 9) % 11;
		if(tenthNum != 10)
			System.out.println("The ISBN-10 number is " + firstNum + "" + secondNum + "" + thirdNum + "" + 
								fourthNum + "" + fifthNum + "" + sixthNum + "" + seventhNum + "" + 
								eighthNum + "" + ninthNum + "" + tenthNum);
		else
			System.out.println("The ISBN-10 number is " + firstNum + "" + secondNum + "" + thirdNum + "" + 
					fourthNum + "" + fifthNum + "" + sixthNum + "" + seventhNum + "" + 
					eighthNum + "" + ninthNum + "X");
	}
}
