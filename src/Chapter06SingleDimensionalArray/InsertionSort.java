package Chapter06SingleDimensionalArray;

public class InsertionSort {
	public static void main(String[]arg){
		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		SelectionSort.printArray(list);
		insertionSortDesc(list);
		SelectionSort.printArray(list);
	}
/** The method for sorting the numbers */
public static void insertionSort(double[] list) {
	for (int i = 1; i < list.length; i++) {
		/** Insert list[i] into a sorted sublist list[0..i-1] so that
		list[0..i] is sorted. */
		double currentElement = list[i];
		int k;
		for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
			list[k + 1] = list[k];
		}
		
		// Insert the current element into list[k + 1]
		list[k + 1] = currentElement;
	}
}

public static void insertionSortDesc(double[] list) {
	for (int i = list.length - 2; i >= 0; i--) {
		/** Insert list[i] into a sorted sublist list[0..i-1] so that
		list[0..i] is sorted. */
		double currentElement = list[i];
		int k;
		for (k = i + 1; k <= (list.length - 1) && list[k] > currentElement; k++) {
			list[k - 1] = list[k];
		}
		
		// Insert the current element into list[k + 1]
		list[k - 1] = currentElement;
	}
}
}
