package algorithm;

import java.util.Arrays;

public class QuickSort {
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private int findPivot(int[] arr, int start, int end) {
		int swapIdx = start;
		int pivotValue = arr[start];
		for (int i = start + 1; i < end; i++) {
			if (pivotValue > arr[i]) {
				swapIdx++;
				this.swap(arr,  swapIdx, i);
			}
		}
		this.swap(arr,  swapIdx, start);
		return swapIdx;
	}
	
	private void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivotIdx = this.findPivot(arr,  left,  right);
			this.quickSort(arr, left, pivotIdx);
//			this.quickSort(arr, pivotIdx, right);
			this.quickSort(arr, pivotIdx + 1, right);
		}
	}
	
	public void quickSort(int[] arr) {
		this.quickSort(arr, 0, arr.length);
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] {5, 1, 2, 8, 4, 7, 6, 3};
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
