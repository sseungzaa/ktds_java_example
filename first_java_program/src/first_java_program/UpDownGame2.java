package first_java_program;

import java.util.Scanner;

public class UpDownGame2 {
	public static void main(String[] args) {
		
		// 1. 정수(난수) 생성
		int quiz = (int) (Math.random() * 100);
		
		// 2. 사용자에게 값을 입력받음 (Crtl+Shift+o)
		Scanner keyboard = new Scanner(System.in);
		
		int failCount = 0;
		
		while (true) {
			int answer = keyboard.nextInt();
			
			// 3. 난수와 사용자가 입력한 값이 같은가?
			if (quiz == answer) {
				System.out.println("정답입니다.");
				break; // 정답일 경우 무한반복 종료
			}
			
			// 난수와 사용자가 입력한 값이 틀렸을 때
			// 실패 횟수를 1 증가시킴
			
			failCount++;
			
			// 실패 횟수가 3보다 크거나 같다면 게임을 종료시킴
			if (failCount >= 3) {
				System.out.println("3회 이상 틀려서 게임을 종료합니다.");
				System.out.println("정답은 " + quiz + "(이)였습니다.");
				break;
			}
			
			// 4. 난수가 사용자가 입력한 값보다 큰가?
			// 더 크다면
			else if (quiz > answer) {
				System.out.println("Up!");
			}
			
			// 더 작다면
			else {
				System.out.println("Down!");
			}
		}
	}
}
