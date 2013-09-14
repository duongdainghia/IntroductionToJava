package Chapter04Loops;

public class FindSmallest {
	public static void main(String[]arg){
		int n = 200;
		int min = n;
		while(Math.pow(n,2) > 12000){
			min = n;
			n--;
		}	
		System.out.println("Smallest n = " + min);
	}
}
