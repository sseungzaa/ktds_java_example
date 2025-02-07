package com.ktdsuniversity.edu.inheritance;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact1 = new Contact("홍길동", "010-1111-2222");
		Contact contact2 = new Contact("이대길", "010-3333-4444");
		contact1.printContact();
		contact2.printContact();
		
		EmailContact emailContact1 = new EmailContact("친구1", "010-5555-6666", "friends1@naver.com");
		EmailContact emailContact2 = new EmailContact("친구2", "010-7777-8888", "friends2@naver.com");
		emailContact1.printContact();
		emailContact2.printContact();
	}

}
