package Chapter04Loops;

import java.util.Scanner;

public class DisplayFirstDayOfEachMonth {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter first day of the year: ");
		int day = input.nextInt();		
		String month = "";
		String dayString = "";
		for (int i = 1; i <= 12; i++) {			
			switch(i){
				case 1: month = "January";
				break;
				case 2: month = "Febuary";
				break;
				case 3: month = "March";
				break;
				case 4: month = "April";
				break;
				case 5: month = "May";
				break;
				case 6: month = "June";
				break;
				case 7: month = "July";
				break;
				case 8: month = "August";
				break;
				case 9: month = "September";
				break;
				case 10: month = "October";
				break;
				case 11: month = "November";
				break;
				case 12: month = "December";
				break;
			}
		if (i > 1) {
			if (i % 2 == 0) {
				if (i <= 6 || i == 8) {
					day = (day + 31) % 7; 
				} else {
					day = (day + 30) % 7;
				}
			} else if (i % 2 == 1) {				
				if (i < 9) {
					if (i == 3) {
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
							day = (day + 29) % 7;
						} else {
							day = (day + 28) % 7;
						}
					} else {
						day = (day + 30) % 7;
					}					
				}else {
					day = (day + 31) % 7;
				}
			}
		}					
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
		System.out.println(month + " 1, " + year + " is " + dayString);
		}
	}
}
