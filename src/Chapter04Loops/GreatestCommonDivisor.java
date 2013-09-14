package Chapter04Loops;
import java.util.Scanner;
public class GreatestCommonDivisor {
	//dien 2 so n1, n2
	//tim ra so nho hon trong 2 so vua nhap va khai bao 1 gia tri i va gan cho so nho hon
	//khai bao 1 bien gcd = 1
	//chay vong lap lui tu i den 1
	//neu n1 % k == 0 && n2 % k == 0 thi gan gcd = k
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = input.nextInt();
		System.out.println("Enter second number:");
		int n2 = input.nextInt();
		int i,gcd = 1;
		if(n1 < n2)
			i = n1;
		else
			i = n2;
//		while(i > 1){			
//			if(n1 % i == 0 && n2 % i == 0){
//				gcd = i;				
//				break;
//			}
//			i--;		
//		}
		for ( i = i;i > 1; i--){
			if(n1 % i == 0 && n2 % i == 0){
				gcd = i;
				break;
			}			
		}
//		do{
//			i--;
//			if(n1 % i == 0 && n2 % i == 0)
//				gcd = i;			
//		}while(n1 % i != 0 || n2 % i != 0);		
		System.out.println(gcd);
	}
}
