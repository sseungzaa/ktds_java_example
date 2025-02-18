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
		super.printContact();
		System.out.println("이메일: " + this.email);
		
	//	출력 한 줄에 다 나오게 - (이름: 친구1, 연락처: 010-5555-6666, 이메일: friends1@naver.com)
	//	System.out.print("이름: " + super.getName() + ", 연락처: " + super.getPhone());
	//	System.out.println(", 이메일: " + this.email);
		
	}
	
	// 데이터 클래스를 만들 때 기본적으로 무조건 만든다고 보면 됨
	@Override
	public String toString() {
		return "이름: " + super.getName() + ", 연락처: " + super.getPhone() + ", 이메일: " + this.email;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Contact other) {
			boolean isEquals = super.getName().equals(other.getName());
			isEquals &= super.getPhone().equals(other.getPhone());
			
			if (other instanceof EmailContact emailOther) {
				isEquals &= this.email.equals(emailOther.getEmail());
			}
			return isEquals;
		}
		return super.equals(obj);
	}

}
