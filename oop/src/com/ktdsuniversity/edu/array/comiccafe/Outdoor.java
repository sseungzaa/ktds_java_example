package com.ktdsuniversity.edu.array.comiccafe;

public class Outdoor {
	
	public static void main(String[] args) {
		ComicBook[] comicBooks = new ComicBook[4];
		comicBooks[0] = new ComicBook("1권", false);
		comicBooks[1] = new ComicBook("2권",true);
		comicBooks[2] = new ComicBook("3권",false);
		comicBooks[3] = new ComicBook("4권",true);
		
		ComicCafe people = new ComicCafe(0, comicBooks);
		System.out.println("만화카페 소지금: " + people.getMoney());
		people.printAllBooks(); // <- 모든 만화책 목록 출력
		
		people.rentBook("1권");
		people.rentBook("1권");
		people.rentBook("4권");
		people.rentBook("6권");
		
		people.printAllBooks();
		people.returnBook("2권");
		people.returnBook("1권");
		people.returnBook("6권");
		
		people.printAllBooks();
		System.out.println("만화카페 소지금: " + people.getMoney());
	}

}
