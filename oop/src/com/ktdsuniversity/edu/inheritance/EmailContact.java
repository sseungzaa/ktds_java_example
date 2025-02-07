package com.ktdsuniversity.edu.inheritance;

public class EmailContact extends Contact {
	private String email;
	
	public EmailContact(String name, String phone, String email) {
		super(name, phone);
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public void printContact() {
		System.out.print("이름: " + super.getName() + ", 연락처: " + super.getPhone());
		System.out.println(", 이메일: " + this.email);
	}

}
// 이름: 친구1, 연락처: 010-5555-6666, 이메일: friends1@naver.com