package com.ktdsuniversity.edu.array;

import java.util.Scanner;

import com.ktdsuniversity.edu.comiccafe.ComicBook;

public class Garage {
	
	public static void main(String[] args) {
		
		// 직접 입력한 값은 상수 - 항상 같은 메모리
		String a = "홍길동";
		String b = "홍길동";
		System.out.println(a == b);
		
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		
		System.out.println(c);
		System.out.println(c == a);
		System.out.println(c.equals(b));
		
		// 정수형 배열 -> int[], long[]
		// 실수형 배열 -> double[], float[]
		// 불린형 배열 -> boolean[]
		
		// 문자열형 배열 -> String[] stringArray = new String[4];
		//             stringArray[0] = "홍길동";
		
		ComicBook[] bookGarage = new ComicBook[4];
		bookGarage[0] = new ComicBook("1권", false);
		bookGarage[1] = new ComicBook("2권", false);
		bookGarage[2] = new ComicBook("3권", false);
		bookGarage[3] = new ComicBook("4권", false);
		
		// 모든 만화책의 이름을 출력
		for (int i = 0; i < bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			System.out.println(book.getBookName());
			book.setRentBook(true);
		//	반복이 끝난 이후에 book[0], book[1], book[2], book[3]의 setRentBook 값은? 모두 true!
		}
		
		// bookGarage 배열에서 만화책 이름이 "2권"과 "3권"인 것의 이름만 출력
		for (int i = 0; i < bookGarage.length; i++) {
			ComicBook book = bookGarage[i];
			if (book.getBookName() == "2권" || book.getBookName() == "3권") {
				System.out.println(book.getBookName());
				System.out.println(book.getRentBook());
			}
		}
		sc.close();
	}
}
