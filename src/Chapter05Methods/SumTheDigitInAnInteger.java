package Chapter05Methods;

import java.util.Scanner;

public class SumTheDigitInAnInteger {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long num = input.nextLong();		
		System.out.print("Sum is: " + sumDigits(num));
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
}
