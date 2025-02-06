package com.ktdsuniversity.edu.array.comiccafe;

public class ComicCafe {
	
	// 클래스 상수를 초기화 시키는 방법
	// 1. 클래스 상수 선언과 동시에 값 초기화
	public static final int RENT_FEE = 500;
	
	// 과거의 추세 - 클래스 상수를 클래스에 정의
	// 현재의 추세 - 인터페이스에 변수를 정의 (인터페이스의 변수 -> 상수)
	
	// 2. 클래스 상수만 선언해두고 static scope 에서 값 초기화  static {  }
	public static final int VIP_RENT_FEE;
	
	static {
		// Static scope 은 자신의 클래스가 가지고 있는 클래스 상수/변수들을 초기화 하는 목적
		// 자신의 변수/상수를 초기화하기 때문에 클래스명은 생략
		VIP_RENT_FEE = 100;
	}
	
	private int money;
	private ComicBook[] comicBooks;
	
	public ComicCafe(int money, ComicBook[] comicBooks) {
		this.money = money;
		this.comicBooks = comicBooks;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printAllBooks() {
		System.out.println("================= 보유 중인 만화책 목록 =================");
		
		ComicBook comicBook = null;
		for (int i = 0; i < this.comicBooks.length; i++) {
			comicBook = this.comicBooks[i];
			System.out.println(comicBook.getBookName() + " > " + comicBook.getRentBook());
		}
	}
	
	public void rentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");
		// this.comicBooks 배열에 있는 ComicBook 인스턴스의 이름이 bookName과 같은지 비교
		ComicBook comicBook = null;
		for (int i = 0; i < this.comicBooks.length; i++) {
			comicBook = this.comicBooks[i];
			
			if (comicBook.getBookName().equals(bookName)) {
				if (comicBook.getRentBook()) {
					System.out.println(comicBook.getBookName() + "은 이미 대여 중인 만화책입니다.");
				}
				else {
					comicBook.setRentBook(true);
					this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENT_FEE : ComicCafe.VIP_RENT_FEE;
					System.out.println(comicBook.getBookName() + "을 대여했습니다.");
				}
				return;
			}
		}
		System.out.println(bookName + "은 보유 중인 만화책이 아닙니다.");
	}
	
	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");
		// aaaaaaaaa
		ComicBook comicBook = null;
		for (int i = 0; i < this.comicBooks.length; i++) {
			comicBook = this.comicBooks[i];
			
			if (comicBook.getBookName().equals(bookName)) {
				if (!comicBook.getRentBook()) {
					System.out.println(comicBook.getBookName() + "은 대여 중인 만화책이 아닙니다.");
				}
				else {
					System.out.println(comicBook.getBookName() + "이 반납되었습니다.");
				}
				return;
			}
		}
		System.out.println(bookName + "은 보유 중인 만화책이 아닙니다.");
	}
}
