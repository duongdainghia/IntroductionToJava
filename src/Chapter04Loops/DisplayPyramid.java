package Chapter04Loops;
import java.util.Scanner;
public class DisplayPyramid {
	public static void main(String[] arg) {
		//đề nghị người dùng điền vào số dòng
		//đặt biến số dòng là number
		//chạy vòng lặp ngoài với i có giá trị tăng từ 1 đến number
		//chạy vòng lặp trong với j có giá trị giảm từ i đến 1
		//in ra j
		//chạy vòng lặp thứ 3 cùng vòng lặp trong với k có giá trị tăng dần từ 1 đến i
		//in ra k
		//xuống dòng, chạy tiếp vòng lặp ngoài cho đến hết
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of line: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i < number) {
				if (number >= 10) {
					if (i < 10) {
						System.out.printf("%" + ((number - i) * 2 + (number - 9)) + "s", " ");
					} else {
						System.out.printf("%" + ((number - i) * 3) + "s", " ");
					}
				} else {
					System.out.printf("%" + ((number - i) * 2) + "s", " ");
				}							
			}			
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}
}
