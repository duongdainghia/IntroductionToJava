package Chapter03Selection;
import java.util.Scanner;
public class CheckCirclePoint {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		// de nghi nguoi dung dien toa do cua diem bat ky
		System.out.println("Enter a point with 2 coordinates:");
		int x = input.nextInt();
		int y = input.nextInt();
		int distance = (int)Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		if (distance <= 10)
			System.out.println("Point (" + x + "," + y + ") is in the circle.");
		else
			System.out.println("Point (" + x + "," + y + ") is out of the circle.");
	}
}
