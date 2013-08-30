package Chapter4Loops;

public class DisplayingPrimeNumber {
	public static void main(String[]arg){
	//bai tap: hien thi 50 so nguyen to dau tien
	//khai bao 1 bien de luu so so nguyen to: count = 0
	//chay 1 vong lap dem so nguyen to voi loop_continuation_condition la count <= 50
	//moi lan gap so nguyen to tang bien count len 1: count++
		int count = 0,num = 2;		
		while(count < 50){
			boolean prime = true;
			for(int i = 2; i <= num / 2; i++){
				if(num % i == 0){
					prime = false;				
				}					
			}
			if(prime){
				count++;
				System.out.print(num + " ");
				if(count % 10 == 0)
					System.out.println();
			}
			num++;
		}
	}
}
