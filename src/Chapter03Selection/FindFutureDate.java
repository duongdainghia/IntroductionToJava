package Chapter03Selection;
import java.util.Scanner;
public class FindFutureDate {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int day = input.nextInt();
		String dayString = "";
		switch(day){
			case 0: dayString = "Sunday";
			break;
			case 1: dayString = "Monday";
			break;
			case 2: dayString = "Tuesday";
			break;
			case 3: dayString = "Wednesday";
			break;
			case 4: dayString = "Thursday";
			break;
			case 5: dayString = "Friday";
			break;
			case 6: dayString = "Saturday";
			break;
		}
		
		System.out.println("Enter the number of the day elapsed since today: ");
		int dayElapsed = input.nextInt();
		int futureDay = (day + dayElapsed) % 7;
		String futureDayString = "";
		switch(futureDay){
			case 0: futureDayString = "Sunday";
			break;
			case 1: futureDayString = "Monday";
			break;
			case 2: futureDayString = "Tuesday";
			break;
			case 3: futureDayString = "Wednesday";
			break;
			case 4: futureDayString = "Thursday";
			break;
			case 5: futureDayString = "Friday";
			break;
			case 6: futureDayString = "Saturday";
			break;
		}
		
		System.out.println("Today is " + dayString + " and the future day is " + futureDayString);
	}
}
