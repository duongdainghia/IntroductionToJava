package Chapter03Selection;

public class BooleanExpression2 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(x < y && y < z) is " + (x < y && y < z));//true
		System.out.println("(x < y || y < z) is " + (x < y || y < z));//true
		System.out.println("!(x < y) is " + !(x < y));//false
		System.out.println("(x + y < z) is " + (x + y < z));//true		
	}
}
