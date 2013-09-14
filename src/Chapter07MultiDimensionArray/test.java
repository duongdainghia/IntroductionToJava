package Chapter07MultiDimensionArray;

import java.util.Date;



public class test {
	private Date date;
	public static void main(String[]arg){
		Date[] dates = new Date[10];
		for (Date d:dates) {
			System.out.println(d);
		}
//		String[][] a = new String[3][];		
//		test t= new test();
//		System.out.println(t.date);
//		int[][] test = {
//				{1,2,3,4,5},
//				{6,7,8,9},
//				{10,11,12},
//				{13,14}
//		};
//		System.out.println(test[3][1]);
		//int[][] array = new int[5][6];
		//int[] x = {1, 2};
		//array[0] = x;
		//System.out.println("array[0][1] is " + array[0][1]);
		
		//int[][] r = new int[2];
		//int[] x = new int[];
//		int[][] y = new int[3][];
//		int[][] z = {{1, 2}};
//		int[][] m = {{1, 2}, {2, 3}};
//		int[][] n = {{1, 2}, {2, 3}, };
//		System.out.println(z[0][1]);
		
//		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
//		for (int i = array.length - 1; i >= 0; i--) {
//			for (int j = array[i].length - 1; j >= 0; j--)
//				System.out.print(array[i][j] + " ");
//			System.out.println();
//		}
//		int[][] array = {{1, 2}, {3, 4}, {5, 6}};
//		int sum = 0;
//		for (int i = 0; i < array.length; i++)
//		sum += array[i][0];
//		System.out.println(sum);
//		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
//		System.out.println(m1(array)[0]);
//		System.out.println(m1(array)[1]);
	}
	
	public int[] m1(int[][] m) {
		int[] result = new int[2];
		result[0] = m.length;
		result[1] = m[0].length;
		return result;
	}
	
//	public test(int[][] array) {		
//		m1(array);
//	}
}
