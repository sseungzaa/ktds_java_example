package assignment;

import java.util.Scanner;

/*
Scanner 이용.
2의 배수만 입력하는 문제를 만든다.
만약, 2의 배수가 아니거나 0 또는 음수를 입력하면
"게임을 마칩니다" 를 출력하며 반복문을 종료한다.
*/

public class Question19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while (true) {
			System.out.println("2의 배수를 입력하세요.");
			num = sc.nextInt();
			if (num % 2 != 0 || num <= 0) {
				System.out.println("게임을 마칩니다.");
				return;
			}
		}
	}
	
}
