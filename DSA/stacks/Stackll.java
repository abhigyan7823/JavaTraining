package src.stacks;

public class Stackll {
	
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	boolean isEmpty() {
		return top == null;
	}
	
	void push(int data) {
		Node newNode = new Node(data);
		if(top == null) {
			top = newNode;
			return;
		}
		newNode.next = top;
		top = newNode;
	}
	
	int peek() {
		if(top == null) {
			System.out.println("Empty");
			return -1;
		}
		return top.data;
	}
	
	int pop() {
		if(top == null) {
			System.out.println("Empty");
			return -1;
		}
		int a = top.data;
		top = top.next;
		return a;
	}
	
	public static void main(String[] args) {
		Stackll st = new Stackll();
		System.out.println(st.isEmpty());
		st.push(2);
		System.out.println(st.isEmpty());
		st.push(3);
		st.push(9);
		st.push(4);
		st.push(1);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
}
