package Chapter04Loops;

public class ComputePi {
	public static void main(String[] arg) {
		double pi = 0;
		for (int i = 1; i <= 10000; i++) {
			pi += Math.pow(-1, i+1) / (2*i - 1);
		}
		System.out.println("Pi with i = 10000: " + 4*pi);
				
		pi = 0;
		for (int i = 1; i <= 100000; i++) {
			pi += Math.pow(-1, i+1) / (2*i - 1);
		}
		System.out.println("Pi with i = 100000: " + 4*pi);
		
		pi = 0;
		for (int i = 1; i <= 1000000; i++) {
			pi += Math.pow(-1, i+1) / (2*i - 1);
		}
		System.out.println("Pi with i = 1000000: " + 4*pi);
		
		pi = 0;
		for (int i = 1; i <= 10000000; i++) {
			pi += Math.pow(-1, i+1) / (2*i - 1);
		}
		System.out.println("Pi with i = 10000000: " + 4*pi);
	}
}
