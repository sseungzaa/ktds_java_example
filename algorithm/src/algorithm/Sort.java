package algorithm;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] numbers = {2, 4, 7, 324, 123, 6, 567, 234, 25, 65, 231, 41, 73, 534234};
		// 정렬하려면?
		Arrays.sort(numbers); // 오름차순 정렬
		
		// 1. 배열을 스트림으로 변경
		Object[] objs = Arrays.stream(numbers)
						// 2. int[] 배열을 Integer[]로 바꿈
							  .mapToObj(num -> new Integer(num))
							  .sorted((n1, n2) -> n1.compareTo(n2)) // n1 - n2 = -2
							  .toArray();
		
		System.out.println(Arrays.toString(objs));
	}
}
