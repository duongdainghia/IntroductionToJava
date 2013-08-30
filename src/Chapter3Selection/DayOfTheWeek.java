package Chapter3Selection;
import java.util.Scanner;
public class DayOfTheWeek {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year:(e.g., 2012):");
		int y = input.nextInt();
		System.out.println("Enter month:1-12:");
		int m = input.nextInt();
		if(m == 1 || m == 2){
			m += 12;
			y -= 1;
		}
		System.out.println("Enter day of the month: 1-31:");
		int q = input.nextInt();
		int j = y / 100;
		int k = y % 100;
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j  / 4 + 5 * j) % 7;		
		String day = "";
		switch(h){
		case 0: day = "Saturday";
		break;
		case 1: day = "Sunday";
		break;
		case 2: day = "Monday";
		break;
		case 3: day = "Tuesday";
		break;
		case 4: day = "Wednesday";
		break;
		case 5: day = "Thursday";
		break;
		case 6: day = "Friday";
		break;		
		}
		System.out.println("Day of the week is " + day + ".");						
	}
}
