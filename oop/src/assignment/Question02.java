package assignment;

import java.util.Scanner;

/*
무한 구구단을 출력합니다.
사용자가 입력한 구구단의 결과를 출력합니다.
만약, 3을 입력했다면, 구구단 3단을 출력합니다.
만약, -1을 입력했다면, 구구단 출력 프로그램을 종료해야합니다.
*/

public class Question02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		while(true) {
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for (i = 1; i < 10; i++) {
				System.out.println(num + " x " + i + " = "  + num * i);
			}
		}				
	}
}
