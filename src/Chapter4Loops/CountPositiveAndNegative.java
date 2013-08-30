package Chapter4Loops;
import java.util.Scanner;
public class CountPositiveAndNegative {
	public static void main(String[]arg){
		//doc bien dau vao: khai bao bien i va gan bang input.nextInt
		//chay vong lap while voi continuation_condition la i != 0
		//kiem tra xem i la am hay duong
		//khai bao bien posNum va negNum de luu so phan tu duong va am
		//khai bao bien sum de tinh tong va bien varNum de tinh so phan tu
		//khi thoat khoi vong lap khai bao bien avg = sum / varNum de tinh trung binh
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int i = input.nextInt();
		int posNum = 0, negNum = 0, varNum = 0, sum = 0;
		double avg = 0;		
		while(i != 0){
			varNum++;
			if (i > 0)
				posNum++;
			else
				negNum++;
			sum += i;
			i = input.nextInt();
		}
		if (i == 0 && varNum == 0)
			System.out.println("No number are entered except 0");
		else{
			avg = (double)sum / varNum;
			System.out.println("The number of positives is " + posNum +
			"\nThe number of negatives is " + negNum +
			"\nThe total is " + sum +
			"\nThe average is " + avg);
		}
	}
}
