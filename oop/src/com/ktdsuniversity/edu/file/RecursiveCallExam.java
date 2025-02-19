package com.ktdsuniversity.edu.file;

/**
 * Recursive Call (재귀 호출)
 *  - 메소드가 자신을 다시 호출하는 것.
 *  - a() 메소드 내부에서  a() 메소드를 다시 호출.
 */

public class RecursiveCallExam {
	
	/**
	 *  prev Stack	    now Stack		Push(Forward)     Pop(Backward)
		main	        printHello() 1	재귀 호출 중입니다: 8	  재귀 호출이 끝나는 중입니다: 8
		printHello() 1	printHello() 2	재귀 호출 중입니다: 3	  재귀 호출이 끝나는 중입니다: 3
		printHello() 2	printHello() 3	재귀 호출 중입니다: 3	  재귀 호출이 끝나는 중입니다: 3
		printHello() 3	printHello() 4	재귀 호출 중입니다: 8	  재귀 호출이 끝나는 중입니다: 8
		printHello() 4	printHello() 5	재귀 호출 중입니다: 4	  재귀 호출이 끝나는 중입니다: 4
		printHello() 5	printHello() 6	재귀 호출 중입니다: 1	  재귀 호출이 끝나는 중입니다: 1
		printHello() 6	printHello() 7	재귀 호출 중입니다: 6	  재귀 호출이 끝나는 중입니다: 6
		printHello() 7	printHello() 8	재귀 호출 중입니다: 6	  재귀 호출이 끝나는 중입니다: 6
		printHello() 8	printHello() 9	재귀 호출 중입니다: 8	  재귀 호출이 끝나는 중입니다: 8
		printHello() 9	printHello() 10	재귀 호출 중입니다: 7	  재귀 호출이 끝나는 중입니다: 7
		printHello() 10	printHello() 11	재귀 호출 중입니다: 9	  재귀 호출이 끝나는 중입니다: 9
	 */
	
	public static void printHello() {
		int randomNumber = (int)(Math.random() * 10); // 0 ~ 9
		System.out.println("재귀 호출 중입니다: " + randomNumber);
		
		// 재귀 호출의 종료는 printHello()를 다시 호출하지 않는 것.
		if (randomNumber < 9) {
			printHello();
		}
		System.out.println("재귀 호출이 끝나는 중입니다: " + randomNumber);
	}
	
	/**
	 * startNumber에서 0까지 재귀 호출을 이용해서 출력한다.
	 * @param startNumber
	 */
	public static void printNumbers(int startNumber) {
		// Call stack Push 할 때 실행
		System.out.println("현재 번호: " + startNumber);
		if (startNumber > 0) {
			printNumbers(startNumber - 1);
		}
		// Call stack Pop 할 때 실행
		System.out.println("현재 번호 출력 끝: " + startNumber);
	}
	
	/**
	 * startNumber 부터 1 까지 모두 더한 값을 조회. (재귀 호출)
	 * @param startNumber
	 * @return
	 */
	public static int addAllNumbers(int startNumber) {
		System.out.println("현재 번호: " + startNumber);
		
		int addResult = 0;
		if (startNumber > 0) {
			return startNumber;
		}
		System.out.println("더한 결과: " + addResult);
		
		return startNumber + addResult;
		//return startNumber + addAllNumbers(startNumber - 1);
	}
	
	public static void main(String[] args) {
		//printHello();
		//printNumbers(10);
		int result = addAllNumbers(3);
		System.out.println(result);
	}
}
