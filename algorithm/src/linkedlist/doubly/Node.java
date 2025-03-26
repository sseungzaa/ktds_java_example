package linkedlist.doubly;

/**
 * DoublyLinkedList의 값을 표현할 클래스
*/

public class Node {
	/**
	 * DoublyLinkedList 아이템의 값
	*/
	private int value;
	
	/**
	 * 현재 아이템의 다음 값
	*/
	private Node next;
	
	/**
	 * 현재 아이템의 이전 값
	*/
	private Node prev;
	
	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public Node getNext() {
		return this.next;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
