package src.prc131_140;

public class Stack {
	
	class Node{
		int data;
		Node next;	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node top = null;
	public void push(int data) {
		Node newNode = new Node(data);
		if(top == null) {
			top = newNode;
			return;
		}
		newNode.next = top;
		top = newNode;
	}
	
	public int pop() {
		if(top == null) {
			return -1;
		}
		Node temp = top;
		top = top.next;
		return temp.data;
	}
	
	public int peek() {
		if(top == null) {
			return -1;
		}
		return top.data;
	}
	
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		System.out.println(st.peek());
		st.push(2);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
