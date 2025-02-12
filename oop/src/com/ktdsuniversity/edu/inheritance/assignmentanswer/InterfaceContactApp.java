package com.ktdsuniversity.edu.inheritance.assignmentanswer;

import com.ktdsuniversity.edu.inheritance.assignment.Contact;

public class InterfaceContactApp implements ContactAppInterface {
	
	// contacts배열에 들어간 연락처의 개수
	private int size;
	private Contact[] contacts;
	
	// contactMaxCount : contacts배열에 들어갈 수 있는 최대 연락처 개수
	public InterfaceContactApp(int contactMaxCount) {
		this.contacts = new Contact[contactMaxCount];
	}
	
	/* ContactApp 클래스에 연락처를 추가하는 메소드를 만드세요.
	this.contacts[] 배열에 파라미터로 전달받은 Contact newContact 를 차례대로 할당해야 합니다.
	매번 할당할 때마다 size는 1씩 증가합니다.
	*/
	@Override
	public void addNewContact(Contact newContact) {
		this.contacts[this.size] = newContact;
		this.size++;
	}
	
	/* ContactApp 클래스에 연락처를 반환하는 메소드를 만드세요.
	파라미터로 전달받은 contactIndex에 해당하는 연락처가 조회되어야 합니다.
	*/
	@Override
	public Contact getContactAt(int contactIndex) {
		return this.contacts[contactIndex];
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
