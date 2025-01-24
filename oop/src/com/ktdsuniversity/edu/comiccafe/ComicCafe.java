package com.ktdsuniversity.edu.comiccafe;

public class ComicCafe {
	
	private final int RENT_FEE = 500;
		
	private int money;
	/**
	 * 카페가 보유 중인 만화책들
	 */
	private ComicBook comicBook1;
	private ComicBook comicBook2;
	private ComicBook comicBook3;
	private ComicBook comicBook4;
	private ComicBook comicBook5;
	
	public ComicCafe(ComicBook comicBook1,ComicBook comicBook2,ComicBook comicBook3,ComicBook comicBook4,ComicBook comicBook5) {
		this.comicBook1 = comicBook1;
		this.comicBook2 = comicBook2;
		this.comicBook3 = comicBook3;
		this.comicBook4 = comicBook4;
		this.comicBook5 = comicBook5;
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
			this.money += this.RENT_FEE;
			System.out.println(this.comicBook1.getBookName() + "을 대여다.");
		}
	}

}
