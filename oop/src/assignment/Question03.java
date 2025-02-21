package assignment;

import java.util.Scanner;

/*
계산기 만들기
세 개의 파라미터를 받아 결과를 반환하는 메소드를 만들어 호출합니다.
각 파라미터는 문자열, 숫자, 숫자 로 구성되어야 합니다.

문자열 파라미터에 할당될 수 있는 값은 "+", "-", "*", "/" 이며
숫자 파라미터는 정수, 부동소수점 어느 것을 선택해도 됩니다.

만약, 문자열 파라미터에 할당된 값이 "+" 라면, 두 숫자를 더해 결과를 반환하며
"-" 라면 두 숫자를 뺀 결과를 반환하며
"*" 라면 두 숫자를 곱한 결과를 반환해야 합니다.
마지막으로 "/" 라면 두 숫자를 나눈 값을 반환해야 합니다.

계산기는 무한히 반복하며 계산할 수 있어야 하며, 매 반복시 마다
파라미터에 할당될 값을 입력할 수 있어야 합니다.

"exit" 문자열을 입력하면 반복이 종료되어 애플리케이션이 종료되어야 합니다.
*/

public class Question03 {
	
	public static int calc(String cal, int num1, int num2) {
		if (cal.equals("+")) {
			return num1 + num2;
		}
		else if (cal.equals("-")) {
			return num1 - num2;
		}
		else if (cal.equals("*")) {
			return num1 * num2;
		}
		else if (cal.equals("/")) {
			return num1 / num2;
		}
		else {
			System.out.println("없는 연산자입니다.");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cal = null;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while (true) {
			System.out.println("연산자, 숫자, 숫자를 입력 / 종료하려면 exit를 입력");
			
			cal = sc.next();
			
			if (cal.equalsIgnoreCase("exit")) {
				System.out.println("계산기 프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("첫 번째 숫자");
			num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자");
			num2 = sc.nextInt();
			
			result = calc(cal, num1 , num2);
			
			System.out.println(result);
		}
		sc.close();
	}
}
