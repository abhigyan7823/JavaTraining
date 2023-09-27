package src.LinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node pre;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
			pre = null;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.pre = null;
		if(head != null) {
			head.pre = newNode;
		}
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node tamp = head;
		while(tamp.next != null) {
			tamp = tamp.next;
		}
		tamp.next = newNode;
		newNode.pre = tamp;
		newNode.next = null;
	}
	
	public void addAfter(Node preNode,int data) {
			Node newNode = new Node(data);
			Node tamp = head;
			while(tamp.data != preNode.data) {
				tamp = tamp.next;
			}
			newNode.pre=tamp;
			newNode.next=tamp.next;
			tamp.next =newNode;
		
	}
	
	public boolean search(int data) {
		Node tamp = head;
		while(tamp != null){
			if(tamp.data == data) {
				return true;
			}
			tamp = tamp.next;
		}
		return false;
	}
	
	public void delete(Node del) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		if(head == del) {
			head = del.next;
		}
		
		if(del.next != null) {
			del.next.pre = del.pre;	
		}
		if(del.pre != null) {
			del.pre.next = del.next;
		}
	}
	
	public void print() {
		Node tamp = head;
		while(tamp != null) {
			System.out.print(tamp.data+" ");
			tamp = tamp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addFirst(2);
		dl.print();
		
		dl.addFirst(4);
		dl.print();
		
		dl.addLast(6);
		dl.print();
		
		dl.addLast(8);
		dl.print();
		
		dl.addFirst(0);
		dl.print();
		
		dl.addAfter(dl.head.next,1);
		dl.print();
		
		dl.delete(dl.head);
		dl.print();
		
		dl.delete(dl.head.next);
		dl.print();
		
		dl.delete(dl.head.next);
		dl.print();
		
		dl.delete(dl.head.next.next);
		dl.print();
		System.out.println("h");
		dl.delete(dl.head.next);
		dl.print();
		
		dl.delete(dl.head);
		dl.print();
	}

}
