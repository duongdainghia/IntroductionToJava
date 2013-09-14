package Chapter03Selection;
import java.util.Scanner;
public class ChineseZodiac {
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();			
		switch(year % 12){
		case  0: System.out.println(year + " is year of monkey!");
		break;
		case  1: System.out.println(year + " is year of rooster!");
		break;
		case  2: System.out.println(year + " is year of dog!");
		break;
		case  3: System.out.println(year + " is year of pig!");
		break;
		case  4: System.out.println(year + " is year of rat!");
		break;
		case  5: System.out.println(year + " is year of ox!");
		break;
		case  6: System.out.println(year + " is year of tiger!");
		break;
		case  7: System.out.println(year + " is year of rabbit!");
		break;
		case  8: System.out.println(year + " is year of dragon!");
		break;
		case  9: System.out.println(year + " is year of snake!");
		break;
		case  10: System.out.println(year + " is year of horse!");
		break;
		case  11: System.out.println(year + " is year of sheep!");
		break;		
		}					 
	}
}
