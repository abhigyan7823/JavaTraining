package src.queues;

public class Queue {
	final int max = 100;
	int[] a = new int[max];
	int front =-1;
	public boolean isEmpty() {
		return front == -1;
	}
	
	public void Enqueue(int data) {
		if(front == -1) {
			a[++front] = data;
		}
		else {
			a[++front] = data;
		}
	}
	
	public int get() {
		if(front == -1) {
			System.out.println("Empty");
			return -1;
		}
		else {
			return a[0];
		}
	}
	
	public int Dequeue() {
		if(front == -1) {
			System.out.println("Empty");
			return -1;
		}
		else {
			int f = a[0];
			for(int i=0;i<front-1;i++) {
				a[i] = a[i+1];
			}
			return f; 
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.Enqueue(1);
		System.out.println(q.isEmpty());
		System.out.println(q.get());
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		System.out.println(q.Dequeue());
		System.out.println("get"+q.get());
		System.out.println(q.Dequeue());
		
		System.out.println(q.Dequeue());
	}
}

