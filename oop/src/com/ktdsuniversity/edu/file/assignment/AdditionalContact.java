package com.ktdsuniversity.edu.file.assignment;

/*
기본 연락처 정보 클래스를 확장한 "추가 연락처" 클래스를 설계해보세요.
예> 생년월일, 회사명, 직급, 주소 등
*/

public class AdditionalContact extends Contact {
	
	// 멤버변수 생년월일, 회사명, 직급, 주소
	private String dateOfBirth;
	private String company;
	private String title;
	
	// 생성자
	
//	public AdditionalContact(String[] additionalContactArray) {
//		super(contactArray);
//		this.dateOfBirth = additionalContactArray[3];
//		this.company = additionalContactArray[4];
//		this.title = additionalContactArray[5];
//	}
	
	
	public AdditionalContact(int profileNumber, String name, String phoneNumber,
		String dateOfBirth, String company, String title) {
		super(profileNumber, name, phoneNumber); // Contact 클래스에서 가지고 올려면 super 필요
		this.dateOfBirth = dateOfBirth;
		this.company = company;
		this.title = title;
	}

	public String toFileFormat() {
		return "%d,%s,%s,%s,%s,%s".formatted(super.getProfileNumber(), super.getName(), super.getPhoneNumber(), this.dateOfBirth, this.company, this.title);
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
		return sb.toString();
	}
	
}	

