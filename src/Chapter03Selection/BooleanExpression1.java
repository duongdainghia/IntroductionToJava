package Chapter03Selection;
import java.util.Scanner;
public class BooleanExpression1 {
	public static void main(String[]arg){
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int num = input.nextInt();		
//		if ((num >= 1 && num <= 100) || (num < 0)){
//			System.out.println(num + " is between 1 and 100 or " + num + " is negative!");
//		}
//		else
//			System.out.println(num + " is neither between 1 and 100 nor negative!");
		int x = 1;
//		if((x >= 1) && (x++ > 1)){
//			System.out.println("X = " + x);
//		}
//		else
//		{
//			System.out.println("X = " + x);
//		}
//		if((x > 1) && (x++ > 1)){
//			System.out.println("X = " + x);
//		}
//		else{
//			System.out.println("X = " + x);
//		}					
		if((x >= 1) && (++x > 1)){
			System.out.println("X = " + x);
		}
		else{
			System.out.println("X = " + x);
		}		
	}
}
