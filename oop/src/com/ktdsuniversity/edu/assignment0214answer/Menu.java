package com.ktdsuniversity.edu.assignment0214answer;

import java.util.Scanner;

public class Menu {

	public static void printMenu() {
		System.out.println("기능을 선택하세요.");
		System.out.println("1. 게시글 목록 조회");
		System.out.println("2. 게시글 내용 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 댓글 등록");
		System.out.println("7. 댓글 조회");
		System.out.println("8. 댓글 삭제");
		System.out.println("0. 종료");
		System.out.println("기능 번호를 입력하세요.");
	}
	
	public static int selectMenu(Scanner sc) {
		int menuNum = sc.nextInt();
		sc.nextLine();
		if (menuNum >= 0 && menuNum <= 8) {
			return menuNum;
		}
		return -1;
	}
	
	public static int nextInt(Scanner sc) {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public static String nextLine(Scanner sc, String message, boolean isRequire) {
		System.out.print(message);
		String value = sc.nextLine();
		
		if (isRequire && (value == null || value.isBlank())) {
			while (value.isBlank()) {
				System.out.println("필수 입력값입니다. 다시 입력하세요.");
				value = sc.nextLine();
			}
		}
		
		return value;
	}
}
