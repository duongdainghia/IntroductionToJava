package Chapter4Loops;

public class ConversionFromKgToPoundAndViceVersa {
	public static void main(String[]arg){		
		System.out.println("Kilograms   Pounds   |     Pounds     Kilograms");
		for(int k = 1, p = 20;((k < 200) && (p < 516));k += 2, p += 5){			
				System.out.printf("%-9d   %6.1f   |     %-6d     %6.2f\n",k,(int)((k * 2.2)*10) / 10.0,p,(int)(p * 0.453*100) / 100.0);			
		}
	}
}
