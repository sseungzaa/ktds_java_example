package algorithm;

import java.util.Arrays;

public class SelectionSort {
	private void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minimumIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimumIdx]) {
					minimumIdx = j;
				}
			}
			if (minimumIdx != i) {
				int temp = arr[i];
				arr[i] = arr[minimumIdx];
				arr[minimumIdx] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] {5, 3, 4, 2, 1};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
