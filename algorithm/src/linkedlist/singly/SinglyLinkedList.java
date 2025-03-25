package linkedlist.singly;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	/**
	 * 데이터를 앞(head)에서부터 넣음
	 */
	public void unshift(int value) {
		// SinglyLinkedList에 데이터가 없는 상태
		if (this.length == 0) {
			Node newNode = new Node(value);
			this.head = newNode;
			this.tail = this.head;
		}
		// SinglyLinkedList에 데이터가 존재하는 상태
		else {
			Node newNode = new Node(value);
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
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		this.length++;
	}
	
	/**
	 * SinglyLinkedList에서 head부터 값을 꺼냄
	 * @return
	 */
	public int shift() {
		if (this.length == 0) {
			throw new RuntimeException("Empty SinglyLinkedList Exception");
		}
		Node headNode = null;
		if (this.length > 0) {
			headNode = this.head;
			
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
	 * SinglyLinkedList에서 tail부터 값을 꺼냄
	 * @return
	 */
	public int pop() {
		if (this.length == 0) {
			throw new RuntimeException("Empty SinglyLinkedList Exception");
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
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.unshift(1); // tail
//		sll.unshift(2);
//		sll.unshift(3);
//		sll.unshift(4);
//		sll.unshift(5); // head
		
		sll.push(1); // head
		sll.push(2);
		sll.push(3);
		sll.push(4);
		sll.push(5); // tail
		
//		System.out.println(sll.shift()); // 1
//		System.out.println(sll.shift()); // 2
//		System.out.println(sll.shift()); // 3
//		System.out.println(sll.shift()); // 4
//		System.out.println(sll.shift()); // 5
//		System.out.println(sll.shift()); // RuntimeException("Empty SinglyLinkedList Exception")
		
		System.out.println(sll.pop()); // 5
		System.out.println(sll.pop()); // 4
		System.out.println(sll.pop()); // 3
		System.out.println(sll.pop()); // 2
		System.out.println(sll.pop()); // 1
//		System.out.println(sll.pop()); // RuntimeException("Empty SinglyLinkedList Exception")
		
		int length = sll.length();
		System.out.println(length);
	}
}
