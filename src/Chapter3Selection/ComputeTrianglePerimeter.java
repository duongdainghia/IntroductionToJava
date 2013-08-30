package Chapter3Selection;
import java.util.Scanner;
public class ComputeTrianglePerimeter {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 edges of triangle:");
		int angle1 = input.nextInt();
		int angle2 = input.nextInt();
		int angle3 = input.nextInt();
		if((angle1 + angle2 > angle3) && 
			(angle1 + angle3 > angle2) && 
			(angle2 + angle3 > angle1)){
			int perimeter = angle1 + angle2 + angle3;
			System.out.println("Perimeter is " + perimeter);
		}
		else{
			System.out.println("Input numbers are invalid!");
		}
	}
}
