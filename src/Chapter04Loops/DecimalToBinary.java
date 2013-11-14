package Chapter04Loops;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] arg) {
		//prompt user to enter integer
		//input number has following types:
		//Type 1: Math.pow(2,x)
		//Type 2: even number but not Math.pow(2,x)
		//Type 3: odd number
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a integer: ");
		int decimalNum = input.nextInt();
		if (decimalNum % 2 == 0) {
			boolean result = false;
			for (int i = 7; i >= 0; i--) {
				if (decimalNum == Math.pow(2, i)) {
					result = true;
					for (int j = 7; j >= 0; j--) {
						if (j == i) {
							System.out.print(1);
						} else {
							System.out.print(0);
						}
					}														
				}
			}			
			if (!result) {
				int sum = 0;
				while (sum != decimalNum) {
					for (int i = 7; i >= 0; i++) {
						sum += Math.pow(2, i);
						if (sum > decimalNum) {
							sum -= Math.pow(2,i);
						}
					}
				}				
			}
		} else if (decimalNum % 2 == 1) {
			if (decimalNum == 1) {
				for (int i = 1; i <= 7; i++) {
					System.out.print(0);
				}
				System.out.print(1);
			} else {
				int subNum = decimalNum - 1;
				boolean result = false;
				for (int i = 7; i >= 1; i--) {
					if (subNum == Math.pow(2, i)) {
						result = true;
						for (int j = 7; j >= 1; j--) {
							if (j == i) {
								System.out.print(1);
							} else {
								System.out.print(0);
							}
						}
						System.out.print(1);
					}
				}
				if (!result) {
					System.out.print("????????");
				}
			}			
		}
	}
}
