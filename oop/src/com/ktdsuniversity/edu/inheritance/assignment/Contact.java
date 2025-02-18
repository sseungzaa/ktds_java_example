package com.ktdsuniversity.edu.inheritance.assignment;

/*
수강생 여러분들의 휴대폰 연락처 앱에서 다루는 기본 연락처 정보를 가진 클래스를 설계해보세요.
예> 순번, 이름, 연락처, 사진 등
*/

public class Contact {
	
	// 멤버변수 순번, 이름, 연락처, 사진
	private int profileNumber;
	private String name;
	private String phoneNumber;
	private String picture;
	
	// 생성자
	public Contact(int profileNumber, String name, String phoneNumber, String picture) {
		this.profileNumber = profileNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.picture = picture;
	}
	
	// Getter
	public int getProfileNumber() {
		return this.profileNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getPicture() {
		return this.picture;
	}
	
	// 출력할려면 필요?한 부분
	@Override
	public String toString() {
		return "순번: " + this.profileNumber + ", 이름: " + this.name
		+ ", 연락처: " + this.phoneNumber + ", 사진: " + this.picture;
	}
	
}
