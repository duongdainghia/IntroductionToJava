package Chapter4Loops;

public class FindLargest {
	public static void main(String[]arg){
		int n = 0;
		int max = n;
		while(Math.pow(n, 3) < 12000){
			max = n;
			n++;
		}		
		System.out.println("Largest number is " + max);
	}
}
