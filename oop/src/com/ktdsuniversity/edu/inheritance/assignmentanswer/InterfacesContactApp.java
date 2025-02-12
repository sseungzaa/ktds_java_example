package com.ktdsuniversity.edu.inheritance.assignmentanswer;

import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.ContactNotFoundException;
import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.ContactOutOfBoundsException;
import com.ktdsuniversity.edu.inheritance.assignmentanswer.exceptions.NullContactException;

public class InterfacesContactApp implements ContactAppsInterface {
	
	// 연락처를 관리해줄 배열
	private Contact[] contacts;
	
	// contacts배열에 들어간 연락처의 개수
	private int size;
	
	// contactMaxCount: contacts배열에 들어갈 수 있는 최대 연락처 개수 (직접 설정)
	public InterfacesContactApp(int contactMaxCount) {
		if (contactMaxCount > 0) {
			this.contacts = new Contact[contactMaxCount];
		}
		else {
			this.contacts = new Contact[10];
		}
	}
	
	@Override
	public void clean() {
		if (this.size > 0) {
			for (int i = 0; i < this.size; i++) {
				this.contacts[i] = null;
			}
			this.size = 0;
		}
	}
	
	/* ContactApp 클래스에 연락처를 추가하는 메소드를 만드세요.
	this.contacts[] 배열에 파라미터로 전달받은 Contact newContact를 차례대로 할당해야 합니다.
	매번 할당할 때마다 size는 1씩 증가합니다.
	*/
	@Override
	public void addNewContact(Contact newContact) {
		if (newContact != null) {
			// 배열에 남는 자리가 있는지 체크해야 되니까
			if (this.size < this.contacts.length) {
				this.contacts[this.size] = newContact; // 새 연락처 추가 = newContact를 contacts배열에 할당
				this.size++; // 매번 할당할 때마다 size는 1씩 증가
//				System.out.println("다음과 같은 내용의 연락처를 추가했습니다. " + newContact);
			}
//			else {
//				System.out.println("더 이상 연락처를 추가할 수 없습니다.");
//			}
		}
	}
	
	@Override
	public void remove(int contactIndex) {
		if (contactIndex >= 0 && contactIndex < this.size) {
			this.contacts[contactIndex] = null;
		}
	}
	
	/* ContactApp 클래스에 연락처를 반환하는 메소드를 만드세요.
	파라미터로 전달받은 contactIndex에 해당하는 연락처가 조회되어야 합니다.
	*/
	@Override
	public Contact getContactAt(int contactIndex) {
		
		// ContactNotFoundException 클래스 생성
		// -> contactIndex가 this.contacts.length보다 작지만 this.size보다 크거나 같을 때 throw
		// 연락처 배열에 데이터가 채워져 있지 않은 상태
		// 아직 연락처가 채워져 있지 않은 인덱스를 요청
		// contactIndex: 0 ~9
		// this.contacts.length = 10
		// this.size = 6
		if (contactIndex < this.contacts.length && contactIndex >= this.size) {
			throw new ContactNotFoundException("인덱스 " + contactIndex + " 은(는) 연락처가 아직 채워지지 않은 인덱스입니다.");
		}
		
		// ContactOutOfBoundsException 클래스 생성
		// -> contactIndex가 this.contacts.length보다 크거나 같을 때 throw
		// 연락처 배열의 마지막 인덱스보다 큰 연락처를 요청했을 때
		if (contactIndex >= this.contacts.length) {
			throw new ContactOutOfBoundsException("인덱스 " + contactIndex + " 은(는) 연락처 크기를 벗어나는 인덱스입니다. 올바른 인덱스를 요청하세요.");
		}
		
		// NullContactException 클래스 생성
		// -> contactIndex가 this.size보다 작지만 contactIndex에 저장된 값이 null일 때 throw
		// 삭제된 인덱스를 요청한 경우
		if (contactIndex < this.size && this.contacts[contactIndex] == null) {
			throw new NullContactException("인덱스 " + contactIndex + " 은(는) 삭제된 연락처입니다.");
		}
		
		// 인덱스가 0 이상 size 미만이여야 되니까
//		if (contactIndex >= 0 && contactIndex < this.contacts.length) {
		return this.contacts[contactIndex];
//		}
		
//		else {
//			System.out.println("올바른 인덱스 범위가 아닙니다.");
//		}
//		return null; // null 반환 안 하면 오류
	}
	
	/* ContactApp 클래스에 연락처를 순번대로 오름차순 정렬하는 메소드를 만드세요.
	정렬 알고리즘은 Bubble Sort 혹은 Selection Sort를 사용합니다.
	Bubble Sort : 배열의 처음부터 끝까지 반복하며 최대값을 가장 마지막으로 정렬시키는 정렬 방법.
	Selection Sort : 배열의 처음부터 끝까지 반복하며 최소값을 가장 앞으로 정렬시키는 방법.
	매 반복 때마다 최소값을 가진 인덱스를 찾아 앞으로 정렬시킨다.
	값 비교는 contact.get순번()을 통해서 합니다.
	*/
	@Override
	public void sort() {
		// Bubble Sort
		for ( int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size - 1 - i; j++) {
				if (this.contacts[j + 1].getProfileNumber() < this.contacts[j].getProfileNumber()) {
					Contact temp = this.contacts[j];
					this.contacts[j] = this.contacts[j + 1];
					this.contacts[j + 1] = temp;
				}
			}			
		}
	}	
}
