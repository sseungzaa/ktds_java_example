package com.ktdsuniversity.edu.file.assignmentanswer;

/*
기본 연락처 정보 클래스를 확장한 "추가 연락처" 클래스를 설계해보세요.
예> 생년월일, 회사명, 직급, 주소 등
*/

public class AdditionalContact extends Contact {
	
	// 멤버변수 생년월일, 회사명, 직급, 주소
	protected String dateOfBirth;
	protected String company;
	protected String title;
	
	// 생성자
	public AdditionalContact(String[] contactArray) {
		if (contactArray.length > 0) {
			super.profileNumber = Integer.parseInt(contactArray[0].trim());
		}
		if (contactArray.length > 1) {
			super.name = contactArray[1].trim();
		}
		if (contactArray.length > 2) {
			super.phoneNumber = contactArray[2].trim();
		}
		if (contactArray.length > 3) {
			this.dateOfBirth = contactArray[3].trim();
		}
		if (contactArray.length > 4) {
			this.company = contactArray[4].trim();
		}
		if (contactArray.length > 5) {
			this.title = contactArray[5].trim();
		}
	}
	
	
	public AdditionalContact(int profileNumber, String name, String phoneNumber,
		String dateOfBirth, String company, String title) {
		super(profileNumber, name, phoneNumber); // Contact 클래스에서 가지고 올려면 super 필요
		this.dateOfBirth = dateOfBirth;
		this.company = company;
		this.title = title;
	}

	@Override
	public String toFileFormat() {
//		return "%d,%s,%s,%s,%s,%s".formatted(super.getProfileNumber(), super.getName(), super.getPhoneNumber(), this.dateOfBirth, this.company, this.title);
		return super.toFileFormat() + ",%s,%s,%s".formatted(this.dateOfBirth == null ? "" : this.dateOfBirth,
															this.company == null ? "" : this.company,
															this.title == null ? "" : this.title);
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

