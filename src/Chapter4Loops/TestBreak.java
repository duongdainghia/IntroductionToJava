package Chapter4Loops;

public class TestBreak {
	public static void main(String[] args) {
//		int sum = 0;
//		int number = 0;
//		boolean check = false;
//		while (number < 20) {
//			number++;
//			if (!check){			
//				sum += number;
//			}						
//			//break;
//			check = (sum >= 100);			
//		}		
//		System.out.println("The number is " + number);
//		System.out.println("The sum is " + sum);
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					break;
				System.out.println(i * j);
			}
		System.out.println(i);
		//break;
		}
	}
}