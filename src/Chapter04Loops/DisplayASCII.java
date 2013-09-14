package Chapter04Loops;

public class DisplayASCII {
	public static void main(String[]arg){
		//Display ASCII characters form ! to ~ (33 to 126)
		int count = 0;
		for(char ch = 33; ch < 127;ch++){
			if((count + 1) % 20 == 0)
				System.out.println(ch + " ");
			else
				System.out.print(ch + " ");
			count++;
		}
	}
}
