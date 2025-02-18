package com.ktdsuniversity.edu.inheritance.assignment;

/*
기본 연락처 정보 클래스를 확장한 "추가 연락처" 클래스를 설계해보세요.
예> 생년월일, 회사명, 직급, 주소 등
*/

public class AdditionalContact extends Contact {
	
	// 멤버변수 생년월일, 회사명, 직급, 주소
	private String dateOfBirth;
	private String company;
	private String title;
	private String address;
	
	// 생성자
	public AdditionalContact(int profileNumber, String name, String phoneNumber, String picture,
		String dateOfBirth, String company, String title, String address) {
		super(profileNumber, name, phoneNumber, picture); // Contact 클래스에서 가지고 올려면 super 필요
		this.dateOfBirth = dateOfBirth;
		this.company = company;
		this.title = title;
		this.address = address;
	}
	
	// 출력할려면 필요?한 부분
	@Override
	public String toString() {
		return "순번: " + super.getProfileNumber() + ", 이름: " + super.getName()
		+ ", 연락처: " + super.getPhoneNumber() + ", 사진: " + super.getPicture()
		+ ", 생년월일: " + this.dateOfBirth + ", 회사명: " + this.company + ", 직급: " + this.title + ", 주소: " + this.address;
	}
	
}

