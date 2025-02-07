package com.ktdsuniversity.edu.inheritance;

public class ContactMain {
	public static void main(String[] args) {
		
	//	Contact contact = new Contact("전우치", "010-1234-5678");
	//	Contact otherContact = new Contact("전우치", "010-1234-5678");
		Contact contact = new EmailContact("전우치", "010-1234-5678", "mail@naver.com");
		Contact otherContact = new EmailContact("전우치", "010-1234-5678", "mail@naver.com");
		
		System.out.println(contact); // 이름: 전우치, 연락처: 010-1234-5678
		System.out.println(otherContact); // 이름: 전우치, 연락처: 010-1234-5678
		
		System.out.println(contact == otherContact); // false
		System.out.println(contact.equals(otherContact)); // true
		
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
