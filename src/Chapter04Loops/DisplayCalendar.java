package Chapter04Loops;

import java.util.Scanner;

public class DisplayCalendar {
	public static void main(String[] arg) {
		// prompt user to enter year
		// prompt user to enter first day of the year
		// run for loop from 1 to 12
		// followed by a horizontal separator
		// followed by a line with name of the day of the week
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter first day of the year: ");
		int firstDay = input.nextInt();
		String month = "";		
		int dayNum = 31;				
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
				if (i <= 6) {
					if (i == 2) {
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
							firstDay = (firstDay + 31) % 7;
							dayNum = 29;
						} else {
							firstDay = (firstDay + 31) % 7;
							dayNum = 28;
						}
					} else {
						firstDay = (firstDay + 31) % 7;
						dayNum = 30;
					}					
				} else if (i == 8) {
					firstDay = (firstDay + 31) % 7;
					dayNum = 31;
				} else {
					firstDay = (firstDay + 30) % 7;
					dayNum = 31;
				}
			} else if (i % 2 == 1) {				
				if (i < 9) {
					if (i == 3) {
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
							firstDay = (firstDay + 29) % 7;
							dayNum = 31;
						} else {
							firstDay = (firstDay + 28) % 7;
							dayNum = 31;
						}
					} else {
						firstDay = (firstDay + 30) % 7;
						dayNum = 31;
					}					
				}else {
					firstDay = (firstDay + 31) % 7;
					dayNum = 30;
				}
			}
		}							
		int dayInt = firstDay;	
		System.out.println();
		System.out.println();
		System.out.printf("%12s%12s%12s", "", month + " 2013", "");
		System.out.println();
		System.out.printf("%36s", "____________________________________");
		System.out.println();
		System.out.printf("%36s", "   Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		System.out.println();		
		for(int j = 1; j <= dayNum; j++) {		
			if (j == 1) {
				switch(dayInt){
				case 0:	System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j); 
				break;
				case 1: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				case 2: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				case 3: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				case 4: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				case 5: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				case 6: System.out.printf("%" + (3 + 5 * dayInt) + "s%2d", "", j);
				break;
				}
			} else {
				switch(dayInt){
				case 0:					
					System.out.println();										
					System.out.printf("%3s%2d", "", j); 
				break;
				case 1: System.out.printf("%3s%2d", "", j);
				break;
				case 2: System.out.printf("%3s%2d", "", j);
				break;
				case 3: System.out.printf("%3s%2d", "", j);
				break;
				case 4: System.out.printf("%3s%2d", "", j);
				break;
				case 5: System.out.printf("%3s%2d", "", j);
				break;
				case 6: System.out.printf("%3s%2d", "", j);
				break;					
				}
			}						
			dayInt++;
			if (dayInt > 6) {
				dayInt = dayInt % 7;
			}
		}
		}					
}
}