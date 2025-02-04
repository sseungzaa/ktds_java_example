package com.ktdsuniversity.edu.comiccafe;

public class ComicCafe {
	
	private final int RENTAL_FEE = 500;
		
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
		System.out.println( this.comicBook2.getBookName() + " > " + this.comicBook2.getRentBook());
		System.out.println( this.comicBook3.getBookName() + " > " + this.comicBook3.getRentBook());
		System.out.println( this.comicBook4.getBookName() + " > " + this.comicBook4.getRentBook());
	}
	/**
	 * 만화책을 
	 */
	public void peopleRentBook(String bookName) {
		System.out.println("================= 만화책 대여 =================");
		if (bookName == this.comicBook1.getBookName()) {
			if (this.comicBook1.getRentBook()) {
				System.out.println(this.comicBook1.getBookName() + "은 이미 대여 중입니다.");
			}
		}
		else {
			this.comicBook1.getRentBook(true);
			this.money += this.RENTAL_FEE;
			System.out.println(this.comicBook1.getBookName() + "을 대여했습니다.");
		}
		else if (bookName == this.comicBook2.getBookName()) {
			if (this.comicBook2.getRentBook()) {
				System.out.println(this.comicBook2.getBookName() + "은 이미 대여 중입니다.");
			}
		}
		else {
			this.comicBook2.getRentBook(true);
			this.money += this.RENTAL_FEE;
			System.out.println(this.comicBook2.getBookName() + "을 대여했습니다.");
		}
		else if (bookName == this.comicBook3.getBookName()) {
			if (this.comicBook3.getRentBook()) {
				System.out.println(this.comicBook3.getBookName() + "은 이미 대여 중입니다.");
			}
		}
		else {
			this.comicBook3.getRentBook(true);
			this.money += this.RENTAL_FEE;
			System.out.println(this.comicBook3.getBookName() + "을 대여했습니다.");
		}
		else if (bookName == this.comicBook4.getBookName()) {
			if (this.comicBook4.getRentBook()) {
				System.out.println(this.comicBook4.getBookName() + "은 이미 대여 중입니다.");
			}
		}
		else {
			this.comicBook4.getRentBook(true);
			this.money += this.RENTAL_FEE;
			System.out.println(this.comicBook4.getBookName() + "을 대여했습니다.");
		}
	}
	
	public void returnBook(String bookName) {
		System.out.println("================= 만화책 반납 =================");
		if (bookName == this.comicBook1.getBookName()) {
			if(!this.comicBook1.getRentBook()) {
				System.out.println(this.comicBook1.getBookName() + "은 대여 ");
			}
		}
	}

}
