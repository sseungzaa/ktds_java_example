package com.ktdsuniversity.edu.inheritance.assignmentanswer;

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
		String contactString = super.toString();
		StringBuffer sb = new StringBuffer();
		sb.append(contactString);
		sb.append(", 생년월일: " + this.dateOfBirth);
		sb.append(", 회사명: " + this.company);
		sb.append(", 직급: " + this.title);
		sb.append(", 주소: " + this.address);
		return sb.toString();
	}
	
}	

