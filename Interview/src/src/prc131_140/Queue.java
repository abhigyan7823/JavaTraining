package src.prc131_140;

public class Queue {
	class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static Node head = null;
	static Node tail = null;
	
	public static boolean isEmpty() {
		return (head == null && tail==null);
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			tail = head = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		int front = head.data;
		if(head == tail) {
			tail = null;
		}
		head = head.next;
		return front;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		return head.data;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}
