package com.ktdsuniversity.edu.string;

import java.util.Scanner;

public class WordRelayGame {
	
	public static void testStringBuffer() {
		
		StringBuffer textBuffer = new StringBuffer();
		
		// 버퍼에 문자열들을 채움
		textBuffer.append(10.0f);
		textBuffer.append(false);
		textBuffer.append(true);
		textBuffer.append('a');
		textBuffer.append("adflkjasdf");
		
		// 버퍼에 있는 내용들을 하나의 스트링으로 모아줌
		String text = textBuffer.toString();
		
		// 출력
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		
		// 1. 시작 단어 제시
		String startWord = "자전거";
		
		int wordLength = 0;
		String endLetter = null;
		Scanner sc = new Scanner(System.in);
		String nextWord = null;
		int relayCount = 0;
		StringBuffer wordBuffer = new StringBuffer();
		
		while (true) {
			// 2. 시작 단어에서 마지막 글자를 추출
			wordLength = startWord.length(); // 시작 단어의 길이를 구함
			endLetter = startWord.substring(wordLength - 1); // 시작 단어의 마지막 글자를 추출
			
			// 3. 사용자로부터 다음 단어를 입력받음
			System.out.println("제시 단어: " + startWord);
			System.out.println("다음 단어를 입력하세요.");
			
			nextWord = sc.nextLine(); // 다음 단어를 입력받음
			nextWord = nextWord.trim(); // 좌우 공백을 제거한 다음 단어를 할당받음
			
			/*
			// 4.다음 단어가 시작 단어의 마지막 글자로 시작하는가?
			if (nextWord.startsWith(endLetter)) {
				// 5. 다음 단어가 3글자 이상인가?
				if (nextWord.length() >= 3) {
					// 6. 다음 단어를 시작 단어로 옮김
					startWord = nextWord;
					// 7. 이어나간 단어의 수를 1 증가시킴
					relayCount++;
				}
				else {
					System.out.println("게임이 종료되었습니다.");
					System.out.println("총 " + relayCount + "번 이어나갔습니다.");
					return;
				}
			}
			else {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총 " + relayCount + "번 이어나갔습니다.");
				return;
			}
			*/
			
			// 더 짧게 줄인 코드
			// 4.다음 단어가 시작 단어의 마지막 글자로 시작하는가?
			// 5. 다음 단어가 3글자 이상인가?
			if (nextWord.startsWith(endLetter) && nextWord.length() >= 3) {
				// 6. 다음 단어를 시작 단어로 옮김
				startWord = nextWord;
				// 7. 이어나간 단어의 수를 1 증가시킴
				relayCount++;
				//8. 다음 단어를 버퍼에 넣음
				wordBuffer.append(startWord);
				wordBuffer.append("\n");
			}
			else {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총 " + relayCount + "번 이어나갔습니다.");
				System.out.println("이어나간 단어들입니다.");
				System.out.println(wordBuffer.toString());
				return;
			}
			// sc.close();
		}
	}
}
