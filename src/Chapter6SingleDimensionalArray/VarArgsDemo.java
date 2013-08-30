package Chapter6SingleDimensionalArray;

public class VarArgsDemo {
	public static void main(String[] args) {
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[]{1, 2, 3});
		printMax(100,200,50,9999);
		printMax(new double[]{9,8,7,4,56,1,77.89});
	}
	
	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] > result)
				result = numbers[i];
		}
		System.out.println("The max value is " + result);
	}
}
