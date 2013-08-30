package Chapter3Selection;
import java.util.Scanner;
public class SortThreeInteger {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		//sort three integer so that num1 <= num2 <= num3 && ||
		if(num1 <= num2){
			if(num2 <= num3){
				System.out.println(num1 + " <= " + num2 + " <= " + num3);				
			}
			else
				if(num1 <= num3)
					System.out.println(num1 + " <= " + num3 + " <= " + num2);
				else
					System.out.println(num3 + " <= " + num1 + " <= " + num2);
		}
		else{
			if(num1 >= num3){
				if(num2 <= num3)
					System.out.println(num2 + " <= " + num3 + " <= " + num1);
				else
					System.out.println(num3 + " <= " + num2 + " <= " + num1);
			}
			else{				
				System.out.println(num2 + " <= " + num1 + " <= " + num3);
			}
		}
	}
}
