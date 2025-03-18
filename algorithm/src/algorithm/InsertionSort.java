package algorithm;

import java.util.Arrays;

public class InsertionSort {
	private void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int currVal = arr[i];
			int j = 0;
			for (j = i - 1; j >= 0 && arr[j] > currVal; j-- ) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = currVal;
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] {5, 3, 4, 2, 1};
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
