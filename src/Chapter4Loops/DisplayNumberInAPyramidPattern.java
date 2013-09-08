package Chapter4Loops;

import java.util.Scanner;

public class DisplayNumberInAPyramidPattern {
	public static void main(String[] arg) {
		//người dùng điền vào số
		//gán số đó bằng number
		//chạy vòng lặp ngoài với i có giá trị từ 0 đến number
		//chạy vòng lặp trong với j có giá trị từ 0 đến i - 1
		//in ra 2 mũ j
		//chạy vòng lặp cùng cấp với vòng lặp trong với k có giá trị từ i về 0
		//in ra 2 mũ k
		//xuống dòng, tiếp tục vòng lặp ngoài
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of line: ");
		int number = input.nextInt();
		for (int i = 0; i < number; i++) {
			if (i < number - 1) {
				System.out.printf("%" + ((number - i - 1) * 4) + "s", " ");							
			}			
			for (int j = 0; j < i; j++) {
				if (i > 3) {
					if (j > 3) {
						if (j > 6) {
							System.out.print(" " + (int)Math.pow(2, j));
						} else {
							System.out.print("  " + (int)Math.pow(2, j));
						}
					} else {
						System.out.print("   " + (int)Math.pow(2, j));
					}
				} else {
					System.out.print("   " + (int)Math.pow(2, j));
				}
			}
			
			for (int k = i; k >= 0; k--) {
				if (i > 3) {
					if (k > 3) {
						if (k > 6) {
							System.out.print(" " + (int)Math.pow(2, k));
						} else {
							System.out.print("  " + (int)Math.pow(2, k));
						}
					} else {
						System.out.print("   " + (int)Math.pow(2, k));
					}
				} else {
					System.out.print("   " + (int)Math.pow(2, k));
				}				
			}
			System.out.println("");
		}
	}
}
