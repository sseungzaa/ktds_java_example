package com.ktdsuniversity.edu.inheritance.assignment;

public class ContactApp {
	
	// 연락처를 관리해줄 배열
	private Contact[] contacts;
	
	// contacts배열에 들어간 연락처의 개수
	private int size;
	
	// contactMaxCount: contacts배열에 들어갈 수 있는 최대 연락처 개수 (직접 설정)
	public ContactApp(int contactMaxCount) {
		this.contacts = new Contact[contactMaxCount];
	}
	
	/* ContactApp 클래스에 연락처를 추가하는 메소드를 만드세요.
	this.contacts[] 배열에 파라미터로 전달받은 Contact newContact를 차례대로 할당해야 합니다.
	매번 할당할 때마다 size는 1씩 증가합니다.
	*/
	public void addNewContact(Contact newContact) {
		// 배열에 남는 자리가 있는지 체크해야 되니까
		if (size < this.contacts.length) {
			this.contacts[this.size] = newContact; // 새 연락처 추가 = newContact를 contacts배열에 할당
			this.size++; // 매번 할당할 때마다 size는 1씩 증가
			System.out.println("다음과 같은 내용의 연락처를 추가했습니다. " + newContact);
		}
		else {
			System.out.println("더 이상 연락처를 추가할 수 없습니다.");
		}
	}
	
	/* ContactApp 클래스에 연락처를 반환하는 메소드를 만드세요.
	파라미터로 전달받은 contactIndex에 해당하는 연락처가 조회되어야 합니다.
	*/
	public Contact getContactAt(int contactIndex) {
		// 인덱스가 0 이상 size 미만이여야 되니까
		if (contactIndex >= 0 && contactIndex < size) {
			return this.contacts[contactIndex];
		}
		else {
			System.out.println("올바른 인덱스 범위가 아닙니다.");
		}
		return null; // null 반환 안 하면 오류
	}
	
}
