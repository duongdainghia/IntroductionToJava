package Chapter4Loops;

public class CalculatePI {
	public static void main(String[]arg){		
		 final int NUMBER_OF_TRIALS = 1000000;
		 int numberOfHits = 0;		 
		 for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
			 double x = Math.random() * 2.0 - 1;
			 double y = Math.random() * 2.0 - 1;
			 if (x * x + y * y <= 1)
				 numberOfHits++;
		 }					
		 double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
		 System.out.println("PI is " + pi);			
	}
}
