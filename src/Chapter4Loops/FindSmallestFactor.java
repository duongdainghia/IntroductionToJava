package Chapter4Loops;
import java.util.Scanner;
public class FindSmallestFactor {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		// output la uoc nho nhat cua num
		// num sau do bang num / uocNhoNhat
		while (num > 0) {
			for(int i = 2; i <= num; i++){
				if(num % i == 0){
					System.out.print(i + " ");
					num = num / i;
					break;
				}				
			}						
		}
	}
}
