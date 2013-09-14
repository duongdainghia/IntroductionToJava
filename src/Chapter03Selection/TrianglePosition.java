package Chapter03Selection;
import java.util.Scanner;
public class TrianglePosition {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x and y coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		//tinh dien tich tam giac lon
		double a = Math.sqrt(Math.pow(200, 2) + Math.pow(100, 2));
		double b = Math.sqrt(Math.pow(100, 2));
		double c = Math.sqrt(Math.pow(200, 2));
		double triangleArea = Math.sqrt((a + b - c) * (a - b + c) * (-a + b + c) * (a + b + c)) / 4;
		//tinh dien tich tam giac 1
		double a1 = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 100, 2));
		double b1 = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		double c1 = Math.sqrt(Math.pow(0 - 0, 2) + Math.pow(0 - 100, 2));
		double firstTriangleArea = Math.sqrt((a1 + b1 - c1) * (a1 - b1 + c1) * (-a1 + b1 + c1) * (a1 + b1 + c1)) / 4;
		//tinh dien tich tam giac 2
		double a2 = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		double b2 = Math.sqrt(Math.pow(x - 200, 2) + Math.pow(y - 0, 2));
		double c2 = Math.sqrt(Math.pow(0 - 200, 2) + Math.pow(0 - 0, 2));
		double secondTriangleArea = Math.sqrt((a2 + b2 - c2) * (a2 - b2 + c2) * (-a2 + b2 + c2) * (a2 + b2 + c2)) / 4;
		//tinh dien tich tam giac 3
		double a3 = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 100, 2));
		double b3 = Math.sqrt(Math.pow(x - 200, 2) + Math.pow(y - 0, 2));
		double c3 = Math.sqrt(Math.pow(0 - 200, 2) + Math.pow(100 - 0, 2));
		double thirdTriangleArea = Math.sqrt((a3 + b3 - c3) * (a3 - b3 + c3) * (-a3 + b3 + c3) * (a3 + b3 + c3)) / 4;		
		//kiem tra xem diem co nam trong tam giac khong
		if(firstTriangleArea + secondTriangleArea + thirdTriangleArea <= triangleArea){
			System.out.println("The point is in the triangle");
		}else{
			System.out.println("The point is not in the triangle");
		}
	}
}
