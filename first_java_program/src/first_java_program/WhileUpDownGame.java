package first_java_program;

import java.util.Scanner;

public class WhileUpDownGame {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double randomnumber = Math.random();
		int answer = (int) (randomnumber * 100);
		int value = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			value = keyboard.nextInt();
			if (answer == value) {
				System.out.println("정답입니다.");
				break; // 정답일 경우 무한반복 종료
			}
			else if (answer > value) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Down!");
			}
		}
	}
}
