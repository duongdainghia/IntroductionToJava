package Chapter3Selection;

public class MathRandom {
	public static void main(String[]arg){
		int num1 = (int)(Math.random() * 20);
		int num2 = (int)(Math.random() * 10 + 10);
		int num3 = (int)(Math.random() * 40 + 10 + Math.random());		
		System.out.println(num3);
	}
}
