package Chapter04Loops;
import java.util.Scanner;;
public class ForLoopTest {
	public static void main(String[]arg){
//		int i;
//		for(i = 0; i != 10; i++){
//			System.out.println(i);			
//		}			
//		System.out.println(i);
//		for(int i = 0; i != 10; i++){
//			System.out.println(i);			
//		}		
//		int i = 10;
//		System.out.println(i);		
//		for (int i = 1; i < 101; ++i) {			
//			System.out.println(i);			
//		}
//					
//		Scanner input = new Scanner(System.in);
//		int number, sum = 0, count;
//		for (count = 0; count < 5; count++) {
//		number = input.nextInt();
//		sum += number;
//		}
//		System.out.println("sum is " + sum);
//		System.out.println("count is " + count);
//		long sum = 0;
//		int i = 0;
//		for (int i = 0; i <= 1000; i++)
//			sum = sum + i;
//		while(i <= 1000){
//			sum = sum + i;
//			i++;
//		}
//		do{
//			sum = sum + i;
//			i++;
//		}while(
//				i <= 1000	
//				);
//		System.out.println(sum);
//		int i = 1;
//		int sum = 0;
//		while (sum < 10000) {
//			sum = sum + i;
//			i++;
//		}		
//		for(int sum = 0,i = 1; sum < 10000; i++){
//			sum += i;
//			System.out.println(sum);
//		}
//		long z = 1;
//		for (int i = 0; i < 1000; i++){
//			for (int j = 0; j < 100; j++){
//				for (int k = 0; k < 100; k++){					
//					z++;
//				}
//			}
//		}
//		System.out.println(z / Math.pow(10, 6) + " seconds");
//		for (int i = 0; i < 10; i++){
//			for (int j = 0; j < i; j++){				
//				System.out.println(i * j);
//				//j++
//			}
//			//i++
//		}
		//vi du 
//		for (int i = 1; i < 5; i++) {
//			int j = 0;
//			while (j < i) {
//				System.out.print(j + " ");
//				j++;
//			}
//		}		
		//dau ra
//		i j output
//		1 0 0
//		2 0 0
//		2 1 1
//		2 2
//		3 0 0
//		3 1 1
//		3 2 2
//		3 3
//		4 0 0
//		4 1 1
//		4 2 2
//		4 3 3
//		4 4
//		5		
		//vi du
//		int i = 0;
//		while (i < 5) {
//		for (int j = i; j > 1; j--);{
//			System.out.print(j + " ");
//		}
//		System.out.println("****");
//		i++;
//		}			
		//dau ra
//		i j output
//		0 0  ****
//		1 1  ****
//		2 2  " " 
//			 ****
//		2 1  ****
//		3 3  "  "
//			 ****
//		3 2  " " 
//		     ****
//		3 1  ****
//		4 4  "   "
//		     ****
//		3 3  "  "
//			 ****
//		3 2  " " 
//		     ****
//		3 1  ****
//		5

//	    int sum = 0;
//	    for (int i = 0; i < 100000; i++) {
//	      Scanner input = new Scanner(System.in);
//	      sum += input.nextInt();
//	    }  
		double sum = 0;
		for (double d = 0; d < 10;) {
		  d += 0.1;
		  sum += sum + d;
		}
	}
}
