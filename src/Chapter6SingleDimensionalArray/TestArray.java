package Chapter6SingleDimensionalArray;

public class TestArray {
	public static void main(String[]arg){
//		double[] test = {11.1,2.2,3.3,4.4,5.5,1.6,7.7,8.8,9.9,10.1};
//		test[test.length - 1] = 5.5;		
		//System.out.println(test[0] + test[1]);
//		double sum = 0;
//		for(double i:test){
//			sum += i;
//		}
//		System.out.println(sum);
//		double min = test[0];
//		int minPos = 0;
//		for(int i = 0;i < test.length;i++){
//			if (test[i] < min){
//				min = test[i];
//				minPos = i;
//			}
//		}
//		System.out.println("Min = " + min);
//		System.out.println("Min position = " + minPos);
//		int randomIndex = (int)(Math.random() * test.length);
//		System.out.println(test[randomIndex]);
//		double[] test2 = {3.5,5.5,4.52,5.6};
//		System.out.println(test[test.length]);
//		int[] source = {3,4,5};
//		int[] t = new int[source.length];
//		System.arraycopy(source, 0, t, 0, source.length);
//		for(int i:t){
//			System.out.print(i + " ");
//		}
		
//		int[] myList;
//		myList = new int[10];
//		myList = new int[20];
//		System.out.print(myList.length);
		
//		int number = 0;
//		int[] numbers = new int[1];
//		m(number, numbers);
//		System.out.println("number is " + number
//		+ " and numbers[0] is " + numbers[0]);		
//		xMethod(new double[]{3, 3});
//	    xMethod(new double[5]);
	    int[] a = {5,3,6,4,1,0175};
	    //int b = java.util.Arrays.binarySearch(a,5);
	    System.out.println(java.util.Arrays.toString(a));
	    
//		final int[] list = {1, 2, 3, 4, 05};
//		list = new int[2];
//		System.out.println(list[4]);
		//list = reverse(list);
//		reverse(list);
//		for (int i = 0; i < list.length; i++)
//			System.out.print(list[i] + " ");
	}
	
	public static int[] xMethod(double[] a) {
	    return new int[]{1,2,3};	    
	}
	
	public static void m(int x, int[] y) {
		x = 3;
		y[0] = 3;
	}
	
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		
		for (int i = 0; i < list.length; i++)
			newList[i] = list[list.length - 1 - i];
		
		list = newList;
		//return list;
	}
}
