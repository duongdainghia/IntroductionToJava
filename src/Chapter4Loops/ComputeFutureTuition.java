package Chapter4Loops;

public class ComputeFutureTuition {
	public static void main(String[]arg){
		double tuition = 10000;
		double sum = 10000;
		for(int i = 1;i < 10;i++){
			tuition = tuition * 1.05;
			sum += tuition;
		}
		System.out.println("The tuition in ten year from now is " + (int)(sum * 100) / 100.0);		
		double fourYearCost = 0;
		for(int i = 0;i < 4;i++){
			tuition = tuition * 1.05;
			fourYearCost += tuition;
		}
		System.out.println("The cost for four year starting ten year from now is " + (int)(fourYearCost * 100) / 100.0);
	}
}
