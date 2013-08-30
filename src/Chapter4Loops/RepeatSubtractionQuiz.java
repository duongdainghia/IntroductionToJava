package Chapter4Loops;
import java.util.Scanner;

public class RepeatSubtractionQuiz {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);				
		int i = 0, soCauHoi = 10, cauDung = 0, cauSai = 0;
		long startTime = System.currentTimeMillis();
		String output = "";
		while (i < soCauHoi) {
			// tao ra 2 so ngau nhien tu 1 den 10 su dung Math.random()
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			// kiem tra neu so 1 < so 2 thi doi gia tri cho nhau
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			//hoi nguoi dung (so1 - so2) bang may va lay ra ket qua
			System.out.println("What is " + number1 + " - " + number2 + "?");
			// Cast ket qua sang so nguyen
			int answer = input.nextInt();
			// kiem tra ket qua
			if(answer == (number1 - number2)){
				// neu dung tra ve "ban da dung"
				System.out.println("You are correct!");
				cauDung += 1;
				output += number1 + " - " + number2 + " = " + answer + " correct.\n";
			}
			else{
				// neu sai tra ve ban da sai cung voi ket qua
				System.out.println("You are wrong, " + number1 + " - " + number2 + " = " + (number1 - number2));
				cauSai += 1;
				output += number1 + " - " + number2 + " = " + answer + " wrong.\n";
			}
			i++;			
		}
		long endTime = System.currentTimeMillis();
		long spendTime = (endTime - startTime)/1000;
		System.out.println("Correct count is " + cauDung + ".");
		System.out.println("Test time is " + spendTime + " seconds.");
		System.out.println(output);
	}
}
