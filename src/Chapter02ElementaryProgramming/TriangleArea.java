package Chapter02ElementaryProgramming;
import java.util.Scanner;
public class TriangleArea {
	public static void main(String[]arg){		
		Scanner input = new Scanner(System.in);
		System.out.println("enter side1 position:");
		double point1x = input.nextDouble();
		double point1y = input.nextDouble();		
		System.out.println("enter side2 position:");
		double point2x = input.nextDouble();
		double point2y = input.nextDouble();
		System.out.println("enter side3 position:");
		double point3x = input.nextDouble();
		double point3y = input.nextDouble();
		double side1 = Math.sqrt(Math.pow((point1x - point2x), 2) + Math.pow((point1y - point2y), 2));
		double side2 = Math.sqrt(Math.pow((point2x - point3x), 2) + Math.pow((point2y - point3y), 2));
		double side3 = Math.sqrt(Math.pow((point3x - point1x), 2) + Math.pow((point3y - point1y), 2));
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		System.out.println((int)(area*10)/10.0);
	}
}
