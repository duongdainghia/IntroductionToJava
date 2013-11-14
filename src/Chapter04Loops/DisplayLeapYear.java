package Chapter04Loops;

public class DisplayLeapYear {
	public static void main(String[] arg) {
		System.out.println("Leap year from 2001 to 2100: ");
		int count = 0;
		for(int i = 2001; i <= 2100; i++) {
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}					
		}
	}
}
