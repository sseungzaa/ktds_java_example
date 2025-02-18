package com.ktdsuniversity.edu.collections.list;

import java.util.List;
import java.util.ArrayList;

public class ListAndArrayListExam {
	
	public static void main(String[] args) {
		System.out.println("----------add(List에 데이터 추가)----------");
		List<Integer> scoreList1 = new ArrayList<>();
		
		scoreList1.add(100);
		scoreList1.add(90);
		scoreList1.add(80);
		scoreList1.add(95);
		scoreList1.add(85);
		
		System.out.print("배열: ");
		System.out.println(scoreList1);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList1.size());
		
		
		System.out.println("\n----------get(List 데이터 조회)----------");
		int score2 = scoreList1.get(0); // 100
		System.out.print("0번 인덱스 데이터: ");
		System.out.println(score2);
		
		score2 = scoreList1.get(1); // 90
		System.out.print("1번 인덱스 데이터: ");
		System.out.println(score2);
		
		score2 = scoreList1.get(2); // 80
		System.out.print("2번 인덱스 데이터: ");
		System.out.println(score2);
		
		score2 = scoreList1.get(3); // 95
		System.out.print("3번 인덱스 데이터: ");
		System.out.println(score2);
		
		score2 = scoreList1.get(4); // 85
		System.out.print("4번 인덱스 데이터: ");
		System.out.println(score2);
		
//		score2 = scoreList1.get(5); // IndexOutOfBoundException
//		System.out.println(score2);
		
		
		System.out.println("\n----------get(List 반복 데이터 조회)----------");
		for (int i = 0; i < scoreList1.size(); i++) {
			int score3 = scoreList1.get(i);
			System.out.println(i + "번 인덱스 데이터: " + score3);
		}
		
		
		System.out.println("\n----------remove(List 데이터 삭제)----------");
		List<Integer> scoreList2 = new ArrayList<>();
		
		scoreList2.add(100);
		scoreList2.add(90);
		scoreList2.add(80);
		scoreList2.add(95);
		scoreList2.add(85);
		
		System.out.println("--remove 실행 전--");
		System.out.print("배열: ");
		System.out.println(scoreList2);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList2.size());
		
		scoreList2.remove(2); // 80 삭제
		
		System.out.println("--2번 인덱스 remove 실행 후--");
		System.out.print("배열: ");
		System.out.println(scoreList2);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList2.size());
		
		
		System.out.println("\n----------clear(List 데이터 모두 삭제)----------");
		System.out.println("--clear 실행 전--");
		System.out.print("배열: ");
		System.out.println(scoreList2);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList2.size());
		
		scoreList2.clear(); // 모두 삭제
		
		System.out.println("--clear 실행 후--");
		System.out.print("배열: ");
		System.out.println(scoreList2);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList2.size());
		
		
		System.out.println("\n----------isEmpty(List가 비어 있는지 확인)----------");
		List<Integer> scoreList3 = new ArrayList<>();
		
		scoreList3.add(100);
		scoreList3.add(90);
		scoreList3.add(80);
		scoreList3.add(95);
		scoreList3.add(85);
		
		System.out.println("--clear 실행 전--");
		System.out.print("배열 내부가 비었는지 여부: ");
		System.out.println(scoreList3.isEmpty());
		System.out.print("배열: ");
		System.out.println(scoreList3);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList3.size());
		
		scoreList3.clear();
		
		System.out.println("--clear 실행 후--");
		System.out.print("배열 내부가 비었는지 여부: ");
		System.out.println(scoreList3.isEmpty());
		System.out.print("배열: ");
		System.out.println(scoreList3);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList3.size());
		
		
		System.out.println("\n----------contains(List 내 동일한 값 존재 여부 확인)----------");
		List<Integer> scoreList4 = new ArrayList<>();
		
		scoreList4.add(100);
		scoreList4.add(90);
		scoreList4.add(80);
		scoreList4.add(95);
		scoreList4.add(85);
		
		System.out.print("배열: ");
		System.out.println(scoreList4);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList4.size());
		
		if (!scoreList4.contains(90)) {
			scoreList4.add(90);
		}
		
		System.out.print("배열: ");
		System.out.println(scoreList4);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList4.size());
		System.out.println("-> 90이라는 값의 존재 여부를 확인했는데 이미 90이라는 값이 존재하기 때문에 아무 변화도 일어나지 않음");
		
		if (!scoreList4.contains(75)) {
			scoreList4.add(75);
		}
		
		System.out.print("배열: ");
		System.out.println(scoreList4);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList4.size());
		System.out.println("-> 75라는 값의 존재 여부를 확인했는데 75라는 값이 존재하지 않기 때문에 75라는 값이 추가됨");
		
		
		System.out.println("\n----------addAll(List 복사)----------");
		List<Integer> scoreList5 = new ArrayList<>();
		
		scoreList5.addAll(scoreList4);
		
		// 객체 고유 값(메모리 주소)
		System.out.print("객체 고유 값(메모리 주소): ");
		System.out.println(System.identityHashCode(scoreList4));
		System.out.print("배열: ");
		System.out.println(scoreList4);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList4.size());
		
		// 객체 고유 값(메모리 주소)
		System.out.print("객체 고유 값(메모리 주소): ");
		System.out.println(System.identityHashCode(scoreList5));
		System.out.print("배열: ");
		System.out.println(scoreList5);
		System.out.print("배열 내 데이터의 개수: ");
		System.out.println(scoreList5.size());
		
		/*
		// for-each
		int[] array = new int[10];
		
		// for: for-each에 비해 상대적으로 느림
		for (int i = 0; i < scoreList1.size(); i++) {
			System.out.println(scoreList1.get(i));
		}
		
		// for-each: for보다 더 빠름
		// int[] array = new int[10];
		for (int number : array) {
			System.out.println("array for-each: " + number);
		}
		
		// for를 쓸 때와 for-each를 쓸 때의 구분 케이스
		// 반복 중에 인덱스 값을 사용해야 한다면 반드시 for를 씀
		// [7, 45, 31, 23, 6, 72]
		// 배열에서 31은 몇 번 인덱스에 있나? 2번 인덱스
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 31) {
				System.out.println(array[i] + "은(는) " + i + "번 인덱스에 있습니다.");
			}
		}
		
		// List<Integer> scoreList = new ArrayList<>();
		// [100, 20, 56, 74, 96]
		// for-each
		for (int eachScore : scoreList1) {
			System.out.println(eachScore);
		}
		
		// 배열 반복 방법: for, for-each
		// 리스트 반복 방법: for, for-each
		// for-each를 사용할 수 있는 조건
		// 반복시키려는 클래스가 Interator, Iterable 인터페이스를 구현시켰을 때만 사용 가능함
		*/
	}
}
