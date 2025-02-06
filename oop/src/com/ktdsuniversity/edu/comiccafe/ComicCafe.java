package com.ktdsuniversity.edu.comiccafe;

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
	
	/**
	 * 카페가 보유 중인 만화책들
	 */
	private ComicBook comicBook1;
	private ComicBook comicBook2;
	private ComicBook comicBook3;
	private ComicBook comicBook4;
	
	public ComicCafe(int money, ComicBook comicBook1,ComicBook comicBook2,ComicBook comicBook3,ComicBook comicBook4) {
		this.money = money;
		this.comicBook1 = comicBook1;
		this.comicBook2 = comicBook2;
		this.comicBook3 = comicBook3;
		this.comicBook4 = comicBook4;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printAllBooks() {
		System.out.println("================= 보유 중인 만화책 목록 =================");
		System.out.println( this.comicBook1.getBookName() + " > " + this.comicBook1.getRentBook());
		System.out.println( this.comicBook2.getBookName() + " > " + this.comicBook2.getRentBook());
		System.out.println( this.comicBook3.getBookName() + " > " + this.comicBook3.getRentBook());
		System.out.println( this.comicBook4.getBookName() + " > " + this.comicBook4.getRentBook());
	}
	
	public void rentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");
		if (bookName == this.comicBook1.getBookName()) {
			if (this.comicBook1.getRentBook()) {
				System.out.println(this.comicBook1.getBookName() + "은 이미 대여 중인 만화책입니다.");
			}
			else {
				this.comicBook1.setRentBook(true);
				this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENT_FEE : ComicCafe.VIP_RENT_FEE;
				System.out.println(this.comicBook1.getBookName() + "을 대여했습니다.");
			}
		}
		else if (bookName == this.comicBook2.getBookName()) {
			if (this.comicBook2.getRentBook()) {
				System.out.println(this.comicBook2.getBookName() + "은 이미 대여 중인 만화책입니다.");
			}
			else {
				this.comicBook2.setRentBook(true);
				this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENT_FEE : ComicCafe.VIP_RENT_FEE;
				System.out.println(this.comicBook2.getBookName() + "을 대여했습니다.");
			}
		}
		else if (bookName == this.comicBook3.getBookName()) {
			if (this.comicBook3.getRentBook()) {
				System.out.println(this.comicBook3.getBookName() + "은 이미 대여 중인 만화책입니다.");
			}
			else {
				this.comicBook3.setRentBook(true);
				this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENT_FEE : ComicCafe.VIP_RENT_FEE;
				System.out.println(this.comicBook3.getBookName() + "을 대여했습니다.");
			}
		}
		else if (bookName == this.comicBook4.getBookName()) {
			if (this.comicBook4.getRentBook()) {
				System.out.println(this.comicBook4.getBookName() + "은 이미 대여 중인 만화책입니다.");
			}
			else {
				this.comicBook4.setRentBook(true);
				this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENT_FEE : ComicCafe.VIP_RENT_FEE;
				System.out.println(this.comicBook4.getBookName() + "을 대여했습니다.");
			}
		}
		else {
			System.out.println(bookName + "은 보유 중인 만화책이 아닙니다.");
		}
	}
	
	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");
		
		if (bookName == this.comicBook1.getBookName()) {
			if (!this.comicBook1.getRentBook()) {
				System.out.println(this.comicBook1.getBookName() + "은 대여 중인 만화책이 아닙니다.");
			}
			else {
				System.out.println(this.comicBook1.getBookName() + " 만화책이 반납되었습니다.");
			}
		}
		else if (bookName == this.comicBook2.getBookName()) {
			if (!this.comicBook2.getRentBook()) {
				System.out.println(this.comicBook2.getBookName() + "은 대여 중인 만화책이 아닙니다.");
			}
			else {
				System.out.println(this.comicBook2.getBookName() + " 만화책이 반납되었습니다.");
			}
		}
		else if (bookName == this.comicBook3.getBookName()) {
			if (!this.comicBook3.getRentBook()) {
				System.out.println(this.comicBook3.getBookName() + "은 대여 중인 만화책이 아닙니다.");
			}
			else {
				System.out.println(this.comicBook3.getBookName() + " 만화책이 반납되었습니다.");
			}
		}
		else if (bookName == this.comicBook4.getBookName()) {
			if (!this.comicBook4.getRentBook()) {
				System.out.println(this.comicBook4.getBookName() + "은 대여 중인 만화책이 아닙니다.");
			}
			else {
				System.out.println(this.comicBook4.getBookName() + " 만화책이 반납되었습니다.");
			}
		}
		else {
			System.out.println(bookName + "은 보유 중인 만화책이 아닙니다.");
		}
	}
}
