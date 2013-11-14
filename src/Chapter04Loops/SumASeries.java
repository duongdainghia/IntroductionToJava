package Chapter04Loops;

public class SumASeries {
	public static void main(String[] arg) {
		double sum = 0;
		for (int i = 1; i < 98; i++) {
			sum += i/i+2;
		}
		System.out.println(sum);
	}
}
