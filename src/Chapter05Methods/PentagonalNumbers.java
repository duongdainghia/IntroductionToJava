package Chapter05Methods;

public class PentagonalNumbers {
	
	public static void main(String[] arg) {
		for (int i = 1; i <= 100; i++) {
			int num = getPentagonalNumber(i);
			if (i % 10 == 0) {
				System.out.println(num + " ");
			} else {
				System.out.print(num + " ");
			}
		}
	}
	
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
