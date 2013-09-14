package Chapter04Loops;

public class DivisibleBy5and6 {
	public static void main(String[]arg){
//		int count = 0;
//		for(int i = 100; i < 1001; i++){
//			if (i % 5 == 0 && i % 6 == 0){
//				if ((count + 1) % 10 == 0)
//					System.out.println(i + " ");
//				else
//					System.out.print(i + " ");
//				count++;	
//			}			
//		}
		int count = 0;
		for(int i = 100; i < 201; i++){
			if (i % 5 == 0 ^ i % 6 == 0){
				if ((count + 1) % 10 == 0)
					System.out.println(i + " ");
				else
					System.out.print(i + " ");
				count++;	
			}			
		}
	}
}
