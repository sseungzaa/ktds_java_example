package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
	//	int[] numbers = new int[6];
		int[] numbers = {56, 12, 58, 80, 1, 2};
		
		// 반복하지 않고 배열을 출력하기 -> [56, 12, 58, 80, 1, 2]
		System.out.println(Arrays.toString(numbers));
		
		// 아이템 개수만큼 반복
		for (int i = 0; i < numbers.length; i++) {
			
			// 대/소 비교를 위한 반복
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				System.out.println(numbers[j] + " > " + numbers[j + 1]);
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				}
			}
			
			System.out.println(i + "번째 반복 -> " + Arrays.toString(numbers));
		}
		
		System.out.println(Arrays.toString(numbers));
	/*	작은 수부터 순서대로 출력되도록 만들기
		-시작- [56, 12, 58, 80, 1, 2]
		1번째 반복 0,1 비교 56 > 12
			56과 12의 자리를 교환
			결과 [12, 56, 58, 80, 1, 2]
		2번째 반복 1,2 비교 56 > 58
			아무런 일도 하지 않음
			결과 [12, 56, 58, 80, 1, 2]
		3번째 반복 2,3 비교 58 > 80
			아무런 일도 하지 않음
			결과 [12, 56, 58, 80, 1, 2]
		4번째 반복 3,4 비교 80 > 1
			80과 1의 자리를 교환
			결과 [12, 56, 58, 1, 80, 2]
		5번째 반복 4,5 비교 80 > 2
			80과 2의 자리를 교환
			결과 [12, 56, 58, 1, 2, 80]
		6번째 반복 0,1 비교 12 > 56
			아무런 일도 하지 않음
			결과 [12, 56, 58, 1, 2, 80]
		7번째 반복 1,2 비교 56 > 58
			아무런 일도 하지 않음
			결과 [12, 56, 58, 1, 2, 80]
		8번째 반복 2,3 비교 58 > 1
			58과 1의 자리를 교환
			결과 [12, 56, 1, 58, 2, 80]
		9번째 반복 3,4 비교 58 > 2
			58과 2의 자리를 교환
			결과 [12, 56, 1, 2, 58, 80]
		10번째 반복 4,5 비교 58 > 80
			아무런 일도 하지 않음
			결과 [12, 56, 1, 2, 58, 80]
		11번째 반복 0,1 비교 12 > 56
			아무런 일도 하지 않음
			결과 [12, 56, 1, 2, 58, 80] 
		12번째 반복 1,2 비교 56 > 1
			56과 1의 자리를 교환
			결과 [12, 1, 56, 2, 58, 80]
		13번째 반복 2,3 비교 56 > 2
			56과 2의 자리를 교환
			결과 [12, 1, 2, 56, 58, 80]
		14번째 반복 3,4 비교 56 > 58
			아무런 일도 하지 않음
			결과 [12, 1, 2, 56, 58, 80]
		15번째 반복 4,5 비교 58 > 80
			아무런 일도 하지 않음
			결과 [12, 1, 2, 56, 58, 80]
		16번째 반복 0,1 비교 12 > 1
			12와 1의 자리를 교환
			결과 [1, 12, 2, 56, 58, 80]
		17번째 반복 1,2 비교 12 > 2
			12와 2의 자리를 교환
			결과 [1, 2, 12, 56, 58, 80]
		-종료- [1, 2, 12, 56, 58, 80]
	*/
	}

}
