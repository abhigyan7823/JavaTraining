package src;

public class CircluarLinkedList {
	Node head=null;
	Node tail=null;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next = null;
		}
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			tail = node;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void display() {
		Node node = head;
		if(head != null) {
			do {
				System.out.print(node.data+" ");
				node = node.next;
			}while(node != head);
		}
		System.out.println();
	}
	
	public void delete(int val) {
		Node node = head;
		if(node == null) {
			return;
		}
		if(node.data == val) {
			tail.next = head.next;
			head = head.next;
			return;
		}
		do {
			Node tamp = node.next;
			if(tamp.data == val) {
				node.next = tamp.next;
				break;
			}
			node = node.next;
		}while(node != head);
		
	}
	
	public static void main(String[] args) {
		CircluarLinkedList cl = new CircluarLinkedList();
		cl.add(4);
		cl.add(5);
		cl.add(6);
		cl.add(4);
		cl.add(2);
		cl.display();
		cl.delete(4);
		cl.display();
		cl.delete(4);
		cl.display();
		cl.delete(2);
		cl.display();
	}
}
