package com.ktdsuniversity.edu.inheritance.assignment.exceptions;

//	ContactOutOfBoundsException 클래스 생성
//		-> contactIndex가 this.contacts.length보다 크거나 같을 때 throw

public class ContactOutOfBoundsException extends RuntimeException {
	
	public ContactOutOfBoundsException(String message) {
		super(message);
	}

}
