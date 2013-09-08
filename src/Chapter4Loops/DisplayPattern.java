package Chapter4Loops;
import java.util.Scanner;

public class DisplayPattern {
	public static void main(String[] arg) {
		//điền số
		//khai báo biến number đặt tên bằng số
		
		//Pattern A
		//chạy vòng lặp ngoài từ i = 1 đến number
		//chạy vòng lặp trong từ j = 1 đến i
		//in ra j
		//xuống dòng, tiếp tục vòng lặp ngoài
		
		//Pattern B
		//chạy vòng lặp ngoài từ i = number đến 1
		//chạy vòng lặp trong từ j = 1 đến i
		//in ra j
		//xuống dòng, tiếp tục vòng lặp ngoài
		
		//Pattern C
		//chạy vòng lặp ngoài từ i = 1 đến number
		//printf số khoảng trống đằng trước bằng (number - i)*2
		//chạy vòng lặp trong từ j = i đến 1
		//in ra j
		//xuống dòng, tiếp tục vòng lặp ngoài
		
		//Pattern D
		//chạy vòng lặp ngoài từ i = number đến 1
		//printf số khoảng trống đằng trước bằng (number - i)*2
		//chạy vòng lặp trong từ j = 1 đến i
		//in ra j
		//xuống dòng, tiếp tục vòng lặp ngoài
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Pattern A: ");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		System.out.println("Pattern B: ");
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		System.out.println("Pattern C: ");
		for (int i = 1; i <= number; i++) {
			if (i < number) {
				System.out.printf("%" + (number - i) * 2 + "s", " ");
			}			
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		System.out.println("Pattern D: ");
		for (int i = number; i >= 1; i--) {
			if (i < number) {
				System.out.printf("%" + (number - i) * 2 + "s", " ");
			}			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
