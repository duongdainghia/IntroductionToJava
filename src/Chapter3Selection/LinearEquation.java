package Chapter3Selection;
import java.util.Scanner;
public class LinearEquation {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		if((a * d - b * c != 0)){
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x = " + x + "and y = " + y);
		}
		else{
			System.out.println("The equation has no solution");
		}
	}
}
