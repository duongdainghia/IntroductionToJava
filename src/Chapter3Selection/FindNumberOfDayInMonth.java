package Chapter3Selection;
import java.util.Scanner;
public class FindNumberOfDayInMonth {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month and year:");
		int month = input.nextInt();
		int year = input.nextInt();
		int day = 0;
		String monthString = "";
		switch(month){
		case 1: monthString = "January";
				day = 31;
		break;
		case 2: monthString = "Febuary";
				day =28;
		break;
		case 3: monthString = "March";
				day = 31;
		break;
		case 4: monthString = "April";
				day = 30;
		break;
		case 5: monthString = "May";
				day =31;
		break;
		case 6: monthString = "June";
				day =30;
		break;
		case 7: monthString = "July";
				day = 31;
		break;
		case 8: monthString = "August";
				day = 31;
		break;
		case 9: monthString = "September";
				day = 30;
		break;
		case 10: monthString = "October";
				day = 31;
		break;
		case 11: monthString = "November";
				day = 30;
		break;
		case 12: monthString = "December";
				day = 31;
		break;
		}
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			if(month == 2)				
				day = 29;
		}
		System.out.println(monthString + " " + year + " has " + day + " days.");
	}
}
