package src.queues;

public class CQueue {
	
	final int size=100;
	int[] a = new int[size];
	int front = -1;
	int rear = -1;
	
	boolean isEmpty() {
		return front == -1 && rear == -1;
	}
	
	public void add(int data) {
		if(front == size && rear == 0) {
			System.out.println("FUll");
			return;
		}
		else {
			if(front == -1) {
				front = 0;
			}
			rear = rear+1 % size;
			a[rear] = data;
		}
	}
	
	public int remove() {
		if(front == -1 && rear == -1) {
			System.out.println("Empty");
			return 0;
		}
		int res = a[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		else {
			front = front +1 % size;
		}
		return res;
	}
	
	public int peek() {
		if(front == -1 && rear == -1) {
			System.out.println("Empty");
			return 0;
		}
		return a[front];
	}
	
	public static void main(String[] args) {
		CQueue q = new CQueue();
		q.add(12);
		q.add(13);
		q.add(14);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
	}
}
