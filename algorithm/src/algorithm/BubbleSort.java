package algorithm;

import java.util.Arrays;

public class BubbleSort {
	public void bubbleSort(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      boolean noSwap = true;
	      for (int j = 0; j < arr.length - 1 - i; j++) {
	        if (arr[j] > arr[j+1]) {
	          int temp = arr[j];
	          arr[j] = arr[j+1];
	          arr[j+1] = temp;
	          noSwap = false;
	        }
	      }
	      if (noSwap) break; // 최적화 Best case: O(n2) => O(n)
	    }
	  }
	public static void main(String[] args) {
	    int[] numbers = new int[] {5, 3, 4, 2, 1};
	    BubbleSort bubbleSort = new BubbleSort();
	    bubbleSort.bubbleSort(numbers);
	    System.out.println(Arrays.toString(numbers));
	}
}
