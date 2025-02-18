package com.ktdsuniversity.edu.inheritance.assignmentanswer;

import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.ContactNotFoundException;
import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.ContactOutOfBoundsException;
import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.NullContactException;
import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.ContactAppException;

public class ContactMain {

	public static void run() {
		
		ContactAppsInterface ca = new InterfacesContactApp(6);
		
		// 0
		ca.addNewContact( new Contact(5, "유재석", "010-5555-5555", "p5.jpg") );
		
		// 1
		ca.addNewContact( new AdditionalContact(4, "박명수", "010-4444-4444", "p4.jpg", "1970-09-27", "무한상사", "차장", "서울") );
		
		// 2
		ca.addNewContact( new Contact(6, "정준하", "010-6666-6666", "p6.jpg") );
		
		// 3
		ca.addNewContact( new AdditionalContact(7, "정형돈", "010-7777-7777", "p7.jpg", "1978-03-15", "무한상사", "대리", "서울") );

		// 4
		ca.addNewContact( new Contact(3, "노홍철", "010-3333-3333", "p3.jpg") );
		
		// 5
		ca.addNewContact( new AdditionalContact(8, "하동훈", "010-8888-8888", "p8.jpg", "1979-08-20", "무한상사", "사원", "서울") );
		
		System.out.println("정렬 전");
		
		for (int i = 0; i < 6; i++) {
			try {
				Contact contact = ca.getContactAt(i);
				System.out.println(contact);
			}
			catch (ContactNotFoundException cnfe) {
				System.out.println("조회 실패! " + cnfe.getMessage());
			}
			catch (ContactOutOfBoundsException coobe) {
				System.out.println("조회 실패! " + coobe.getMessage());
			}
			catch (NullContactException nce) {
				System.out.println("조회 실패! " + nce.getMessage());
			}
			
		}
		/*
		Contact contact1 = ca.getContactAt(0);
		System.out.println(contact1);
		
		Contact contact2 = ca.getContactAt(1);
		System.out.println(contact2);
		
		Contact contact3 = ca.getContactAt(2);
		System.out.println(contact3);
		
		Contact contact4 = ca.getContactAt(3);
		System.out.println(contact4);
		
		try {
			Contact contact5 = ca.getContactAt(4);
			System.out.println(contact5);
		}
		catch (ContactOutOfBoundsException coobe) {
			System.out.println("조회 실패! " + coobe.getMessage());
		}
		
		Contact contact5 = ca.getContactAt(4);
		System.out.println(contact5);
		
		Contact contact6 = ca.getContactAt(5);
		System.out.println(contact6);
		*/
		
		ca.sort();
		
		// 3번 인덱스 연락처 삭제
		ca.remove(3);
		
		System.out.println("정렬 후");
		
		for (int i = 0; i < 6; i++) {
			try {
				Contact contact = ca.getContactAt(i);
				System.out.println(contact);
			}
//			catch (Throwable coobe) { // 절대 사용 금지.
//				System.out.println("조회 실패! " + cooe.getMessage());
//			}
//			catch (Exception cooe) { // 절대 사용 금지.
//				System.out.println("조회 실패! " + cooe.getMessage());
//			}
//			catch (RuntimeException cooe) { // 절대 사용 금지.
//				System.out.println("조회 실패! " + cooe.getMessage());
//			}
			catch (ContactNotFoundException | ContactOutOfBoundsException | NullContactException exception) {
				//System.out.println("조회 실패! " + exception.getMessage());
				throw new ContactAppException(exception.getMessage(), exception);
			}
//			catch (ContactNotFoundException cnfe) {
//				System.out.println("조회 실패! " + cnfe.getMessage());
//			}
//			catch (ContactOutOfBoundsException coobe) {
//				System.out.println("조회 실패! " + coobe.getMessage());
//			}			
//			catch (NullContactException nce) {
//				System.out.println("조회 실패! " + nce.getMessage());
//			}
		}	
	}		
	
	public static void throwException() {
		try {
			throw new Exception("예외 받아랏!!!");
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
	
	public static void main(String[] args) {
		throwException();
		
		// catch한 Exception 예외를 RuntimeException으로 변환해서 던지기
		// 위 코드를 호출하는 코드에서는  try ~ catch  불필요.
		
		try {
			run();
		}
		catch(ContactAppException cae) {
			System.out.println(cae.getMessage());
			Throwable cause = cae.getCause();
			cause.printStackTrace();
		}
	}
			
		/*
		contact1 = ca.getContactAt(0);
		System.out.println(contact1);
		
		contact2 = ca.getContactAt(1);
		System.out.println(contact2);
		
		contact3 = ca.getContactAt(2);
		System.out.println(contact3);
		
		contact4 = ca.getContactAt(3);
		System.out.println(contact4);
		
		contact5 = ca.getContactAt(4);
		System.out.println(contact5);
		
		contact6 = ca.getContactAt(5);
		System.out.println(contact6);
		*/
		
}
