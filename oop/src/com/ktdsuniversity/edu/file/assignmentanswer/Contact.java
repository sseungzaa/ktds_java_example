package com.ktdsuniversity.edu.file.assignmentanswer;

/*
수강생 여러분들의 휴대폰 연락처 앱에서 다루는 기본 연락처 정보를 가진 클래스를 설계해보세요.
예> 순번, 이름, 연락처, 사진 등
*/

public class Contact {
	
	// 멤버변수 순번, 이름, 연락처
	protected int profileNumber;
	protected String name;
	protected String phoneNumber;
	
	public Contact() {}
	
	// 생성자
	public Contact(String[] contactArray) {
		if (contactArray.length > 0) {
			this.profileNumber = Integer.parseInt(contactArray[0].trim());
		}
		if (contactArray.length > 1) {
			this.name = contactArray[1].trim();
		}
		if (contactArray.length > 2) {
			this.phoneNumber = contactArray[2].trim();
		}
	}
	
	public Contact(int profileNumber, String name, String phoneNumber) {
		this.profileNumber = profileNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// Getter
	public int getProfileNumber() {
		return this.profileNumber;
	}
	
	public String toFileFormat() {
		return "%d,%s,%s".formatted(this.profileNumber,
									this.name == null ? "" : this.name,
									this.phoneNumber == null ? "" : this.phoneNumber);
	}
	
	// 출력할려면 필요?한 부분
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("순번: " + this.profileNumber);
		sb.append(", 이름: " + this.name);
		sb.append(", 연락처: " + this.phoneNumber);
		return sb.toString();
	}
	
}
