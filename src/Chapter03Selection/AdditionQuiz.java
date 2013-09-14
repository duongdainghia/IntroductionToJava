package Chapter03Selection;
import java.util.Scanner;
public class AdditionQuiz {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		int result = input.nextInt();
		if(number1 + number2 == result)
			System.out.println("Correct!");
		else
			System.out.println("Wrong! Result is " + (number1 + number2) + ".");
	}
}
