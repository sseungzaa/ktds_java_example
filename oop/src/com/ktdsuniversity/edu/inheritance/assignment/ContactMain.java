package com.ktdsuniversity.edu.inheritance.assignment;

public class ContactMain {

	public static void main(String[] args) {
		
		// ContactApp 클래스 타입으로
		// ca라는 이름의 인스턴스를 생성 (생성자 호출)
		// 8은 직접 설정한 최대 연락처 개수
		ContactApp ca = new ContactApp(8);
		
		Contact contact1 = new Contact(5, "유재석", "010-5555-5555", "p5.jpg");
		Contact contact2 = new AdditionalContact(4, "박명수", "010-4444-4444", "p4.jpg", "1970-09-27", "무한상사", "차장", "서울");
		Contact contact3 = new Contact(6, "정준하", "010-6666-6666", "p6.jpg");
		Contact contact4 = new AdditionalContact(7, "정형돈", "010-7777-7777", "p7.jpg", "1978-03-15", "무한상사", "대리", "서울");
		Contact contact5 = new Contact(3, "노홍철", "010-3333-3333", "p3.jpg");
		Contact contact6 = new AdditionalContact(8, "하동훈", "010-8888-8888", "p8.jpg", "1979-08-20", "무한상사", "사원", "서울");
		
		System.out.println(contact1);
		System.out.println(contact2);
		System.out.println(contact3);
		System.out.println(contact4);
		System.out.println(contact5);
		System.out.println(contact6);
		
		// 연락처 추가하는 거 출력
		ca.addNewContact(contact1);
		ca.addNewContact(contact2);
		
	}
	
}
