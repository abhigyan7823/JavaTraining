package src.queues;

public class Queuell {
	Node front = null;
	Node rear = null;
	
	class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public boolean isEmpty() {
		return front==null &&  rear == null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(rear == null) {
			rear = newNode;
			front = newNode;
			return;
		}
		rear.next = newNode;
		rear = rear.next;
	}
	
	public int remove() {
		if (front == null) {
			System.out.println("Empty");
			return 0;
		}
		if (front == rear) {
			rear = null;
		}
		int a = front.data;
		front = front.next;
		return a;

	}
	
	public int peek() {
		if(front == null ) {
			System.out.println("Empty");
			return 0;
		}
		return front.data;
		
	}
	
	public static void main(String[] args) {
		Queuell q = new Queuell();
		q.add(12);
		q.add(13);
		q.add(14);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}
