package algorithm;

import java.util.Arrays;

public class MergeSort {
	private int pushRemainValue(int[] arr, int idx, int[] merge, int mergeIdx) {
		while (idx < arr.length) {
			merge[mergeIdx] = arr[idx];
			idx++;
			mergeIdx++;
		}
		return mergeIdx;
	}
	
	private int[] merge(int[] left, int[] right) {
		int[] merge = new int[left.length + right.length];
		int leftIdx = 0;
		int rightIdx = 0;
		int mergeIdx = 0;
		
		while (leftIdx < left.length && rightIdx < right.length) {
			if (left[leftIdx] <= right[rightIdx]) {
				merge[mergeIdx] = left[leftIdx];
				leftIdx++;
			} else {
				merge[mergeIdx] = right[rightIdx];
				rightIdx++;
			}
			mergeIdx++;
		}
		
	mergeIdx = pushRemainValue(left, leftIdx, merge, mergeIdx);
	mergeIdx = pushRemainValue(right, rightIdx, merge, mergeIdx);
	return merge;
	}
	
	private int[] mergeSort(int[] arr, int start, int end) {
		if (start >= end) {
			return new int[] { arr[start] };  // Base case: when the array has one element
		}
		
	int mid = (start + end) / 2;
	int[] left = mergeSort(arr, start, mid);
	int[] right = mergeSort(arr, mid + 1, end);
	return merge(left, right);
	}
	
	/*
	private int[] mergeSort(int[] arr, int start, int end) {
		int[] splited = new int[end + 1 - start];
		if (splited.length == 1) return splited;
		int length = (splited.length) / 2;
		int[] left = mergeSort(splited, 0, length - 1);
		int[] right = mergeSort(splited, length, splited.length - 1);
		return merge(left, right);
	}
	*/
	
	public int[] mergeSort(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}
	
	public static void main(String[] args) {
		int[] array = {100, 17, 22, 53, 87, 58, 66};
		MergeSort mergeSort = new MergeSort();
		int[] result = mergeSort.mergeSort(array);
		System.out.println(Arrays.toString(result)); 
	}
}
