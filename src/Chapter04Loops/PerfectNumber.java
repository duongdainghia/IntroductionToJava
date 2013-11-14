package Chapter04Loops;

public class PerfectNumber {
	public static void main(String[] arg) {
		//A positive number is called a perfect number if it is equal to the sum of all its positive divisors, excluding itself.
		System.out.print("Perfect numbers less than 10000 are:");
		for (int i = 1; i < 10000; i++) {
			int sum = 0;
			for (int j =i-1; j >= 1; j--) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}
}
