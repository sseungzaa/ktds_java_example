package com.ktdsuniversity.edu.comiccafe;

public class Outdoor {
	
	public static void main(String[] args) {
		ComicBook comic1 = new ComicBook("1권",false);
		ComicBook comic2 = new ComicBook("2권",true);
		ComicBook comic3 = new ComicBook("3권",false);
		ComicBook comic4 = new ComicBook("4권",true);
		ComicBook comic5 = new ComicBook("5권",false);
		
		ComicCafe people = new ComicCafe(0,comic1,comic2,comic3,comic4,comic5);
		System.out.println("만화카페 소지금: " + people.getMoney());
		// people.printAllBooks(); <- 모든 만화책 목록 출력
		
		/* 만화책 반납
		people.rentBook("1권");
		people.rentBook("1권");
		people.rentBook("4권");
		people.rentBook("6권");
		
		// people.printAllBooks();
		people.returnBook("2권");
		people.returnBook("1권");
		people.returnBook("6권");
		*/
		// people.printAllBooks();
		System.out.println("만화카페 소지금: " + people.getMoney());
	}

}
