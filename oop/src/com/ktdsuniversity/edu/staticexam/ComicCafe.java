package com.ktdsuniversity.edu.staticexam;

public class ComicCafe {
	
	// 1. 클래스 상수 선언과 동시에 값 초기화
	public static final int RENTAL_FEE;
	
	// 2. 클래스 상수만 선언해두고 static scope에서 값 초기화
	private static final int VIP_RENTAL_FEE;
	
	// 클래스 상수,변수들을 초기화하기 위한 영역
	// 한 클래스에 하나의 static scope만 사용할 수 있음
	static {
		// static scope는 자신의 클래스가 가지고 있는 클래스 상수,변수들을 초기화하는 목적
		// 자신의 변수,상수를 초기화하기 때문에 클래스명은 생략
		
	
	
	private int money;
	/**
	 * 카페가 보유 중인 만화책들
	 */
	private ComicBook comicBook1;
	private ComicBook comicBook2;
	private ComicBook comicBook3;
	private ComicBook comicBook4;
	
	public ComicCafe(int money, ComicBook comicBook1,ComicBook comicBook2,ComicBook comicBook3,ComicBook comicBook4) {
		this.comicBook1 = comicBook1;
		this.comicBook2 = comicBook2;
		this.comicBook3 = comicBook3;
		this.comicBook4 = comicBook4;
		
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printAllBooks() {
		System.out.println("================= 보유중인 만화책 목록 =================");
		System.out.println( this.comicBook1.getBookName() + " > " + this.comicBook1.getRentBook());
	}
	/**
	 * 만화책을 
	 */
	public void peopleRentBook(String bookName) {
		if (bookName == this.comicBook1.getBookName()) {
			if (this.comicBook1.getRentBook()) {
				System.out.println(this.comicBook1.getBookName() + "은 이미 대여 중입니다.");
			}
		}
		else {
			this.comicBook1.getRentBook(true);
			this.money += (int)(Math.random() * 2) == 0 ? ComicCafe.RENTAL_FEE : ComicCafe.VIP_RENTAL_FEE;
			System.out.println(this.comicBook1.getBookName() + "을 대여다.");
		}
	}

}

}
