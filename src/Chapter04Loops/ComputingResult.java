package Chapter04Loops;

public class ComputingResult {
	public static void main(String[] arg) {
		double sum1 = 1;
		for(int i = 1; i <= 50000; i++) {
			sum1 += 1/i;
		}
		System.out.println("Sum from left to right: " + sum1);
		double sum2 = 1;
		for(int i = 50000; i >= 1; i--) {
			sum2 += 1/i;
		}
		System.out.println("Sum from right to left: " + sum2);
	}
}
