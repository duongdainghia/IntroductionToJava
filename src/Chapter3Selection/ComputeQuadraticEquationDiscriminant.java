package Chapter3Selection;
import java.util.Scanner;
public class ComputeQuadraticEquationDiscriminant {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;				
		if (discriminant >= 0){
			double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;			
			if(discriminant > 0){
				double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
				System.out.println("The roots are " + r1 + " and " + r2);
			}
			else
				System.out.println("The root is " + r1);
		}
		else{
			System.out.println("The equation has no real roots");
		}		
	}
}
