package com.ktdsuniversity.edu.array;

public class ScoreArray {
	
	public static void main(String[] args) {
		
		// 배열 아이템의 개수를 7개로 제한
		// 최대 7개의 값만 할당 가능한 배열
	//	int[] scoreArray = new int[7]; // Java style
	//	int scoreArray[] = new int[7]; // C style(사용x)
		
		// 배열 아이템의 개수가 확정되지 않은 상태
		// {} 중괄호 내부에 작성한 테이터의 개수가 배열의 개수가 됨
		/* 예시) int[] scoreArray2 = {100, 200, 300, 400, 500};
		   --> 5개의 아이템을 가지는 배열, 동시에 인덱스에도 값이 할당된 상태 */
	//	int[] scoreArray2 = {};
	//	int scoreArray2[] = {}; // 사용x
		
		int[] scoreArray = new int[7]; // 0 ~ 6 인덱스로 접근 가능
		scoreArray[0] = 50;
		scoreArray[1] = 70;
		scoreArray[2] = 65;
		scoreArray[3] = 95;
		scoreArray[4] = 55;
		scoreArray[5] = 70;
		scoreArray[6] = 40;
	//	scoreArray[7] = 40; // ArrayIndexOutOfBoundsException 에러 발생
		
		// 배열 순회하며 출력
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(i + " -> " + scoreArray[i]);
		}
		
		// 배열 순회하며 5점씩 더하기
		for (int i = 0; i < scoreArray.length; i++) {
			scoreArray[i] += 5;
		}
		
		// 배열 순회하며 합계 구하기
		int add = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			add += scoreArray[i];
			System.out.println("합계: " + add);
		}
		
		// 평균 구하기
		double average = add / (double) scoreArray.length;
		System.out.println("평균: " + average);
	}

}
