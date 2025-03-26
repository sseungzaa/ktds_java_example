package linkedlist.doubly;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	/**
	 * 데이터를 앞(head)에서부터 넣음
	 */
	public void unshift(int value) {
		// DoublyLinkedList에 데이터가 없는 상태
		if (this.length == 0) {
			Node newNode = new Node(value);
			this.head = newNode;
			this.tail = this.head;
		}
		// DoublyLinkedList에 데이터가 존재하는 상태
		else {
			Node newNode = new Node(value);
			this.head.setPrev(newNode);
			
			newNode.setNext(this.head);
			this.head = newNode;
		}
		this.length++;
	}
	
	/**
	 * 데이터를 뒤(tail)에서부터 넣음
	 */
	public void push(int value) {
		if (this.length == 0) {
			Node newNode = new Node(value);
			this.head = newNode;
			this.tail = this.head;
		} else {
			Node newNode = new Node(value);
			newNode.setPrev(this.tail);
			
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		this.length++;
	}
	
	/**
	 * DoublyLinkedList에서 head부터 값을 꺼냄
	 * @return
	 */
	public int shift() {
		if (this.length == 0) {
			throw new RuntimeException("Empty DoublyLinkedList Exception");
		}
		Node headNode = null;
		if (this.length == 1) {
			headNode = this.head;
			
			this.head = null;
			this.tail = null;
			
			Node nextNode = headNode.getNext();
			this.head = nextNode;
			
			headNode.setNext(null);
			this.length--;
		}
		if (this.head == null) {
			this.tail = null;
		}
		return headNode.getValue();
	}
	
	/**
	 * DoublyLinkedList에서 tail부터 값을 꺼냄
	 * @return
	 */
	public int pop() {
		if (this.length == 0) {
			throw new RuntimeException("Empty DoublyLinkedList Exception");
		}
		Node tailNode = this.tail;
		if (this.length == 1) {
			this.tail = null;
			this.head = null;
			this.length--;
		} else if (this.length > 1) {
			Node currentNode = this.head;
			while (currentNode.getNext() != this.tail) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
			this.tail = currentNode;
			this.length--;
		}
		return tailNode.getValue();
	}
	
	public int length() {
		return this.length;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList sll = new DoublyLinkedList();
//		sll.unshift(1);
//		sll.unshift(2);
		
		sll.push(1); // head < next: 2
		sll.push(2); // < prev: 1, next: 3
		sll.push(3); // < prev: 2, next: 4
		sll.push(4); // < prev: 3, next: 5
		sll.push(5); // tail < prev: 4
		
//		System.out.println(sll.shift()); // 1
//		System.out.println(sll.shift()); // 2
//		System.out.println(sll.shift()); // 3
//		System.out.println(sll.shift()); // 4
//		System.out.println(sll.shift()); // 5
//		System.out.println(sll.shift()); // RuntimeException("Empty DoublyLinkedList Exception")
		
//		System.out.println(sll.pop()); // 5
//		System.out.println(sll.pop()); // 4
//		System.out.println(sll.pop()); // 3
//		System.out.println(sll.pop()); // 2
//		System.out.println(sll.pop()); // 1
//		System.out.println(sll.pop()); // RuntimeException("Empty DoublyLinkedList Exception")
		
		int length = sll.length();
		System.out.println(length);
	}
}
