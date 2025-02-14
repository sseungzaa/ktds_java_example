package com.ktdsuniversity.edu.file.assignment.exceptions;

//	ContactNotFoundException 클래스 생성
//		-> contactIndex가 this.contacts.length보다 작지만 this.size보다 크거나 같을 때 throw

public class ContactNotFoundException extends RuntimeException {
	
	public ContactNotFoundException(String message) {
		super(message);
	}

}
