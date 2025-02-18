package com.ktdsuniversity.edu.comiccafe;

public class ComicBook {
	
	private String bookName;
	private boolean rentBook;
	
	public ComicBook(String bookName,boolean rentBook) {
		this.bookName = bookName;
		this.rentBook = rentBook;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public boolean getRentBook() {
		return this.rentBook;
	}
	/**
	 * 책을 대여:
	 * 책을 대여해주면 대여해준 책은 대여 중이라는 상태로 바뀌어야 하고, 대여를 해준 책의 권수*대여비만큼 소지금이 증가해야 함
	 * 이미 대여 중인 책이면? pass
	 * @param rentBook 책이 대여 중인지 아닌지 알려줌
	 */
	public void setRentBook(boolean rentBook) {
		this.rentBook = rentBook;
	}

}
