package Chapter10ThinkAboutObject;

public class test {
	private int i;
	private int j;
public static void main(String[] args) {
//		int i = 2;
//		int k = 3;
//		{
//			int j = 3;
//			System.out.println("i + j is " + (i + j));
//		}
//		k = i + j;
//		System.out.println("k is " + k);
//		System.out.println("j is " + j);
		test t = new test(1,2);		
}
	
	public test(int i1, int j1){
		i = i1;
		j = j1;
		test2();
	}
	
	private void test2() {
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("test2 function.");
	}
}
